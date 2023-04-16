package com.example;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class HTTPClient {

    public static void main(String[] args) {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://jsonplaceholder.typicode.com/todos"))
                .build();
        HttpResponse<String> response = null;
        try {
            response = client.send(request, BodyHandlers.ofString());
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println(response.body());
        String jsonData = response.body();
        ObjectMapper objectMapper = new ObjectMapper();
        List<Todos> todosList = null;
        try {
            todosList = Arrays.asList(objectMapper.readValue(jsonData, Todos[].class));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        // Print the title field of the first object
        String title = todosList.get(0).getTitle();
        System.out.println(title);

        for (Todos td: todosList){
            System.out.println(td.getTitle());
            System.out.println(td.getUserId());
        }

    }

}

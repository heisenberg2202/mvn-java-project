package com.example;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

public class RequestExample {
    public static void main(String[] args) {
        HttpClient client = HttpClient.newBuilder().connectTimeout(Duration.ofSeconds(10)).build();

        HttpResponse response = null;

        try {
            String endpoint = "https://postman-echo.com/get";
            URI uri = URI.create(endpoint + "?foo=bar&foo2=bar2");

            HttpRequest request = HttpRequest.newBuilder().uri(uri).build();
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println(response);

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

        System.out.println("Status code :" + response.statusCode());
        System.out.println("Response body:" + response.body());

    }
}

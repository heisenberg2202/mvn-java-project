package com.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonDemo {

    public static void main(String[] args) {
        getJson(new User("Ayush", "Smith",21,new Address("3rd Cross", "TX","State","53532")));
    }

    private static void getJson(User user) {
        ObjectMapper mapper = new ObjectMapper();
        String json = null;
        try {
             json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(user);
        } catch (JsonProcessingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        System.out.println(json);
        getObj(json);
    }

    private static void getObj(String json) {
        ObjectMapper mapper = new ObjectMapper();
        User user = null;
        try {
             user = mapper.readValue(json, User.class);
        } catch (JsonMappingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (JsonProcessingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println(user.getAge());
        System.out.println(user.getFirstName());
        System.out.println(user.getLastName());
        System.out.println(user.getAddress().getCity());
    }
    
}


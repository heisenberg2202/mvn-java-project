package com.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GSONDemo {
    public static void main(String[] args) {
        getJson(new Student(12345, "John", "Smith"));
    }


    private static void getJson(Student student) {
        // Gson gson = new Gson();   - Without pretty printing
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json  = gson.toJson(student);
        System.out.println(json);
        getObject(json);
    }


    private static void getObject(String json){
        Gson gson = new Gson();
        Student student = gson.fromJson(json, Student.class);
        System.out.println(student.getId());
        System.out.println(student.getfName());
        System.out.println(student.getlName());
    }
    
}





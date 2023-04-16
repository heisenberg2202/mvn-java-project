package com.example;

import java.util.HashMap;



public class MapExamples {
    public static void main(String[] args) {
        HashMap<Integer, Student> map = new HashMap<>();
        Student s1 = new Student(12345, "John", "Smith");
        Student s2 = new Student(24680, "Jane", "Smith");
        Student s3 = new Student(13579, "Adam", "Smith");
        Student s4 = new Student(67890, "Tom", "Jones");
        map.put(s1.getId(), s1);
        map.put(s2.getId(), s2);
        map.put(s3.getId(), s3);
        map.put(s4.getId(), s4);

        Student s0 = map.get(12345);
        System.out.println(s0.getfName() + " " + s0.getlName());

    }
}

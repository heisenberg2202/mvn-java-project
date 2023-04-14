package com.example;

import java.util.HashMap;
class Student{
    int id;
    String fName;
    String lName;

    public Student(int id, String fName, String lName) {
        this.id = id;
        this.fName = fName;
        this.lName = lName;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getfName() {
        return fName;
    }
    public void setfName(String fName) {
        this.fName = fName;
    }
    public String getlName() {
        return lName;
    }
    public void setlName(String lName) {
        this.lName = lName;
    }
    
}
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
        

        
    }
}

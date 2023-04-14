package com.example;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadDataFromJson {
    public static void main(String[] args) throws IOException, ParseException {

        JSONParser jsonparser = new JSONParser();
        FileReader reader = new FileReader("D:\\Codes\\mavenproject\\first-app\\src\\json\\employee.json");

        Object obj = jsonparser.parse(reader);
        JSONObject empjson = (JSONObject) obj;

        String firstName = (String) empjson.get("firstName");
        String lName = (String) empjson.get("lastName");
        System.out.println(firstName + " " + lName);
        
        JSONArray array = (JSONArray) empjson.get("address");
        for (int i = 0; i < array.size(); i++) {
            JSONObject address = (JSONObject) array.get(i);
            String street = (String) address.get("street");
            String city = (String) address.get("city");
            String state = (String) address.get("state");
            System.out.println(street + " " + city + " " + state);

        }
    }

}

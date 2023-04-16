package com.example;
import java.io.File;
import java.io.IOException;
import com.example.RandomUserPOJO.Example;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JSONfromBean {
        //Conver json data to bean 
    public static void main(String[] args)  {
        ObjectMapper mapper = new ObjectMapper();
        Example result;
        try {
            result = mapper.readValue(new File("D:\\Codes\\mavenproject\\first-app\\src\\json\\randomUser.json"), Example.class);
            System.out.println(result.getResults().get(0).getName().getFirst()+" "+result.getResults().get(0).getName().getLast());
            System.out.println(result.getResults().get(0).getGender());
            System.out.println(result.getResults().get(0).getEmail());
            System.out.println(result.getResults().get(0).getNat());
            System.out.println(result.getResults().get(0).getPhone());
            System.out.println(result.getResults().get(0).getDob().getAge());
            System.out.println(result.getResults().get(0).getLocation().getCountry());
        }catch(JsonParseException e){
            e.printStackTrace();
        }
        catch (JsonMappingException e) {
            e.printStackTrace();
        } 
        catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
       

    }

    
}
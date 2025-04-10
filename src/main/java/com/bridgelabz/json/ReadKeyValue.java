package com.bridgelabz.json;


import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;

public class ReadKeyValue {
    public static void main(String[] args) {
        try {
            ObjectMapper obj=new ObjectMapper();
            JsonNode jsonNode = obj.readTree(new File("studentInfo.json"));

            String s=obj.writeValueAsString(jsonNode);
            System.out.println(s);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
package com.bridgelabz.json;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class ReadJsonField {
    public static void main(String[] args) {
        try{
            ObjectMapper mapper = new ObjectMapper();

            // Load JSON from file
            JsonNode root = mapper.readTree(new File("data.json"));

            // Extract specific fields
            String name = root.path("name").asText();
            String email = root.path("email").asText();

            // Display values
            System.out.println("Name: " + name);
            System.out.println("Email: " + email);

        } catch (Exception e){
            e.printStackTrace();
        }
    }
}

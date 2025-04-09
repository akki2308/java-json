package com.bridgelabz.json;

import org.json.JSONObject;

public class WritingJsonDataInJava {
    public static void main(String[] args) {
        // Creating a JSON Object
        JSONObject obj = new JSONObject();

        // Adding data
        obj.put("name", "Aarav");
        obj.put("age", 22);
        obj.put("isStudent", true);

        // Nested JSON Object
        JSONObject address = new JSONObject();
        address.put("city", "Delhi");
        address.put("zip", "110001");

        obj.put("address", address);

        // Output JSON as String
        System.out.println(obj.toString(1)); // 2 is indentation
    }
}

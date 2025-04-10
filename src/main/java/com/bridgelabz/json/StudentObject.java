package com.bridgelabz.json;


import org.json.JSONArray;
import org.json.JSONObject;

public class StudentObject {
    public static void main(String[] args) {

        JSONArray arr=new JSONArray();
        arr.put("English");
        arr.put("History");
        arr.put("Economics");

        JSONObject obj=new JSONObject();
        obj.put("name", "Akshit Chauhan");
        obj.put("age", 21);
        obj.put("subjects", arr);

        System.out.println(obj);
    }
}


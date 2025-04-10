package com.bridgelabz.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.List;

class Student{
    private String name;
    private int age;

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    // Getters
    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }
}

public class ConvertList {
    public static void main(String[] args) throws JsonProcessingException {
        List<Student> list = new ArrayList<>();

        list.add(new Student("Akshit Chauhan", 21));
        list.add(new Student("Harshit", 24));
        list.add(new Student("Harsh", 21));
        list.add(new Student("Dushyant", 25));

        ObjectMapper mapper = new ObjectMapper();

        String jsonArray = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(list);

        // Print JSON Array
        System.out.println("JSON Array: ");
        System.out.println(jsonArray);
    }
}
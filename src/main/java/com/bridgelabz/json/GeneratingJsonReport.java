package com.bridgelabz.json;

import com.fasterxml.jackson.databind.ObjectMapper;
        import com.fasterxml.jackson.core.type.TypeReference;
        import java.io.File;
        import java.util.List;

public class GeneratingJsonReport {

    public static class User {
        public int id;
        public String name;
        public String position;
        public double salary;
    }
    public static void main(String[] args) {
        try {
            ObjectMapper mapper = new ObjectMapper();

            // JSON file ko List<User> me read karna
            List<User> users = mapper.readValue(
                    new File("user.json"),
                    new TypeReference<List<User>>() {}
            );

            // Print each user using for-each loop
            for (User u : users) {
                System.out.println("ID: " + u.id);
                System.out.println("Name: " + u.name);
                System.out.println("Position: " + u.position);
                System.out.println("Salary: " + u.salary);
                System.out.println("----------------------");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

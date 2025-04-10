package com.bridgelabz.json;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.XML;
import java.nio.file.Files;
import java.nio.file.Paths;

public class JsonToXml {
    public static void main(String[] args) {

        try {
            String s = new String(Files.readAllBytes(Paths.get("studentInfo.json"))).trim();
            String xml="";
            if(s.startsWith("{")){
                JSONObject obj=new JSONObject(s);
                xml = XML.toString(obj);
            }
            else if (s.startsWith("[")) {
                JSONArray arr = new JSONArray(s);
                xml=XML.toString(arr);
            }
            else{
                System.out.println("Error");
            }
            System.out.println("Converted XML:\n" + xml);

        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}



package com.bridgelabz.json;

import org.json.JSONObject;

class Car{
    private String brand;
    private String model;
    private int year;

    Car(String brand, String model, int year){
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    //Getters
    public String getBrand(){
        return  brand;
    }
    public String getModel(){
        return model;
    }
    public int getYear(){
        return year;
    }

}

public class ObjectToJson {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Supra", 2002);

        JSONObject json = new JSONObject();

        json.put("brand", car.getBrand());
        json.put("model", car.getModel());
        json.put("year", car.getYear());

        System.out.println("Car as a JSON" );
        System.out.println(json.toString(4));
    }
}

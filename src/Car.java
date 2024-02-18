package src;

import java.security.PrivateKey;

public class Car {
    private String name;
    private String color;
    private String model;
    private int doors;

    public Car(String name, String model, String color, int doors){
        // parameterized constructor //
        this.name = name;
        this.model = model;
        this.color = color;
        this.doors = doors;
    }

    public void describe_Car(){
        System.out.println("The car: "+this.name);
        System.out.println("Car model is: " + this.model);
        System.out.println("Car's color is: " + this.color);
        System.out.println("Car has doors: " + this.doors);
    }
}

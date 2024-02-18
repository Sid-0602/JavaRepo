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

    //Using multiple constructors depending on the parameters passed into const:
    public Car(){
        name="YET TO BE SET";
        model = "YET TO BE SET";
        color = "YET TO BE SET";
        doors = 0;
    }

    public Car(String name){
        this.name = name;
        model = "YET TO BE SET";
        color = "YET TO BE SET";
        doors = 0;
    }

    public Car(String name, String model){
        this.name = name;
        this.model = model;
        color = "YET TO BE SET";
        doors = 0;
    }

    public Car(String name, String model, String color){
        this.name = name;
        this.model = model;
        this.color = color;
        doors = 0;
    }

    public static void displayData(){
        System.out.println("Displaying data!");
    }

    //THESE ARE METHODS Inside Car class.

    public void describe_Car(){
        System.out.println("The car: "+this.name);
        System.out.println("Car model is: " + this.model);
        System.out.println("Car's color is: " + this.color);
        System.out.println("Car has doors: " + this.doors);
    }

    public void move(){
        System.out.println("The car "+ this.name + " is moving");
    }

    public void stop(){
        System.out.println("The car " + this.name + " has stopped");
    }
    
    //getters and setter for private attributes: 
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name= name;
        return;
    }
    
    public String getModel(){
        return model;
    }
    
    public void setModel(String model){
        this.model = model;
        return;
    }
    
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
        return;
    }
    
    public int getDoors(){
        return doors;
    }
    public void setDoors(int doors){
        this.doors = doors;
    }
    
}

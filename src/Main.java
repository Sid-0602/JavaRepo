package src;

import javax.swing.*;

//OOPS in Java using example of vehicle:
public class Main {
    public static void main(String[] args){
        System.out.println("Hello OOPS in Java!");

        Car car1 = new Car("Tesla", "S PLADE","white",4); //this is an object created on basis of class "CAR"
        Car car2 = new Car("Ford","MUstang","Red",4);
        Car car3  = new Car(); //no parameters, hence an default constructor is called.


        //getters used for extracting attributes:

        car1.move();
        car1.stop();
        System.out.println(car1.getName());
        System.out.println(car1.getModel());
        System.out.println(car1.getColor());
        System.out.println(car1.getDoors());
        System.out.println("\n");

        car2.move();
        car2.stop();
        System.out.println(car2.getName());
        System.out.println(car2.getModel());
        System.out.println(car2.getColor());
        System.out.println(car2.getDoors());
        System.out.println("\n");

        //setter used to change car name:
        System.out.println("The car1 name is changed to: " + car1.getName());
        car1.setName("Mercedes");
        System.out.println("The car1 name after changing: " + car1.getName());

        System.out.println("\n");

        car3.move();
        car3.stop();
        System.out.println(car3.getName());
        System.out.println(car3.getModel());
        System.out.println(car3.getColor());
        System.out.println(car3.getDoors());
        System.out.println("\n");

        Truck truck1 = new Truck("Mercedes Truck","Heavy Duty","blue",3,5000);
        Plane plane1 = new Plane("Boeing","747","white",10,4);

        truck1.move();
        truck1.stop();

        plane1.move();
        plane1.stop();


    }

    public static class Vehicle{
        private String name;
        private String model;
        private String color;
        private int doors;

        public Vehicle(String name, String model, String color, int doors) {
            this.name = name;
            this.model = model;
            this.color = color;
            this.doors = doors;
        }

        //methods common to all vehicles:
        public void move(){
            System.out.println("This vechile "+ this.name + " is moving!");
        }

        public void stop(){
            System.out.println("This vehicle "+this.name + " has stopped");
        }
    }

    public static class Truck extends Vehicle{
        private int load_capacity;

        public Truck(String name, String model, String color, int doors, int load_capacity) {
            super(name, model, color, doors);
            this.load_capacity = load_capacity;
        }
    }


    public static class Plane extends Vehicle{
        private int engines;

        public Plane(String name, String model, String color, int doors,int engines){
            super(name, model, color, doors);
            this.engines = engines;
        }

        @Override
        public void move(){
            System.out.println("Plane Moving by flying!");
        }

        public void stop(){
            System.out.println("Plane Stopped by landing!");
        }
    }

}

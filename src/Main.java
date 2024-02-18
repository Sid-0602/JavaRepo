package src;
//OOPS in Java using example of vehicle:
public class Main {
    public static void main(String [] args){
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

    }

}

package src;

public class Main {
    public static void main(String [] args){

        System.out.println("Welcome to functions!");
        helloFunction();
        System.out.println("The sum of numbers: " +  addFunc(4,5));
        sayHello("Siddhant",22,true);
        sayHello("Riya",22,false);
    }

    //functions are also called methods:
    public static void helloFunction(){
        System.out.println("Hello from hello function!");
    }

    public static void sayHello(String name, int age, boolean isMale){
        System.out.println("Name of person: "+ name);
        System.out.println("Age of person: " + age);
        System.out.println("Is The person male? " + isMale);


    }

    //return value is not null (int in this case)
    public static int addFunc(int x, int y){
            return (x+y);
    }


}

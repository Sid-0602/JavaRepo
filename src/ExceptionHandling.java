package src;
import java.util.Scanner;
import java.net.Inet4Address;

public class ExceptionHandling {
    public static void main(String[] args){
        try{
            System.out.println("Please a number: ");
            Scanner sc = new Scanner(System.in);
            String stringInt = sc.nextLine();
            int myInt = Integer.parseInt(stringInt);
            System.out.println(myInt);

            return;

        }catch (Exception e){
            System.out.println("EXCEPTION: " + e);
            return;
        }finally {
            System.out.println("In the finally block!");
        }
    }
}

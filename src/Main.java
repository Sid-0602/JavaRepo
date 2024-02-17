package src;

import java.util.function.LongFunction;

//this is class Main (publically available)
public class Main {
    //this function is entry-point of Java Code.
    public static void main(String [] args) {
        System.out.println("Hello Java!");

        //variables and datatypes:
        String name = "Siddhant";
        int age = 20;
        boolean isMale = true;

        System.out.println("Hello " + name);
        System.out.println("Age is: " + age);
        System.out.println("Is Male? " + isMale);

        // DataTypes:

        //integer:
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        System.out.println("The max value for int: " + max);
        System.out.println("The min value for int: " + min);

        //byte:
        byte maxByteValue = Byte.MAX_VALUE;
        byte minByteValue = Byte.MIN_VALUE;

        System.out.println("The maxByte value: " + maxByteValue );
        System.out.println("The minByte value: " + minByteValue);

        //long:

        long maxlong = Long.MAX_VALUE;
        long minlong = Long.MIN_VALUE;

        System.out.println("The maxlong value: " + maxlong);
        System.out.println("The minlong value: " + minlong);

        //short:

        short maxShort = Short.MAX_VALUE;
        short minShort  = Short.MIN_VALUE;

        System.out.println("The maxShort value: " + maxShort);
        System.out.println("The minShort value: " + minShort);

        //float: (fractional: 32 bits)

        float maxFloat = Float.MAX_VALUE;
        float minFloat  = Float.MIN_VALUE;

        System.out.println("The maxFloat value: " + maxFloat);
        System.out.println("The minFloat value: " + minFloat);

        //double: (64 bits)

        double maxDouble = Double.MAX_VALUE;
        double minDouble = Double.MIN_VALUE;

        System.out.println("The maxDouble value: " + maxDouble);
        System.out.println("The minDouble value: " + minDouble);
    }
}

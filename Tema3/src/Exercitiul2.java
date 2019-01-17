import java.util.Scanner;

/**
 * Fahrenheit to Celsius Conversion
 * create a method that converts temperature from Fahrenheit to Celsius.
 * write a program that for a given (by the user) body temperature, measured
 * in Fahrenheit degrees, outputs it in Celsius degrees, with the following message:
 * "Your body temperature in Celsius degrees is X", where X is respectively the Celsius degrees.
 * In addition if the measured temperature in Celsius is higher than 37 degrees, the program
 * should warn the user that they are ill, with the following message "You are ill!".
 *
 * @author Bogdan
 */

public class Exercitiul2 {
    public static void main(String arg[]) {
        Double f, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Fahrenheit temperature: ");
        f = sc.nextDouble();
        c = (f - 32) * 5 / 9;

        if (c >= 37) ;
        {
            System.err.println("You are ill!");
        }
//            else if (c <= 10); {
//            System.err.println("You are dead!");
//        }
        {
            System.out.println("Your body temperature in Celsius degrees is = " + c);
        }
    }
}
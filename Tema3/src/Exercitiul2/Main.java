package Exercitiul2;
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

public class Main {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            Implementations temp = new Implementations();
            System.out.println("Enter the body temperature: ");


            double fahrenheit = sc.nextDouble();
            System.out.println("Your body temperature in Celsius degrees is: "
                    + fahrenheit + "F = " + temp.getTempInCelsius(fahrenheit) + "C");
        } catch (NullPointerException e) {
            System.out.println("Enter a value");
        }
    }
}
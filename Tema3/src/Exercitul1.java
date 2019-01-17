import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.transform.Scale;

import java.io.PrintStream;
import java.util.Scanner;

/**
 * Calculate Max
 * Create a method getMax() with two integer (int) parameters,
 * that returns maximal of the two numbers.
 * Write a program that reads three numbers from the console and prints
 * the biggest of them. Use the getMax() method you just created.
 *
 * @author Bogdan
 */

public class Exercitul1 {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please input the first number: ");
        int x = Integer.parseInt(keyboard.nextLine());
        System.out.println("Please input the second number: ");
        int y = Integer.parseInt(keyboard.nextLine());
        System.out.println("Please input the third number: ");
        int z = Integer.parseInt(keyboard.nextLine());
        int max = Math.max(x,y);
        if(max>y){ //suppose x is max then compare x with z to find max number
            max = Math.max(x,z);
        }
        else{ //if y is max then compare y with z to find max number
            max = Math.max(y,z);
        }
        System.out.println("The max of three is: " + max);
    }
}
//
//    public static int getMAx(int num1, int num2, int num3) {
//        int max = (num1 > num2 && num1 > num3)? num1 :
//                ((num2 > num1 && num2 > num3) ? num2 : num3);
//                System.out.println("The Maximum value is : "+ getMax());
//        return max;
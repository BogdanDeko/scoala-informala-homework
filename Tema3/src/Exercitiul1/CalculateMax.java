package Exercitiul1;
/**
 * Calculate Max
 * Create a method getMax() with two integer (int) parameters,
 * that returns maximal of the two numbers.
 * Write a program that reads three numbers from the console and prints
 * the biggest of them. Use the getMax() method you just created.
 *
 * @author Bogdan
 */

import java.util.Scanner;

public class CalculateMax {

    public static void main(String[] args) {


        System.out.println("Please input 3 integers: ");

        Scanner keyboard = new Scanner(System.in);
        int x = Integer.parseInt(keyboard.nextLine());
        int y = Integer.parseInt(keyboard.nextLine());
        int z = Integer.parseInt(keyboard.nextLine());

        int max = Math.max(Math.max(x, y), z);

        if (max > y) {
            max = Math.max(x, z);
        } else {
            max = Math.max(y, z);
            System.out.println("The max of three is: " + max);
        }
    }
        public int getMax(int x, int y, int z){
            if (x>y){
                return x;
            }
            if (x<z){
                return y;
            } else {
                return z;
            }
        }
    }

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Input Data Validation
 * Write a program that asks the user what time it is, by printing on the console
 * "What time is it?".Then the user must enter two numbers – one for hours and one for minutes.
 * If the input data represents a valid time, the program must output the message " The time is hh:mm now.",
 * where hh respectively means the hours, and mm – the minutes. If the entered hours or minutes are not valid,
 * the program must print the message " Incorrect time!". The validation must be implemented in a separate method.
 *
 * @author Bogdan
 */
public class Exercitiul3 {

    public static void main(String[] args) {
        int h, m;
        Scanner sc = new Scanner(System.in);
        System.out.println("What time is it?");
        System.out.println("Insert the hour: hh:mm");
        h = sc.nextInt();
        m = sc.nextInt();

        String strh = String.format("%02d",h);
        String strm = String.format("%02d",m);

        if ((h <= 23) && (m <= 59)) {
            System.out.println("The time is: " + strh + ":" + strm + " now!");
        } else {
            System.out.println("Incorrect time!");
        }
    }
}
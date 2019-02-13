package Exercitiul3;
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

public class TestTime {
    public static void main(String[] args) {

        Time t1 = new Time(3, 2, 1);
        System.out.println(t1);

        Time t2 = new Time(59, 59, 23);
        System.out.println(t2);
        System.out.println(t2.nextSecond().nextSecond().nextSecond());

        try {
            Time t3 = new Time(60, 59, 12);  // throw IllegalArgumentException

            System.out.println(t3);

        } catch (IllegalArgumentException ex) {

            ex.printStackTrace();
        }
        System.out.println("Continue after exception!");
    }
}

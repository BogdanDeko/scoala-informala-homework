import java.util.Scanner;

/**
 * @author Bogdan
 *
 * Input 3 numbers, and display the biggest.
 */
public class Exercitiul8 {
    public static void main(String args[]) {
        int x, y, z;
        System.out.println("Input three numbers: ");
        Scanner in = new Scanner(System.in);

        x = in.nextInt();
        y = in.nextInt();
        z = in.nextInt();

        if (x > y && x > z)
        System.out.println("First number is largest");
        else if (y > x && y > z)
        System.out.println("Second number is largest");
        else if(z > x && z > y)
        System.out.println("Third number is largest");
        else
        System.out.println("The numbers are not distinct");
    }
}

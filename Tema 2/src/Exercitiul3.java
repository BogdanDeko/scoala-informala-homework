import java.util.Scanner;

/**
 * @author Bogdan
 *
 * Display the max digit from a number. Read the number from keyboard.
 */
public class Exercitiul3 {
    public static void main(String[] args) {

        int r, n, md = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        n = sc.nextInt();

        while ( n > 0) {
            r = n % 10;
            if (md < r) {
                md = r;
            }
            n = n / 10;
        }

        System.out.println("The maximum digit is: " + md);
    }
}

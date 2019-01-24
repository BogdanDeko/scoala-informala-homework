import java.util.Scanner;

/**
 * @author Bogdan
 *
 * Check if a number is palindrome (e.g. 1221, 34143).
 */
public class Exercitiul4 {
    public static void main (String[] args) {
        System.out.println("Enter a number: ");
        Scanner read = new Scanner(System.in);
        int num = read.nextInt();
        int n = num;
        int rev = 0, i;
        while (num > 0) {
            i = num % 10;
            rev = rev * 10 + i;
            num = num / 10;
        }
        if (rev == n)
            System.out.println(n + "is a Palindrome number");
        else
            System.out.println(n + "is not a palindrome number");
    }
}

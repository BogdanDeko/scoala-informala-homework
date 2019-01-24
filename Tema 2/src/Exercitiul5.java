import java.util.Scanner;

/**
 * @author Bogdan
 *
 * Display all the prime numbers lower than a given number.
 *
 */
public class Exercitiul5 {
    public static void main(String[] args) {
        int j, n;
        n = 10;

        for (j = 2; j <= n; j++) {
            if (isPrime(j))
                System.out.println(j);
        }
    }

    public static boolean isPrime(int m) {
        for (int i = 2; i <=(m); i++) {
            if (m % i == 0)
                return false;
        }
        return true;
    }
}

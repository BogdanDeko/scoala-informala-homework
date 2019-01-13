import java.util.Scanner;

/**
 * @author Bogdan
 *
 * Input the length of the side of a square, and display its area.
 * Produce an error message if the length is negative.
 */
public class Exercitiul7 {
    public static void main(String[] args){
        int length = 0;
        int area;
        System.out.println("Error message: The length is negative " + length);
        System.out.print("Input the length of the side of a Square: ");
        Scanner scanner = new Scanner(System.in);
        length = scanner.nextInt();
        area = length * length;
        System.out.println("Area of a Square is: " +area);
}
}
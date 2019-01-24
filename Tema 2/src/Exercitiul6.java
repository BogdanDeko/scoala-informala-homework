import java.util.Random;
import java.util.Scanner;

/**
 * @author Bogdan
 *
 * Input the dimensions of a rectangle and display area and perimeter.
 */
public class Exercitiul6 {
    public static void main(String[] args){
        int length = 0;
        int breadth = 0;
        int area = 0;
        int perimeter = 0;
        System.out.print("Enter the length of Rectangle: ");
        Scanner scanner = new Scanner(System.in);
        length = scanner.nextInt();
        System.out.print("Enter the breadth of Rectangle: ");
            breadth = scanner.nextInt();
            area = length * breadth;
            perimeter = 2 * (length + breadth);
            System.out.println("Area of Rectangle is: " +area);
            System.out.println("Perimeter of Recatangle is: " +perimeter);
    }
}

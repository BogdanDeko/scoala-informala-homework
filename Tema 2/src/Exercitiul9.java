import java.util.Scanner;

/**
 * @author Bogdan
 *
 * Input 2 values:  start  and  finish, then display the numbers from start to finish.
 */
public class Exercitiul9 {
    public static void main(String[]args){
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the START number:");
        int min = read.nextInt();
        System.out.println("Enter the FINISH number:");
        int max = read.nextInt();

        for (int i=min; i< max +1; i++){
            System.out.println(i);
        }
    }
}


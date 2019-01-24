import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Bogdan
 *
 * Display the smallest number from a collection of numbers.
 *
 */
public class Exercitiul2 {
    public static int getSmallest(Integer[]a, int total) {
        List<Integer> list = Arrays.asList(a);
        Collections.sort(list);
        int element = list.get(0);
        return element;
    }
    public static void main(String args[]) {
        Integer a[] = {10, 2, 35, 74, 15, 6, 81, 9};
        System.out.println("Smallest number: " + getSmallest(a, 8));
    }}

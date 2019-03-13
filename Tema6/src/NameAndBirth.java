import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.YearMonth;
import java.util.*;
import java.util.stream.Collectors;

public class NameAndBirth {
//
    private String value1;
    private String value2;

    public NameAndBirth(String value1, String value2) {

        super();
        this.value1 = value1;
        this.value2 = value2;
    }

    public String getValue1() {
        return value1;
    }

    public void setValue1(String value1) {
        this.value1 = value1;
    }

    public String getValue2() {
        return value2;
    }

    public void setValue2(String value2) {
        this.value2 = value2;
    }

    public int compareTo(Object o) {
        NameAndBirth c1 = (NameAndBirth) o;
        return Integer.valueOf(value1) - Integer.valueOf(c1.getValue1());
    }

        @Test
        public void filter_date () {

            myLines
                    .stream()
                    .filter(s -> s.startsWith("June"))
                    .map(String::toUpperCase)
                    .sorted((p1, p2) -> p1.getDateOfBirth()
                            .compareTo(p2.getDateOfBirth()))
                    .distinct()
                    .forEach(System.out::println);

                    dates.stream()
                            .sorted()
    .collect(Collectors.groupingBy(YearMonth::from,
             TreeMap::new, Collectors.toList()));
        }
    }

    Comparator<Person> byDateOfBirdth = new Comparator<Person>() {
        @Override
        public int compare(Person o1, Person o2) {
            return 0;
        }
    public static void main(String[] args) {

    String csvFile = "files/NameSurname&DateOfBirth.csv";
    String line = "";
    String cvsSplitBy = ",";

            try(
    BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

        while ((line = br.readLine()) != null) {

            // use comma as separator
            String[] abb = line.split(cvsSplitBy);

            System.out.println("| " + abb[0] + " , " + abb[1] + " , " +abb[2]+ " |");

        }

    } catch (
    IOException e) {
        e.printStackTrace();
    }

        FileReader fileReader = new FileReader("files/NameSurname&DateOfBirth.csv");
        List<String> lines;
        try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            lines = new ArrayList<>();
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                lines.add(line);
            }
        }
        Collections.sort(lines);
        String[] array = lines.toArray(new String[lines.size()]);
    }
}

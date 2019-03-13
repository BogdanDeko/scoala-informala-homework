import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader = null;
        BufferedWriter writer = null;

        List<String> myLines = new ArrayList<>();
        Collections.sort(myLines);

        try {
            reader = new BufferedReader(new FileReader("Files/NameSurname&DateOfBirth.txt"));
            String currentLine = reader.readLine();

            while (currentLine != null) {
                myLines.add(currentLine);
                currentLine = reader.readLine();
            }
            Collections.sort(myLines);

            writer = new BufferedWriter(new FileWriter("Files/SortedNameAfterBirth.csv"));
            for (String line : myLines) {
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        person.sort(Comparator.comparing(Person::getDate)
        .reversed()
        .thenComparing(Comparator.comparing(Person::getName))
        .reversed());
    }
}


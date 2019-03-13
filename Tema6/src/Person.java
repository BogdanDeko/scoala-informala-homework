import org.junit.jupiter.api.Test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

public class Person implements Comparable<Person> {
//    private String name;
//    private String surname;
//    private String dateOfBirth;
//    private List<Person> datestring = null;
//
//    public List<Person> getDate() {
//        final int first = 0;
//        if (datestring == null) {
//            getDate();
//            datestring = jpaController.findRange(new int[]{
//                    pagingInfo.getFirstItem(), pagingInfo.getFirstItem() + pagingInfo.getBatchSize()});
//
//            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
//            Collections.sort(datestring, (s1, s2) -> LocalDateTime.parse(s1, formatter).
//                    compareTo(LocalDateTime.parse(s2, formatter)));
//        }
//    }
//
//    public Person(String name, String surname, String dateOfBirth) {
//        this.name = name;
//        this.surname = surname;
//        this.dateOfBirth = dateOfBirth;
//    }
//
//    public String toString() {
//        return String.format("(%s, %s, %s)", name, surname, dateOfBirth);
//    }
//
//    @Override
//    public int compareTo(Person person) {
//        return person.dateOfBirth - this.dateOfBirth;
//    }
//
//    Collections.sort(movieItems, new Comparator<Movie>() {
//        public int compare(Movie m1, Movie m2) {
//            return m1.getDate().compareTo(m2.getDate());
//        }
//    });

    Map<YearMonth, List<LocalDate>> m = dates.stream()
            .collect(Collectors.groupingBy(
                    date -> YearMonth.from(date),
                    TreeMap::new,
                    Collectors.collectingAndThen(
                            Collectors.toList(),
                            (list) -> { Collections.sort(list); return list; })));
}

package OOP;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/* 
 * Data e ora
 */

public class Main_24 {
    public static void main(String[] args) {

        LocalTime x = LocalTime.now();
        System.out.println(x);

        LocalDate y = LocalDate.now();
        System.out.println(y);

        LocalDateTime z = LocalDateTime.now();
        System.out.println(z);

        // DateTimeFormatter xFormat = DateTimeFormatter.ofPattern("dd/MMM/yyyy");
        // System.out.println(x.format(xFormat));

        // Formattazione dell'orario
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println("Orario formattato: " + x.format(timeFormatter));

        // Formattazione della data
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Data formattata: " + y.format(dateFormatter));

        // Formattazione data e orario
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("EEEE dd MMMM yyyy HH:mm:ss");
        System.out.println("Data e orario formattati: " + z.format(dateTimeFormatter));
    }
}

package OOP;

/* 
 * COSTRUTTORE
 */

public class Main_11 {
    public static void main(String[] args) {

        Persona persona1 = new Persona("Lorenzo", "Neri", 23, "viola");
        Persona persona2 = new Persona("Mario", "Rossi", 34, "giallo");

        System.out.println(persona1.cognome);
        System.out.println(persona2.cognome);

        persona1.saluta();

        /*
         * OVERLOADED CONSTRUCTORS
         */
        // Pizza pizza1 = new Pizza("integrale", "pomodoro", "fior di latte", "olive");
        // Pizza pizza2 = new Pizza("5 cereali");
        // Pizza pizza3 = new Pizza("5 cereali", "pummarola");

    }
}

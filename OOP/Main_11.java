package OOP;

/* 
 * COSTRUTTORE
 */

public class Main_11 {
    public static void main(String[] args) {

        Persona persona1 = new Persona("Lorenzo", "Neri", 23, "viola");
        Persona persona2 = new Persona("Mario", "Rossi", 34, "giallo");

        System.out.println(persona1.nome);
        System.out.println(persona2.nome);

    }
}

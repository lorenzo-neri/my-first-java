package OOP;

import OOP.Objects.Persona;

/* 
 * final
 * static
 */

public class Main_13 {
    public static void main(String[] args) {
        final int costante = 5;

        // costante = 10; NO ❌

        System.out.println(costante);

        Persona persona1 = new Persona("Lorenzo", "Neri", 23, "viola");
        Persona persona2 = new Persona("Mario", "Rossi", 34, "giallo");

        System.out.println(persona1);
        System.out.println(persona2);

        // System.out.println("Numero persone: " + Persona.numeroPersone);
        Persona.mostraNumeroPersone();
    }
}

package OOP;

import OOP.Objects.Persona;

/* 
 * Copiare oggetti
 * 
 * tramite metodo
 * tramite costruttore
 */

public class Main_18 {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Lorenzo", "Neri");
        Persona persona2 = new Persona("Luca", "Rossi");

        System.out.println(persona1);
        System.out.println(persona2);

        // persona2 = persona1; //così avranno la stella cella di memoria e non va bene

        persona2.copy(persona1);
        persona1.setNome("Marco");

        System.out.println();
        System.out.println(persona1.getNome());
        System.out.println(persona2.getNome());
        System.out.println();
        System.out.println(persona1.getCognome());
        System.out.println(persona2.getCognome());
    }
}

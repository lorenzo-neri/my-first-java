package OOP;

import OOP.Objects.Persona;

/* 
 * ARRAY DI OGGETTI
 */

public class Main_12 {
    public static void main(String[] args) {

        // Persona[] persone = new Persona[3]; // lunghezza 3

        Persona persona1 = new Persona("Lorenzo", "Neri", 23, "viola");
        Persona persona2 = new Persona("Mario", "Rossi", 34, "giallo");
        Persona persona3 = new Persona("Lucia", "Bianchi", 21, "verde");

        // persone[0] = persona1;
        // persone[1] = persona2;
        // persone[2] = persona3;
        Persona[] persone = { persona1, persona2, persona3 };

        System.out.println(persone[0]); // possiamo vederlo grazie al metodo toString che abbiamo "modificato"

    }
}

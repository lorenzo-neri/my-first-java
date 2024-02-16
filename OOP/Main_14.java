package OOP;

import OOP.Objects.Insegnante;
import OOP.Objects.Persona;
import OOP.Objects.Studente;

/* 
 * Ereditarietà / Inheritance
 * creiamo classi figlie (studente e insegnante)
 * overriding dei metodi (@Override)
 * costruttore classi figlie e super keyword
 */

public class Main_14 {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Lorenzo", "Neri");
        persona1.saluta();

        Studente studente1 = new Studente("Mario", "Rossi", "Storia");
        studente1.saluta(persona1);

        Insegnante insegnante1 = new Insegnante("Enrico", "Raisa");
        insegnante1.saluta(studente1);
        studente1.saluta();
        insegnante1.saluta();
    }
}

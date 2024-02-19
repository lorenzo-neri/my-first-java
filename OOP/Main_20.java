package OOP;

import OOP.Objects.Persona;
import OOP.Objects.Insegnante;
import OOP.Objects.Studente;

/* 
 * polimorfismo / polymorphism
 * 
 * la capacità degli oggetti di identificarsi, non solo con la loro classe effettiva (Studente/Insegnante) ma anche di identificarsi con altri tipi, in questo caso ciò che hanno in comune, Persona
 */

public class Main_20 {
    public static void main(String[] args) {
        Studente studente1 = new Studente("Lorenzo", "Neri", null);
        Insegnante insegnante1 = new Insegnante("Enrico", "Rai");
        Studente studente2 = new Studente("Mario", "Rossi", null);

        Persona[] classe = { studente1, insegnante1, studente2 };

        for (Persona persona : classe) {
            persona.saluta();
        }
    }
}

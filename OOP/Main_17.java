package OOP;

import OOP.Objects.Personaggio;

/* 
 * Incapsulamento / Encapsulation
 * 
 * incapsulamento = processo in cui nascondiamo attributi di una classse all'esterno mettendoli private,
 * diventano accessibili solo tramite dei metodi (getters/setters)
 */

public class Main_17 {
    public static void main(String[] args) {

        Personaggio personaggio1 = new Personaggio("Luke", "Skywalker");

        System.out.println(personaggio1.getNome());
        System.out.println(personaggio1.getCognome());

        // personaggio1.nome = "Leila"; //non si può fare x il private

        personaggio1.setNome("Leila");
        System.out.println(personaggio1.getNome());
        System.out.println(personaggio1.getCognome());
    }
}

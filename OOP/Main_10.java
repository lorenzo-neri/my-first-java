package OOP;
/* 
 * Intro OOP 
 * 
 * Object Oriented Programing
 * 
 * Cos'è la programmazione ad oggetti
 * classi, metodi e attributi
 * classe con file esterno
 * cosa sono gli oggetti e le istanze di classe
 * usare attributi e metodi
 */

public class Main_10 {
    public static void main(String[] args) {

        Persona persona1 = new Persona(); // creo un oggetto o un'istanza

        System.out.println(persona1.colorePreferito);
        System.out.println(persona1.nome);

        persona1.saluta();

        Persona persona2 = new Persona(); // altra istanza

        persona2.cammina();
    }
}

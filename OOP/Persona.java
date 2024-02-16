package OOP;

public class Persona {

    /*
     * String nome = "Lorenzo";
     * String cognome = "Neri";
     * int eta = 23;
     * String colorePreferito = "Viola";
     * 
     * void saluta() {
     * System.out.println("Ciao sono " + nome);
     * }
     * 
     * void cammina() {
     * System.out.println("Sto camminando...");
     * }
     */

    String nome;
    String cognome;
    int eta;
    String colorePreferito;

    Persona(String nome, String cognome, int eta, String colorePreferito) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
        this.colorePreferito = colorePreferito;
    }

    void saluta() {
        System.out.println("Ciao sono " + nome);
    }
}

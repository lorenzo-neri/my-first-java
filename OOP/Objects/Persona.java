package OOP.Objects;

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

    public String nome;
    public String cognome;
    public int eta;
    public String colorePreferito;

    public Persona(String nome, String cognome, int eta, String colorePreferito) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
        this.colorePreferito = colorePreferito;
    }

    public void saluta() {
        System.out.println("Ciao sono " + nome);
    }

    public String toString() {
        String stringa = this.nome + "\n" + this.cognome + "\n" + this.eta + "\n" + this.colorePreferito;
        return stringa;
    }
}

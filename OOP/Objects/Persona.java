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

    // passare oggetti come parametri
    public void saluta(Persona personaDaSalutare) {
        System.out.println("Ciao " + personaDaSalutare.nome + " io sono " + this.nome);
    }

    public String toString() {
        String stringa = this.nome + "\n" + this.cognome + "\n" + this.eta + "\n" + this.colorePreferito;
        return stringa;
    }
}

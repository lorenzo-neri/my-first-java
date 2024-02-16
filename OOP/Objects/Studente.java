package OOP.Objects;

public class Studente extends Persona {

    // String materiaPreferita = "Matematica";
    // String classe = "4B";
    // int[] votiMatematica = { 6, 8, 9 };

    String materiaPreferita;

    public Studente(String nome, String cognome, String materiaPreferita) {
        super(nome, cognome); // super fa riferimento alla classe genitore
        this.materiaPreferita = materiaPreferita;
    }

    @Override // sovrascrive il metodo della classe genitore
    public void saluta() {
        System.out.println("Buongiorno prof!");
    }
}

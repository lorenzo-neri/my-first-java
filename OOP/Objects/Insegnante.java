package OOP.Objects;

public class Insegnante extends Persona {

    String materiaInsegnamento = "Storia";
    String[] classi = { "1D", "3B", };

    public Insegnante(String nome, String cognome) {
        super(nome, cognome); // super fa riferimento alla classe genitore
    }

    @Override // sovrascrive il metodo della classe genitore
    public void saluta() {
        System.out.println("Buongiorno ragazzi!");
    }
}

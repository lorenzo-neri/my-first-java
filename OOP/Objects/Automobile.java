package OOP.Objects;

public class Automobile extends Veicolo {

    // Automobile è costretto ad implementare i metodi astratti che sono nel
    // genitore (astratto)

    @Override
    public void muovi() {
        System.out.println("Si sta muovendo...");
    }

    @Override
    public void frena() {
        System.out.println("Sta frenando...");
    }
}

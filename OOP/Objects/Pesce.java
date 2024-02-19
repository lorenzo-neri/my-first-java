package OOP.Objects;

import OOP.Objects.Interface.Preda;
import OOP.Objects.Interface.Predatore;

public class Pesce implements Preda, Predatore {

    @Override
    public void scappa() {
        System.out.println("Il pesce piccolo sta scappando...");
    }

    @Override
    public void caccia() {
        System.out.println("Il pesce grande sta cacciando...");
    }
}

package OOP;

import OOP.Objects.Automobile;

/* 
 * Classi Astratte 
 * classe astratta veicolo
 * classi figlie macchina
 * metodi astratti
 */

public class Main_15 {
    public static void main(String[] args) {
        Automobile automobile1 = new Automobile();
        automobile1.muovi();
        automobile1.frena();
    }
}

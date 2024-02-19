package OOP;

import OOP.Objects.Gazzella;
import OOP.Objects.Leone;
import OOP.Objects.Pesce;

/* 
 * Interfacce
 * 
 *  un'interfaccia è una collezione di metodi astratti e costanti (variabili finali) che possono essere implementati da una classe. Un'interfaccia definisce un contratto di comportamento che una classe deve seguire se sceglie di implementare quell'interfaccia.
Le interfacce in Java sono simili alle classi astratte, ma hanno alcune differenze significative:

1- Le interfacce possono contenere solo metodi astratti (senza implementazione), mentre le classi astratte possono contenere sia metodi astratti che metodi concreti (con implementazione).

2- Una classe può implementare più interfacce, ma può estendere una sola classe astratta.

3- Tutti i metodi in un'interfaccia sono implicitamente pubblici e astratti, quindi non è necessario specificare le parole chiave public e abstract.

4- Le costanti definite in un'interfaccia sono implicitamente pubbliche, statiche e finali.
 */

public class Main_19 {
    public static void main(String[] args) {

        Leone leone = new Leone();
        Gazzella gazzella = new Gazzella();
        Pesce pesce1 = new Pesce();

        leone.caccia();
        gazzella.scappa();
        pesce1.caccia(); // esempio easy
        pesce1.scappa(); // giusto x capire
    }
}

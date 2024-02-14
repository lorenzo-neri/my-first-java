/* 
 * ARRAYLIST
 * 
 * Sono ridimensionabili, accettano solo reference type
 * 
 */

import java.util.ArrayList;

public class Main_07 {
    public static void main(String[] args) {

        ArrayList<String> persone = new ArrayList<String>();

        persone.add("Lorenzo");
        persone.add("Ermes");
        persone.add("Sole");

        persone.set(2, "Merlino");
        persone.remove(0);
        // clear toglie tutto dall'array

        for (int i = 0; i < persone.size(); i++) {
            System.out.println(persone.get(i));
        }

        // se si vuole utilizzare dei numeri (quindi int) bisogna ricordare che
        // ArrayList accetta solo reference e non primitive, quindi al post di int
        // dovremmo usare Integer, e così via per gli altri tipi di valori

        ArrayList<ArrayList<String>> classi = new ArrayList<ArrayList<String>>();

        ArrayList<String> classe1 = new ArrayList<String>();
        classe1.add("Manuel");
        classe1.add("Sara");
        ArrayList<String> classe2 = new ArrayList<String>();
        classe2.add("Sofia");
        classe2.add("Marco");

        classi.add(classe2);
        classi.add(classe1);

        for (int i = 0; i < classi.size(); i++) {
            System.out.println();
            for (int j = 0; j < classi.get(i).size(); j++) {
                System.out.print(classi.get(i).get(j) + "  ");
            }
        }
    }
}

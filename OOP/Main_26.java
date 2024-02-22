package OOP;

import java.util.ArrayList;

import java.util.Iterator;

/* 
 * Iteratori
 * 
 * Un iteratore è un oggetto che cicla una collezione (ArrayList)
 * loop di un ArrayList
 * rimuovere un elemento
 */

public class Main_26 {
    public static void main(String[] args) {

        ArrayList<String> persone = new ArrayList<String>();
        persone.add("Lorenzo");
        persone.add("Luca");
        persone.add("Paolo");
        persone.add("Anna");

        Iterator<String> it = persone.iterator();

        while (it.hasNext()) {
            String persona = it.next();
            if (persona == "Anna") {
                it.remove();
            }

            // System.out.println(it.next());
        }
        System.out.println("Persone = " + persone);
    }
}

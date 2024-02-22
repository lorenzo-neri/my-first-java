package OOP;

import java.util.HashMap;

/* 
 * Hasmap
 */

public class Main_25 {
    public static void main(String[] args) {

        HashMap<String, String> capitali = new HashMap<String, String>();

        capitali.put("Italia", "Roma");
        capitali.put("Germania", "Berlino");
        capitali.put("Francia", "Parigi");

        System.out.println(capitali);
        System.out.println(capitali.get("Germania"));

        capitali.remove("Francia");
        System.out.println(capitali);
        capitali.clear();
        System.out.println(capitali);

    }
}

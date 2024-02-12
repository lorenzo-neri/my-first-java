/* 
 * OPERAZIONE ARITMETICHE - (skippabile)
 * 
 * operatori + - / * %
 * shorthand
 * incremento e decremento
 * esempi di espressione
 */

public class Main_02 {
    public static void main(String[] args) {
        int x = 10;
        int y = 2;
        int z = x + y;

        System.out.println(z); // 12

        // z = z + 3;
        z += 3; // shorthand
        System.out.println(z);

        z++; // classico incremento
        System.out.println(z);

        /*
         * ALCUNI METODI - Math Class: abs, min, max, pow, sqrt
         * attributi: PI
         */
        System.out.println("################");
        System.out.println(Math.abs(-55)); // abs toglie segno
        System.out.println(Math.min(55, 21)); // min/max
        System.out.println(Math.sqrt(z)); // sqrt radice quadrata (square root)
        System.out.println(Math.pow(y, z)); // pow eleva potenza
        System.out.println("P Greco = " + Math.PI);

    }
}

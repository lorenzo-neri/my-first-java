package OOP;

/* 
 * Casting
 * 
 * il casting è quel processo che modifica un tipo di dato
 * Implicito: automatico quando passiamo ad un tipo più ampio (int->double, float->double)
 * Esplicito: manuale quando passiamo ad un tipo più ristretto
 */

public class Main_23 {
    public static void main(String[] args) {

        double x = 9;

        System.out.println(x); // 9.0

        float y = 9.5f;

        System.out.println(y);

        int z = (int) 9.5;

        System.out.println(z);

    }
}

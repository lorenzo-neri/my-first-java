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

    }
}

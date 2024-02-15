/* 
 * OVERLOADED METHODS
 * 
 */

public class Main_09 {
    public static void main(String[] args) {

        int doppioInt = addizione(2, 3);
        int triploInt = addizione(1, 2, 4);
        double triploDouble = addizione(3.55, 3.33, 3.14);

        System.out.println(doppioInt);
        System.out.println(triploInt);
        System.out.println(triploDouble);

    }

    static int addizione(int a, int b) {
        int risultato = a + b;
        return risultato;
    }

    static int addizione(int a, int b, int c) {
        int risultato = a + b + c;
        return risultato;
    }

    static double addizione(double a, double b, double c) {
        double risultato = a + b;
        return risultato;
    }
}

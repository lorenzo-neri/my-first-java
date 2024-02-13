/* 
 * ARRAY
 */

public class Main_04 {
    public static void main(String[] args) {

        int[] numeri = new int[5];

        numeri[0] = 10;
        numeri[1] = 20;
        numeri[2] = 30;
        numeri[3] = 40;
        numeri[4] = 50;

        System.out.println("lunghezza di numeri = " + numeri.length); // 0,1,2,3,4
        System.out.println(numeri[1]);

        numeri[1] = 100;
        System.out.println(numeri[0]);
        System.out.println(numeri[1]);
        System.out.println(numeri[2]);

        for (int i = 0; i < numeri.length; i++) {
            System.out.println("for: " + numeri[i]);
        }
        for (int numero : numeri) {
            System.out.println("foreach: " + numero);
        }
    }
}

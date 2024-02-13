/* 
 * SWITCH
 */

public class Main_03 {
    public static void main(String[] args) {
        // String nome = "Lorenzo";
        // String nome = "Ermes";
        String nome = "Link";

        switch (nome) {
            case "Lorenzo":
                System.out.println("Ciao " + nome);
                break;
            case "Ermes":
                System.out.println("Non sei Lorenzo");
                break;
            default:
                System.out.println("Chi sei?");
                break;
        }

        /*
         * #################
         * Ciclo WHILE
         */
        int i = 0;
        /*
         * while (i <= 5) {
         * System.out.println(i);
         * i++;
         * }
         */
        do { // qua il codice viene eseguito prima di controllare la condizione, almeno una
             // volta verrà eseguito
            System.out.println(i);
            i++;
        } while (i <= 5);
        System.out.println("Ciclo finito!");

        System.out.println("################");

        /*
         * CICLO FOR
         * versione enhanced/foreach
         * break e continue
         */
        for (int q = 0; q < 5; q++) {
            System.out.println("riga " + q);

            for (int j = 0; j < 5; j++) {
                System.out.println("colonna " + j);
            }
        }

        // SIMIL FOREACH
        int[] numeri = { 10, 20, 30, 40, 50 };
        for (int numero : numeri) {
            System.out.println(numero);
        }

        for (int k = 0; k < 5; k++) {
            if (k == 3) {
                break;
            }
            System.out.println("break " + k);
        }
        for (int w = 0; w < 5; w++) {
            if (w == 3) {
                continue;
            }
            System.out.println("continue " + w);
        }
    }
}

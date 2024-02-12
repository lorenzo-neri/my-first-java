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
    }
}

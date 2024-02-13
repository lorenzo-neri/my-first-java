/* 
 * ARRAY 2D
 */

public class Main_05 {
    public static void main(String[] args) {

        String[][] classi = new String[3][5]; // 3 classi con 5 persone per classe

        // classe 1
        classi[0][0] = "Luca";
        classi[0][1] = "Anna";
        classi[0][2] = "Paolo";
        classi[0][3] = "Gio";
        classi[0][4] = "Marco";

        // classe 2
        classi[1][0] = "Lore";
        classi[1][1] = "Fabio";
        classi[1][2] = "Ricky";
        classi[1][3] = "Pietro";
        classi[1][4] = "Eva";

        // classe 3
        classi[2][0] = "Piero";
        classi[2][1] = "Pablo";
        classi[2][2] = "Mirko";
        classi[2][3] = "Sara";
        classi[2][4] = "Sofia";

        for (int classe = 0; classe < classi.length; classe++) {
            System.out.println();
            System.out.println();
            for (int studente = 0; studente < classi[classe].length; studente++) {
                System.out.print(classi[classe][studente] + "  ");
            }
        }

        System.out.println("\n \n");
        System.out.println("######################");

        String[][] newClassi = {
                { "Marco", "Fabio", "Rita" },
                { "Sandro", "Renzo", "Sara" },
                { "Michele", "Francesco", "Lucia" },
        };

        // for
        for (int classe = 0; classe < newClassi.length; classe++) {
            System.out.println();
            System.out.println();
            for (int studente = 0; studente < newClassi[classe].length; studente++) {
                System.out.print(newClassi[classe][studente] + "  ");
            }
        }

        System.out.println("\n \n");
        System.out.println("######################");

        // foreach
        for (String[] classe : newClassi) {
            System.out.println();
            for (String studente : classe) {
                System.out.print(studente + "  ");
            }
        }

    }
}

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

    }
}

// Come accettare input dell'utente da terminale
/* 
 * importare java.util.scanner
 * creare oggetto scanner
 * creare domande per utente (nome, cognome, età,...)
 */

import java.util.Scanner;

public class Main_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual'è il tuo nome?");
        String nome = scanner.nextLine();

        System.out.println("Qual'è il tuo cognome?");
        String cognome = scanner.nextLine();

        System.out.println("Qual'è la tua età?");
        int eta = scanner.nextInt();
        scanner.nextLine();

        System.out.println("In che città abiti?");
        String citta = scanner.nextLine();

        System.err.println("Ciao " + nome + " " + cognome);
        System.out.println("Hai " + eta + " anni");
        System.out.println("Abiti a " + citta);
    }
}

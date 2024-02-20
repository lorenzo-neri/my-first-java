package OOP;

//import java.util.InputMismatchException;
import java.util.Scanner;

/* 
 * Exception handling
 * 
 * esempi con ArithmeticException e InputMismatchException
 * try catch e finally
 */

public class Main_21 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {

            System.out.println("Inserire un numero");
            int x = scanner.nextInt();

            System.out.println("Inserire il secondo numero");
            int y = scanner.nextInt();

            int result = x / y;
            System.out.println("Risultato = " + result);

        } catch (ArithmeticException e) { // Exception
            // TODO: handle exception
            System.out.println("Non puoi dividere per zero");
        } /*
           * catch (InputMismatchException e) {
           * System.out.println("Non puoi dividere un numero per una stringa");
           * }
           */ catch (Exception e) {
            System.out.println("Qualcosa è andato storto");
        } finally {
            scanner.close();
        }

    }
}

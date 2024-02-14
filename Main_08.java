/* 
 * METODI (funzioni)
 * 
 * Java, linguaggio orientato agli oggetti
 * funzioni appartenenti alle classi
 */

public class Main_08 {
    public static void main(String[] args) {
        ricetta("carne");
        somma(3, 4);
        somma(176, 2345);
    }

    static void ricetta(String cibo) { // static non ci interessa al momento, ha a che fare con main(?)
        System.out.println("sto facendo " + cibo);
    }

    static int somma(int a, int b) {
        int risultato = a + b;
        System.out.println(risultato);
        return risultato;
    }
}

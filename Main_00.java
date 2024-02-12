//OOP

public class Main_00 {

    public static void main(String[] args) {

        System.out.print("Tutto su ");
        System.out.print("una riga\n");

        System.out.println("Hello Java!");

        System.out.println("Second line :) \n"); // \n si utilizza per andare a capo

        /*
         * VARIABILI
         * 
         * in Java bisogna indicare il tipo di valore della variabile
         */

        int x; // dichiarazione
        double temperatura;

        x = 45; // assegnazione
        temperatura = 34.23;

        String nome = "Lorenzo"; // inizializzazione

        System.out.println(x);
        System.out.println(nome);
        System.out.println(temperatura);

        /*
         * TIPI DI DATI
         * 
         * - boolean | true : false | 1bit
         * - byte | -128 : 127 | 1byte
         * - short | -32768 : 32767 | 2 bytes
         * - int | -2 miliardi : 2 miliardi | 4 bytes
         * - long | -9 quinitilioni : 9 quintilioni | 8 bytes
         * 
         * - float | numero con 6-7 cifre decimali 5.123456f | 4 bytes
         * - double | n con 15 decimali 5.123456789123456 | 8 bytes
         * 
         * - char | singolo carattere/lettera/ASCII 'f' |2 bytes
         * - String | sequenza di caratteri "ciao questo è il mio primo file java" |
         * variabile
         * 
         */

        // boolean ilBoolean = true;
        // byte ilByte = 127;
        // short loShort = -32768;
        // int ilInt = 2_000_000_000;
        // long ilLong = 89_436_234_874_458L;

        // float ilFloat = 5.1234567f; // f per il float è fondamentale
        // double ilDouble = 5.233453543;

        // char ilChar = 'c'; // il singolo apice per il char
        String laStringa = "ciao"; // le virgolette per String

        // primitive e reference
        // con le reference possiamo utilizzare un insieme di metodi
        System.out.println(laStringa.toUpperCase());
    }

}

/* 
 * METODI STRINGHE
 * equals, equalsIgnoreCase, length, charAt
 * IndexOf, isEmpty, toUpperCase, toLowerCase
 * trim, replace
 */

public class Main_06 {
    public static void main(String[] args) {

        String nome = "Lorenzo";
        boolean risultato = nome.equalsIgnoreCase("lORenzo"); // equals restituisce un boolean
        System.out.println(risultato);

        String parolaUno = "Ciaoooooo!";
        int lunghezza = parolaUno.length();
        System.out.println(lunghezza);

        String parolaDue = "Caffetteria";
        char trovaCarattere = parolaDue.charAt(3);
        System.out.println(trovaCarattere);

        int indice = parolaDue.indexOf("t");
        System.out.println(indice);

        boolean vuoto = parolaDue.isEmpty();
        System.out.println(vuoto);

        // trim toglie spazi avanti e dietro ad una string

        String parolaTre = parolaDue.replace("e", "&");
        System.out.println(parolaTre);
    }
}

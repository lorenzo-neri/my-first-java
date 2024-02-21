package OOP;

import java.io.FileNotFoundException;
import java.io.FileReader;
// import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/* 
 * Lavorare con i file
 * 
 * verificare se file esiste nel progetto o nel computer
 * getPath, getAbsolutePath, isFile
 * eliminare file
 * scrivere in un file con filewriter: write e append
 * leggere un file con filereader
 */

public class Main_22 {
    public static void main(String[] args) {

        /*
         * File testFile = new File("prova.txt"); //
         * "C:/Users/LN/OneDrive/Desktop/teeest.txt"
         * 
         * if (testFile.exists()) {
         * System.out.println("Il file esiste");
         * System.out.println(testFile.getPath());
         * System.out.println(testFile.getAbsolutePath());
         * System.out.println(testFile.isFile());
         * testFile.delete();
         * } else {
         * System.out.println("Il file non esiste");
         * }
         */

        try {
            FileWriter writer = new FileWriter("prova.txt");
            writer.write("Ciao sono Lorenzo \nSto studiando Java!");
            writer.append("\nè divertente!");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileReader reader = new FileReader("prova.txt");
            int data = reader.read();
            while (data != -1) {
                System.out.print((char) data);
                data = reader.read();
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

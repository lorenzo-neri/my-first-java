package OOP;

public class Pizza {
    String impasto;
    String salsa;
    String mozzarella;
    String extra;

    Pizza(String impasto) {
        this.impasto = impasto;
        System.out.println("Ingredienti: " + impasto);
    }

    Pizza(String impasto, String salsa) {
        this.impasto = impasto;
        this.salsa = salsa;
        System.out.println("Ingredienti: " + impasto + ", " + salsa);
    }

    Pizza(String impasto, String salsa, String mozzarella, String extra) {
        this.impasto = impasto;
        this.salsa = salsa;
        this.mozzarella = mozzarella;
        this.extra = extra;
        System.out.println("Ingredienti: " + impasto + ", " + salsa + ", " + mozzarella + ", " + extra);
    }
}

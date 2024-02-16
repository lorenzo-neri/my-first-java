package OOP.Objects;

public class Pizza {
    public String impasto;
    public String salsa;
    public String mozzarella;
    public String extra;

    public Pizza(String impasto) {
        this.impasto = impasto;
        System.out.println("Ingredienti: " + impasto);
    }

    public Pizza(String impasto, String salsa) {
        this.impasto = impasto;
        this.salsa = salsa;
        System.out.println("Ingredienti: " + impasto + ", " + salsa);
    }

    public Pizza(String impasto, String salsa, String mozzarella, String extra) {
        this.impasto = impasto;
        this.salsa = salsa;
        this.mozzarella = mozzarella;
        this.extra = extra;
        System.out.println("Ingredienti: " + impasto + ", " + salsa + ", " + mozzarella + ", " + extra);
    }
}

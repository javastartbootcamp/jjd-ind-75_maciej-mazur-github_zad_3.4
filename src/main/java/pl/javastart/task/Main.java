package pl.javastart.task;

public class Main {

    public static void main(String[] args) {

        Category vegetables = new Category("Warzywa", "Zdrowe warzywa dla każdego");
        Category sweets = new Category("Słodycze", "Coś słodkiego dla każdego");

        Product kalafior = new Product("Kalafior", 5.25, "Świeży kalafior prosto ze wsi", vegetables);
        Product marchew = new Product("Marchew", 3.5, "Dorodna marchew", vegetables);

        Product lody = new Product("Lody", 7.2, "Dobre lody dla ochłody", sweets);

        Product szafa = new Product("Szafa", 230.5, "Nowoczesna szafa", null);

        SpecialOffer ofertaSpecjalna = new SpecialOffer(kalafior, kalafior.description,
                "26-09-2023", "30-09-2023", 0.2);

        System.out.println("Produkt nr 1: \n" +
                kalafior.printInfo());
        System.out.println("\n\nProdukt nr 2: \n" +
                marchew.printInfo());
        System.out.println("\n\nProdukt nr 3: \n" +
                lody.printInfo());
        System.out.println("\n\nProdukt nr 4: \n" +
                szafa.printInfo());
        
    }
}

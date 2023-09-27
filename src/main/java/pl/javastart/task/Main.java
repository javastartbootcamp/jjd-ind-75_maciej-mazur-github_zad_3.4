package pl.javastart.task;

public class Main {

    public static void main(String[] args) {

        Category vegetables = new Category("Vegetables", "Healthy vegetables for everyone");
        Category sweets = new Category("Sweets", "Something sweet for everyone");

        Product cauliflower = new Product("Cauliflower", 5.25, "Fresh cauliflower right from the countryside", vegetables);
        Product carrot = new Product("Carrot", 3.5, "Ripe carrot", vegetables);

        Product iceCream = new Product("Ice cream", 7.2, "Delicious ice cream to let you feel cool", sweets);

        Product wardrobe = new Product("Wardrobe", 230.5, "Modern wardrobe", null);

        SpecialOffer specialOffer = new SpecialOffer(cauliflower, cauliflower.description,
                "26-09-2023", "30-09-2023", 0.2);

        System.out.println("Product No. 1: \n" +
                cauliflower.printInfo());
        System.out.println("\n\nProduct No. 2: \n" +
                carrot.printInfo());
        System.out.println("\n\nProduct No. 3: \n" +
                iceCream.printInfo());
        System.out.println("\n\nProduct No. 4: \n" +
                wardrobe.printInfo());

    }
}

package pl.javastart.task;

import java.util.Formatter;

public class Product {
    String name;
    double price;
    String description;
    Category category;

    public Product(String name, double price, String description, Category category) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
    }

    public String printInfo() {
        Formatter formatter = new Formatter();
        formatter.format("\t%-20s%30s\n\t%-20s%28.2fzł\n\t%-20s%30s\n\t%-20s%30s",
                "Nazwa produktu:", name, "Cena:", price, "Opis:", description,
                "Kategoria:", category == null ? "Brak kategorii" : category.name);
        return formatter.toString();

    }
}

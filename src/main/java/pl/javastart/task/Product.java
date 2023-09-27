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
        formatter.format("\t%-20s%50s\n\t%-20s%48.2fzł\n\t%-20s%50s\n\t%-20s%50s",
                "Product name:", name, "Price:", price, "Description:", description,
                "Category:", category == null ? "No category assigned" : category.name);
        return formatter.toString();

    }
}

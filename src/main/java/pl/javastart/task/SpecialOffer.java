package pl.javastart.task;

public class SpecialOffer {
    Product product;
    String description;
    String startTime;
    String endTime;
    double discount;

    public SpecialOffer(Product product, String description, String startTime, String endTime, double discount) {
        this.product = product;
        this.description = description;
        this.startTime = startTime;
        this.endTime = endTime;
        this.discount = discount;
    }
}

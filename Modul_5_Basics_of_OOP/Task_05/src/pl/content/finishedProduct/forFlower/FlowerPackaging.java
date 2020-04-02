package pl.content.finishedProduct.forFlower;

import pl.content.finishedProduct.Packaging;

public class FlowerPackaging implements Packaging {

    private String type;
    private double price;

    public FlowerPackaging(String type, double price) {

        this.type = type;
        this.price = price;

    }

    @Override
    public double getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }

    public String toString() {
        return type;
    }

}

package pl.content.coinMetal.Metall;

import pl.content.coinMetal.Metal;

public class Silver implements Metal {

    private double price = 0.6;

    public Double getPrice() {
        return price;
    }

    public String toString() {
        return "Silver";
    }
}
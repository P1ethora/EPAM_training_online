package pl.content.coinMetal.Metall;

import pl.content.coinMetal.Metal;

public class Copper implements Metal {

    private double price = 0.07;

    public Double getPrice() {
        return price;
    }

    public String toString() {
        return "Copper";
    }
}
package pl.logic;

import pl.content.Treasure;
import pl.content.coinMetal.Coin;
import pl.content.coinMetal.Metal;

public class Valuation {

    private double price;

    public Valuation(Treasure treasure) {
        price = treasure.getCoin().getWeight() * treasure.getNumber() * treasure.getMetal().getPrice();
    }

    public Valuation(Coin coin, Metal metal, int number) {
        price = coin.getWeight() * number * metal.getPrice();
    }

    public double getPrice() {
        return price;
    }
}
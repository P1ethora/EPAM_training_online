package pl.content;

import pl.logic.Valuation;
import pl.content.coinMetal.Metal;
import pl.content.coinMetal.Coin;

public class Treasure extends Valuation {

    private static int count = 1;
    private int id = 0;
    private int number;
    private Metal metal;
    private Coin coin;

    public Treasure(Coin coin, Metal metal, int number) {
        super(coin, metal, number);
        this.coin = coin;
        this.metal = metal;
        this.number = number;

        id = count++;
    }

    public Metal getMetal() {
        return metal;
    }

    public void setMetal(Metal metal) {
        this.metal = metal;
    }

    public Coin getCoin() {
        return coin;
    }

    public void setCoin(Coin coins) {
        this.coin = coins;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String toString() {
        return "Сокровище № " + id + " содержит " + number + " монет " + metal + ", ценностью - " + getPrice() + "$";
    }

}
package pl.content.coinMetal.Metall;

import pl.content.coinMetal.Metal;

public class Gold implements Metal {

    private double price = 52.82;



    public String toString(){
        return "Gold";
    }

    public Double getPrice() {
        return price;
    }
}
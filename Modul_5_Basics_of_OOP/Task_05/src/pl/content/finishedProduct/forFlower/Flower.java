package pl.content.finishedProduct.forFlower;

import pl.content.finishedProduct.Product;

public class Flower implements Product {

private String sort;
private double price;

public Flower(String sort,double price){

    this.sort=sort;
    this.price=price;

}

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getType() {
        return sort;
    }

    public String toString(){
        return sort;
    }
}

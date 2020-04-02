package pl.logic;

import pl.content.finishedProduct.Packaging;
import pl.content.finishedProduct.Product;

import java.util.ArrayList;

public class Cost {

    private double price;

    public Cost(ArrayList<Product> products, Packaging packaging){

        for (Product product : products) {
            if (product != null)
                price += product.getPrice();
        }
        if (packaging != null)
            price += packaging.getPrice();
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    }
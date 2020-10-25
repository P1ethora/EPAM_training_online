package pl.content.finishedProduct.forGift;

import pl.content.finishedProduct.FinishedProduct;
import pl.content.finishedProduct.Product;
import pl.logic.Cost;

import java.util.ArrayList;

public class Gift extends Cost implements FinishedProduct {
    private ArrayList<Product> sweetness;
    private GiftPackaging giftPackaging;

    public Gift(ArrayList<Product> sweetness, GiftPackaging giftPacking) {
        super(sweetness,giftPacking);
        this.sweetness = sweetness;
        this.giftPackaging= giftPacking;
    }

    public String structure() {

        String structure = "";

        int chocolate = 0;
        int cake = 0;
        int caramel = 0;
        int cookies = 0;
        int marmalade = 0;

        for (Product sweetnes : sweetness) {
            switch (sweetnes.getType()) {
                case "Шоколад":
                    chocolate++;
                    break;
                case "Торт":
                    cake++;
                    break;
                case "Карамель":
                    caramel++;
                    break;
                case "Печенье":
                    cookies++;
                    break;
                case "Мармелад":
                    marmalade++;
                    break;
            }
        }
        if (chocolate != 0) {
            structure += "Шоколад - " + chocolate +" ";
        }
        if (cake != 0) {
            structure += "Торт - " + cake +" ";
        }
        if (caramel != 0) {
            structure += "Карамель - " + caramel +" ";
        }
        if (cookies != 0) {
            structure += "Печенье - " + cookies +" ";
        }
        if (marmalade != 0) {
            structure += "Мармелад - " + marmalade +" ";
        }

        return structure;
    }

    public String toString(){
        return "Сладости: " + structure() +", Упаковка - "+giftPackaging+", Цена - " + getPrice() +"$";
    }

    public ArrayList<Product> getSweetness(){
        return sweetness;
    }

    public GiftPackaging getGiftPackaging(){
        return giftPackaging;
    }
}
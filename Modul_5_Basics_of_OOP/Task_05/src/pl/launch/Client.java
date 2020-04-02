package pl.launch;

import pl.content.finishedProduct.FinishedProduct;
import pl.logic.CreateBouquet;
import pl.logic.CreateGift;

import java.util.ArrayList;
import java.util.Scanner;

public class Client {

    private ArrayList<FinishedProduct> basket = new ArrayList<>();

    public Client() {

        while (true) {
            System.out.println("1-Создать букет/2-Создать подарок/3-Закончить");
            System.out.print("Введите команду: ");
            boolean stop = false;
            switch (new Scanner(System.in).nextInt()) {
                case 1:
                    CreateBouquet createBouquet = new CreateBouquet();
                    basket.add(createBouquet.getBouqet());
                    break;
                case 2:
                    CreateGift createGift = new CreateGift();
                    basket.add(createGift.getGift());
                    break;
                case 3:
                    stop = true;
                    break;
            }
            if (stop) {
                break;
            }
        }
        for (FinishedProduct product : basket) {
            System.out.println(product.toString());
        }
    }
}
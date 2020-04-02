package pl.logic;

import pl.content.Available;
import pl.content.finishedProduct.Product;
import pl.content.finishedProduct.forGift.Gift;
import pl.content.finishedProduct.forGift.GiftPackaging;
import pl.content.finishedProduct.forGift.Sweetness;

import java.util.ArrayList;
import java.util.Scanner;

public class CreateGift extends Available {

    private Gift gift;
    private ArrayList<Product> sweetness;
    private GiftPackaging giftPackaging = null;

    public CreateGift() {

        sweetness = new ArrayList<>();

        gift = new Gift(sweetness, giftPackaging);

        while (true) {
            System.out.println("1 - Добавить сладость вподарок/2 - Выбор упаковки/3 - Просмотр/4 - Завершить");
            boolean stop = false;
            switch (new Scanner(System.in).nextInt()) {

                case 1:
                    Sweetness sweetnes = addSweetness();//TODO сделано по пизданутому убрать это!!!
                    while (sweetnes == null) {
                        sweetnes = addSweetness();
                    }
                    break;

                case 2:
                    giftPackaging = typePackaging();
                    while (giftPackaging == null) {
                        giftPackaging = typePackaging();
                    }
                    break;
                case 3:
                    System.out.println(gift);
                    break;
                case 4:
                    if (sweetness.size() == 0) {
                        System.out.println("В подарке отсутствуют сладости");
                        Sweetness sweet = addSweetness();
                    }//TODO продумать лучше
                    else if (giftPackaging == null) {
                        System.out.println("Подарок без упаковки");
                        giftPackaging = typePackaging();
                    } else {
                        stop = true;
                    }
                    break;
                default:
                    System.out.println("Некорректный ввод");
                    break;
            }
            gift = new Gift(sweetness, giftPackaging);
            if (stop) {
                break;
            }
        }
        System.out.println(gift);
    }


    public Gift getGift() {
        return gift;
    }


    private Sweetness addSweetness() {
        System.out.println("Имеются следующие виды сладостей:");
        for (Sweetness sweetnes:getSweetness()) {
            System.out.println(sweetnes +", цена - " +sweetnes.getPrice() +"$");
        }
        System.out.print("Введите название сладости: ");
        String sweetnesName = new Scanner(System.in).nextLine();
        Sweetness sweetness = compareSweetness(sweetnesName,getSweetness());
        if (sweetness == null) {
            return null;
        }
        int number = addNumberSwetness();
        while (number <= 0) {
            number = 0;
            number = addNumberSwetness();
        }
        for (int i = 0; i < number; i++) {
            this.sweetness.add(sweetness);
        }
        return sweetness;
    }


    private int addNumberSwetness() {
        System.out.print("Введите количество сладостей: ");
        int number = new Scanner(System.in).nextInt();
        if (number <= 0) {
            System.out.println("Некорректный ввод");
            number = 0;
        }
        return number;
    }


    private GiftPackaging typePackaging() {
        System.out.println("Имеются следующие виды упаковок:");
        for (GiftPackaging giftPackaging:getGiftPackagings()) {
            System.out.println(giftPackaging + ", цена - "+giftPackaging.getPrice() +"$");
        }
        System.out.print("Введите тип упаковки: ");
        String namePackaging = new Scanner(System.in).nextLine();
        return compareGiftPacking(namePackaging);
    }

}

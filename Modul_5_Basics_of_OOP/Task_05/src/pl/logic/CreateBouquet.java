package pl.logic;

import pl.content.Available;
import pl.content.finishedProduct.Product;
import pl.content.finishedProduct.forFlower.Bouquet;
import pl.content.finishedProduct.forFlower.Flower;
import pl.content.finishedProduct.forFlower.FlowerPackaging;

import java.util.ArrayList;
import java.util.Scanner;

public class CreateBouquet extends Available {

    private Bouquet bouquet;
    private ArrayList<Product> flowers;
    private FlowerPackaging flowerPackaging = null;

    public CreateBouquet() {

        flowers = new ArrayList<>();

        bouquet = new Bouquet(flowers, flowerPackaging);

        while (true) {
            System.out.println("1 - Добавить вид цветка в букет/2 - Выбор упаковки/3 - Просмотр/4 - Завершить");
            boolean stop = false;
            switch (new Scanner(System.in).nextInt()) {
                //TODO все case повыкидывать в отдельные методы, скорректировать меню, добавить проверки ввода
                case 1:
                    Flower flower = addFlower();//TODO сделано по пизданутому убрать это!!!
                    while (flower == null) {
                        flower = addFlower();
                    }
                    break;

                case 2:
                    flowerPackaging = typePackaging();
                    while (flowerPackaging == null) {
                        flowerPackaging = typePackaging();
                    }
                    break;
                case 3:
                    System.out.println(bouquet);
                    break;
                case 4:
                    if (flowers.size() == 0) {
                        System.out.println("В букете отсутствуют цветы");
                        Flower flower1 = addFlower();
                    }//TODO продумать лучше
                    else if (flowerPackaging == null) {
                        System.out.println("В букете отсутствует упаковка");
                        flowerPackaging = typePackaging();
                    } else {
                        stop = true;
                    }
                    break;
                default:
                    System.out.println("Некорректный ввод");
                    break;
            }
            bouquet = new Bouquet(flowers, flowerPackaging);
            if (stop) {
                break;
            }
        }
        System.out.println(bouquet);
    }


    public Bouquet getBouqet() {
        return bouquet;
    }


    private Flower addFlower() {
        System.out.println("Имеются следующие виды цветов:");
        for (Flower flower:getFlowers()) {
            System.out.println(flower +", цена - " +flower.getPrice() +"$");
        }
        System.out.print("Введите имя цветка: ");
        String flowerName = new Scanner(System.in).nextLine();
        Flower flower = compareFlower(flowerName);
        if (flower == null) {
            return null;
        }
        int number = addNumberFlower();
        while (number <= 0) {
            number = 0;
            number = addNumberFlower();
        }
        for (int i = 0; i < number; i++) {
            flowers.add(flower);
        }
        return flower;
    }


    private int addNumberFlower() {
        System.out.print("Введите количество цветов: ");
        int number = new Scanner(System.in).nextInt();
        if (number <= 0) {
            System.out.println("Некорректный ввод");
            number = 0;
        }
        return number;
    }


    private FlowerPackaging typePackaging() {
        System.out.println("Имеются следующие виды упаковок:");
        for (FlowerPackaging flowerPackaging:getFlowerPackagings()) {
            System.out.println(flowerPackaging + ", цена - "+flowerPackaging.getPrice() +"$");
        }
        System.out.print("Введите тип упаковки: ");
        String nameFlowerPackaging = new Scanner(System.in).nextLine();
        return compareFlowerPacking(nameFlowerPackaging);
    }
}
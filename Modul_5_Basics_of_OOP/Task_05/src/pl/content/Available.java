package pl.content;

import pl.content.finishedProduct.forFlower.Flower;
import pl.content.finishedProduct.forFlower.FlowerPackaging;
import pl.content.finishedProduct.forGift.GiftPackaging;
import pl.content.finishedProduct.forGift.Sweetness;

import java.util.ArrayList;

public class Available {

    private ArrayList<Flower> flowers = new ArrayList<>();
    private ArrayList<FlowerPackaging> flowerPackagings = new ArrayList<>();

    private ArrayList<Sweetness> sweetness = new ArrayList<>();
    private ArrayList<GiftPackaging> giftPackagings = new ArrayList<>();

    public Available() {

        flowers.add(new Flower("Роза", 4));
        flowers.add(new Flower("Орхидея", 15));
        flowers.add(new Flower("Гвоздика", 3));
        flowers.add(new Flower("Ромашка", 1));
        flowers.add(new Flower("Нарцисс", 1));

        flowerPackagings.add(new FlowerPackaging("Яркая", 2));
        flowerPackagings.add(new FlowerPackaging("Блестящая", 2));
        flowerPackagings.add(new FlowerPackaging("Сияющая", 4));

        sweetness.add(new Sweetness("Шоколад", 1.5));
        sweetness.add(new Sweetness("Торт", 7));
        sweetness.add(new Sweetness("Карамель", 4));
        sweetness.add(new Sweetness("Печенье", 3));
        sweetness.add(new Sweetness("Мармелад", 2));

        giftPackagings.add(new GiftPackaging("Глянцевая", 1));
        giftPackagings.add(new GiftPackaging("Блистер", 0.1));
        giftPackagings.add(new GiftPackaging("Коробка", 0.3));

    }

    public void addFlower(Flower flower) {
        flowers.add(flower);
    }

    public void addFlowerPackaging(FlowerPackaging flowerPackaging) {
        flowerPackagings.add(flowerPackaging);
    }
/*
    public Flower compareFlower(String name) {
        switch (name) {
            case "Роза":
                return flowers.get(0);
            case "Орхидея":
                return flowers.get(1);
            case "Гвоздика":
                return flowers.get(2);
            case "Ромашка":
                return flowers.get(3);
            case "Нарцисс":
                return flowers.get(4);
            default:
                System.out.println("Цветок отсутствует");
                break;
        }
        return null;
    }

    public FlowerPackaging compareFlowerPackagins(String name) {
        switch (name) {
            case "Яркая":
                return flowerPackagings.get(0);
            case "Блестящая":
                return flowerPackagings.get(1);
            case "Сияющая":
                return flowerPackagings.get(2);
            default:
                System.out.println("Упаковка отсутствует");
                break;
        }
        return null;
    }*/

    public ArrayList<Flower> getFlowers(){
        return flowers;
    }

    public ArrayList<FlowerPackaging> getFlowerPackagings(){
        return flowerPackagings;
    }

    public ArrayList<Sweetness> getSweetness(){
        return sweetness;
    }

    public ArrayList<GiftPackaging> getGiftPackagings(){
        return giftPackagings;
    }


    public Sweetness compareSweetness(String name,ArrayList<Sweetness> arrayList){
        for (Sweetness sweetness: arrayList) {
            if (sweetness.getType().equals(name)) {
                return sweetness;
            }
        }
System.out.println("Сладость отсутствует");
return null;
    }

    public GiftPackaging compareGiftPacking(String name){
        for (GiftPackaging packaging: giftPackagings) {
            if (packaging.getType().equals(name)) {
                return packaging;
            }
        }
        System.out.println("Упаковка отсутствует");
        return null;
    }

    public Flower compareFlower(String name){
        for (Flower flower: flowers) {
            if (flower.getType().equals(name)) {
                return flower;
            }
        }
        System.out.println("Цветок отсутствует");
        return null;
    }

    public FlowerPackaging compareFlowerPacking(String name){
        for (FlowerPackaging flowerPackaging: flowerPackagings) {
            if (flowerPackaging.getType().equals(name)) {
                return flowerPackaging;
            }
        }
        System.out.println("Упаковка отсутствует");
        return null;
    }

}
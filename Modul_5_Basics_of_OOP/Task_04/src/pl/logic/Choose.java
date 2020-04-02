package pl.logic;

import pl.content.Dungeon;
import pl.content.Treasure;

import java.util.*;

public class Choose {

    public void maxPrice(Dungeon dungeon) {
        System.out.println("Самое дорогое сокровище:");
        dungeon.getTreasures().sort((Comparator.comparing(Treasure::getPrice)));
        System.out.println(dungeon.getTreasures().get(99));
    }


    public void specified(Dungeon dungeon) {
        boolean check = false;
        System.out.print("Введите сумму: ");
        double specified = new Scanner(System.in).nextDouble();

        for (Treasure treasure : dungeon.getTreasures()) {
            if (treasure.getPrice() == specified) {
                System.out.println(treasure);
                check = true;
            }
        }
        if (!check) {
            ArrayList<Treasure> max = new ArrayList<>();
            ArrayList<Treasure> min = new ArrayList<>();
            System.out.println("Сокровища на заданую сумму нет");

            for (Treasure treasure : dungeon.getTreasures()) {

                if (specified > treasure.getPrice()) {
                    max.add(treasure);
                } else if (specified < treasure.getPrice()) {
                    min.add(treasure);
                }

            }

            Treasure minMax = max.get(0);
            Treasure maxMin = min.get(0);

            for (Treasure treasure : max) {
                if (treasure.getPrice() > minMax.getPrice())
                    minMax = treasure;
            }
            for (Treasure treasure : min) {
                if (treasure.getPrice() < maxMin.getPrice())
                    maxMin = treasure;
            }

            double minNumber = specified - minMax.getPrice();
            double maxNumber = maxMin.getPrice() - specified;
            System.out.println("Наиболее близкое по значению: ");
            if (maxNumber < minNumber) {
                System.out.println(maxMin);
            } else {
                System.out.println(minMax);
            }
        }
    }
}
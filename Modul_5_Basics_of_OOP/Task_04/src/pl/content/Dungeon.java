package pl.content;

import pl.logic.Choose;

import java.util.ArrayList;

public class Dungeon extends Choose {

    private ArrayList<Treasure> treasures = new ArrayList<>();

    public void print() {
        for (Treasure treasure : getTreasures()) {
            System.out.println(treasure);
        }
    }


    public ArrayList<Treasure> getTreasures() {
        return treasures;
    }

    public void addTreasure(Treasure treasure) {
        treasures.add(treasure);
    }
}
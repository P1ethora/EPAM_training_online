package pl.logic;

import pl.content.Dungeon;
import pl.content.Treasure;

import pl.content.coinMetal.Coin;
import pl.content.coinMetal.Metal;
import pl.content.coinMetal.Metall.Copper;
import pl.content.coinMetal.Metall.Gold;
import pl.content.coinMetal.Metall.Silver;


import java.util.Random;

public class FillDungeon {

    private Metal[] metal = {new Gold(), new Silver(), new Copper()};

    public FillDungeon(Dungeon dungeon) {

        Random random = new Random();
        for (int i = 0; i < 100; i++) {

            dungeon.addTreasure(new Treasure(new Coin(),metal[random.nextInt(metal.length)],(int) (100 + Math.random() * 1000)));

        }

    }

}

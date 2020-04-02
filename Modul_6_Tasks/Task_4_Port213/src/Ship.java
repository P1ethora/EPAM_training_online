import java.util.Random;

public class Ship {

    int cargo;

    Ship() {

        int[] cargo12 = {0, 25};
        Random rnd = new Random();
        cargo = cargo12[rnd.nextInt(2)];

    }
}




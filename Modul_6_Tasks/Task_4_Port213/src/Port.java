import java.util.concurrent.*;    //потокобезопасная библиотека

public class Port {

    int containers = 1000;

    static BlockingQueue<Ship> queue = new ArrayBlockingQueue<Ship>(10);    // Сюда поступают корабли


    public Port() {

        ExecutorService dock = Executors.newFixedThreadPool(4);    // Пулл потоков

        for (int i = 0; i < 3; i++) {                                      //3 задания Dock
            dock.submit(new Dock());                                       //Старт 3 потоков
        }
        dock.submit(new MoveShips());                                       //задание MoveShips


    }
}
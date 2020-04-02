import java.util.ArrayList;

public class Car {

    private Engine engine;
    private Wheel wheel;
    private ArrayList<Wheel> wheels;

    private String make;

    public Car(Engine engine, Wheel wheel, int wheelNumber, String make) {
        this.engine = engine;
        this.wheel = wheel;
        this.make = make;

        wheels = new ArrayList<>();
        for (int i = 0; i < wheelNumber; i++)
            wheels.add(new Wheel(wheel.getModel()));
    }

    public void move() {
        engine.performance(true);
        wheel.rotating(true);
        System.out.println("Автомобиль тронулся");
    }

    public void stop() {
        wheel.rotating(false);
        engine.performance(false);
        System.out.println("Автомобиль остановился");
    }

    public void changeWheel() {
        System.out.println("Колесо заменено");
    }

    public void fillUp() {
        System.out.println("Бак заполнен");
    }

    public void print() {
        System.out.println(make);
    }

    public ArrayList<Wheel> getWheels() {
        return wheels;
    }
}
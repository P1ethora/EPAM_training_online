/**
 * Создать объект класса Автомобиль, используя классы Колесо, Двигатель.
 * Методы: ехать, заправляться, менять колесо, вывести на консоль марку автомобиля.
 */

public class Main {

    public static void main(String[] args) {

        Car car = new Car(new Engine("6.6"), new Wheel("Solus"), 4, "Rolls-Royce Wraith");

        car.move();
        car.stop();
        car.fillUp();
        car.changeWheel();
        car.print();

    }
}
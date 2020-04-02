/**
 * Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать
 * свое значение на единицу в заданном диапазоне. Предусмотрите инициализацию счетчика значениями
 * по-умолчанию и произвольными значениями. Счетчик имеет методы увеличения и уменьшения состояния,
 * и метод позволяющее получить его текущее состояние. Написать код, демонстрирующий все
 * возможности класса.
 */

public class Main {

    public static void main(String[] args) throws Exception {
        print(new Counter(10, 1, 1));
        print(new Counter());
    }

    private static void print(Counter name) throws Exception {
        System.out.println("Min - " + name.getMin() + ", Max - " + name.getMax() + ", Current - " + name.getCurrentValue());
        name.getNext();
        System.out.print("Next - " + name.getCurrentValue());
        name.getPrior();
        System.out.println(", Prior - " + name.getCurrentValue());
    }
}
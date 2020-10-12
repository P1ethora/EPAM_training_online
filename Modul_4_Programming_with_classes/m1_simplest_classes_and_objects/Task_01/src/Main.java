/**
 * Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и
 * методы изменения этих переменных. Добавьте метод, который находит сумму
 * значений этих переменных, и метод, который находит наибольшее значение
 * из этих двух переменных.
 */

public class Main {

    public static void main(String[] args) {
        Test1 test1 = new Test1();
        test1.setA(10);
        test1.setB(9);
        System.out.println(test1);
        test1.sum();
        test1.max();
    }
}
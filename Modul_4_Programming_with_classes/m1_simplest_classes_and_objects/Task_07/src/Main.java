/**
 * Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов,
 * вычисления площади, периметра и точки пересечения медиан.
 */

public class Main {

    public static void main(String[] args) {
        Triangle triangle = new Triangle(new Point(5, 1), new Point(9, 3), new Point(3, 4));
        System.out.print(triangle);

    }
}
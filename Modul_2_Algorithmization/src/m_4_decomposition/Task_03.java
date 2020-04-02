package m_4_decomposition;

/**
 * Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади
 * треугольника.
 */

public class Task_03 {

    public static void main(String[] args) {
        System.out.printf("%.2f", square(7.0));
    }

    private static double square(double a) {
        return (3 * Math.pow(a, 2) * Math.sqrt(3)) / 2;
    }
}
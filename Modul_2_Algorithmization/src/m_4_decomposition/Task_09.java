package m_4_decomposition;

/**
 * Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) вычисления его площади,
 * если угол между сторонами длиной X и Y— прямой.
 */

public class Task_09 {

    public static void main(String[] args) {

        surface(5, 8, 7, 10, 90);

    }

    private static void surface(double x, double y, double z, double t, double degree) {

        if (degree == 90) {
            double diagonal = Math.sqrt(Math.pow(x, 2) + Math.pow(t, 2));

            double s1 = pAndS(x, t, diagonal);
            double s2 = pAndS(y, z, diagonal);
            double sum = s1 + s2;
            System.out.println(sum);
        } else {
            System.out.println("Угол не равен 90°");
        }
    }

    private static double pAndS(double one, double two, double diagonal) {

        double p = (one + two + diagonal) / 2;
        double s = Math.sqrt(p * (p - one) * (p - diagonal) * (p - two));
        return s;
    }
}
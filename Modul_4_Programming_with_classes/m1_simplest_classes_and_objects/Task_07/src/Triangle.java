import java.math.BigDecimal;
import java.math.RoundingMode;

public class Triangle {

    private Point a;
    private Point b;
    private Point c;

    private double sideAB;
    private double sideBC;
    private double sideAC;

    private double perimeter;
    private double area;
    private Point crossMeridians;

    public Triangle(Point a, Point b, Point c) {

        Calculate calculate = new Calculate(this);

        double ab = calculate.sideTriangle(a, b);
        double bc = calculate.sideTriangle(b, c);
        double ac = calculate.sideTriangle(a, c);
        if (ab + ac < bc || ab + bc < ac || ac + bc < ab)
            throw new IllegalArgumentException("Неверное значение");

        this.a = a;
        this.b = b;
        this.c = c;
        sideAB = ab;
        sideBC = bc;
        sideAC = ac;

        perimeter = calculate.perimeter();
        area = calculate.area();
        crossMeridians = calculate.crossMeridians();
    }

    public Point getA() {
        return a;
    }

    public Point getB() {
        return b;
    }

    public Point getC() {
        return c;
    }

    public double getAbSide() {
        return sideAB;
    }

    public double getBcSide() {
        return sideBC;
    }

    public double getAcSide() {
        return sideAC;
    }


    public String toString() {
        return "Точки :" + " a = " + a.toString() + " b = " + b.toString() + " c = " + c.toString() + "\n" +
                "Стороны :" + " AB = " + sideAB + ", BC = " + sideBC + ", AC = " + sideAC + "\n" +
                "Периметр = " + perimeter + "\n" +
                "Площадь = " + area + "\n" +
                "Перессечение меридиан в точке " + crossMeridians;
    }
}
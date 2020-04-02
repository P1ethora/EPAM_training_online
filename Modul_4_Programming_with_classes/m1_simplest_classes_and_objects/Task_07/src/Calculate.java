import java.math.BigDecimal;
import java.math.RoundingMode;

public class Calculate {

    private Triangle triangle;

    public Calculate(Triangle triangle) {
        this.triangle = triangle;
    }

    public double sideTriangle(Point a, Point b) {
        return round(Math.sqrt(Math.pow(a.getX() - b.getY(), 2) + Math.pow(a.getY() + b.getY(), 2)), 2);
    }

    public double perimeter() {
        return triangle.getAbSide() + triangle.getBcSide() + triangle.getAcSide();
    }

    public double area() {
        double semiPerimeter = 0.5 * this.perimeter();
        return round(Math.sqrt(semiPerimeter * (semiPerimeter - triangle.getAbSide()) *
                (semiPerimeter - triangle.getBcSide()) * (semiPerimeter - triangle.getAcSide())), 2);
    }

    public Point crossMeridians() {
        double x = round((triangle.getA().getX() + triangle.getB().getX() + triangle.getC().getX()) / 3.0, 2);
        double y = round((triangle.getA().getY() + triangle.getB().getY() + triangle.getC().getY()) / 3.0, 2);
        return new Point(x, y);
    }

    private static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        BigDecimal bd = new BigDecimal(Double.toString(value));
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
}
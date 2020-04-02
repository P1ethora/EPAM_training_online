public class Main {

    public static void main(String[] args) {

        Test2 test2 = new Test2(10, 11);
        System.out.println("Заданные значение - " + test2.getA() + ", " + test2.getB());
        Test2 test3 = new Test2();
        System.out.println("Значения по умолчанию - " + test3.getA() + ", " + test3.getB());
    }

}

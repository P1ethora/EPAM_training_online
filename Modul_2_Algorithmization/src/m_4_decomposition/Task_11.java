package m_4_decomposition;

/**
 * Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.
 */

public class Task_11 {

    public static void main(String[] args) {
        detect(12345, 123478);

    }

    private static void detect(int a, int b) {
        int aSize = String.valueOf(a).length();
        int bSize = String.valueOf(b).length();
        if (aSize > bSize) System.out.println("В числе " + "\"" + "a" + "\"" + " цифр больше");
        else if (aSize < bSize) System.out.println("В числе " + "\"" + "b" + "\"" + " цифр больше");
        else {
            System.out.println("Равное количество");
        }
    }
}
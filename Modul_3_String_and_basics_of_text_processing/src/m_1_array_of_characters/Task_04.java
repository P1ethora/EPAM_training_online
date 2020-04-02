package m_1_array_of_characters;

/**
 * В строке найти количество чисел
 */

public class Task_04 {

    public static void main(String[] args) {

        String text = "text 123 text 1 text 111111111";

        int count = 0;
        char[] array = text.toCharArray();

        for (int i = 0; i < array.length - 1; i++) {
            if (Character.isDigit(array[i])) {
                if (!Character.isDigit(array[i + 1])) {
                    count++;
                }
            }
        }
        if (Character.isDigit(array[array.length - 1])) {
            count++;
        }
        System.out.println(count);
    }
}
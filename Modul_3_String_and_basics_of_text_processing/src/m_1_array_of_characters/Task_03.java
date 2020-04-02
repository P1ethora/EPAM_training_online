package m_1_array_of_characters;

/**
 * В строке найти количество цифр.
 */

public class Task_03 {

    public static void main(String[] args) {
        String text = "1a2b3c";
        System.out.println(search(text));
    }

    private static int search(String text) {
        char[] array = text.toCharArray();
        int count = 0;

        for (char token : array) {
            if (Character.isDigit(token))
                count++;
        }
        return count;
    }
}
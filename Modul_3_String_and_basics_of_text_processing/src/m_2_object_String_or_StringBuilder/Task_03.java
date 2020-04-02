package m_2_object_String_or_StringBuilder;

/**
 * Проверить, является ли заданное слово палиндромом.
 */

public class Task_03 {

    public static void main(String[] args) {
        String word = "level",
                word1 = "java",
                word2 = "noon";
        System.out.println(check(word) + "\n" + check(word1) + "\n" + check(word2));
    }

    private static boolean check(String text) {
        while (text.length() > 1) {
            if (!text.endsWith(text.substring(0, 1)))
                return false;
            text = text.substring(1, text.length() - 1);

        }
        return true;
    }
}
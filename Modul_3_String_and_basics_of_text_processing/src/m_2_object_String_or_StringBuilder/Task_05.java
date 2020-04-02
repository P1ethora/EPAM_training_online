package m_2_object_String_or_StringBuilder;

/**
 * Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.
 */

public class Task_05 {

    public static void main(String[] args) {
        String word = "England";
        String sign = "a";
        System.out.println(countLetterAppearance(word, sign));

    }

    private static int countLetterAppearance(String word, String sign) {
        int count = 0;
        int index;
        while ((index = word.indexOf(sign)) != -1) {
            count++;
            if (index != word.length() - 1)
                word = word.substring(index + 1);
            else break;
        }
        return count;
    }
}
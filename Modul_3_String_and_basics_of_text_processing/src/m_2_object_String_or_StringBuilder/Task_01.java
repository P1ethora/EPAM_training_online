package m_2_object_String_or_StringBuilder;

/**
 * Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.
 */

public class Task_01 {

    public static void main(String[] args) {
        String text = "Text     text  text      text.";
        System.out.println(search(text));
    }

    private static int search(String s) {
        int maxValue = 0;
        int index = -1;
        while (index < s.length() && (index = s.indexOf(" ", ++index)) > -1) {
            int value = 1;

            while (index < s.length() - 1 && s.charAt(++index) == ' ') {
                value++;
            }

            if (maxValue < value) {
                maxValue = value;
            }
        }
        return maxValue;
    }
}
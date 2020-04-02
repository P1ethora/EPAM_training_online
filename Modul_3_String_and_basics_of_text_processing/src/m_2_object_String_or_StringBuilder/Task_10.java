package m_2_object_String_or_StringBuilder;

/**
 * Строка X состоит из нескольких предложений, каждое из которых кончается точкой,
 * восклицательным или вопросительным знаком. Определить количество предложений в строке X.
 */

public class Task_10 {

    public static void main(String[] args) {
        String text = "Предложение. Предложение! Предложение?";
        System.out.println(parser(text));
    }

    private static int parser(String text) {
        int count = 0;
        count += text.split(".").length;
        count += text.split("!").length;
        count += text.split("\\?").length;
        return count;
    }
}
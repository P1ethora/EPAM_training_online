package m_2_object_String_or_StringBuilder;

/**
 * С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”.
 */

public class Task_04 {

    public static void main(String[] args) {
        String word = "информатика";
        System.out.println(builder(word));
    }

    private static String builder(String word) {
        char[] array = word.toCharArray();
        String newWord = "";
        newWord = newWord.concat(String.copyValueOf(array, 7, 1))
                .concat(String.copyValueOf(array, 3, 2))
                .concat(String.copyValueOf(array, 7, 1));
        return newWord;
    }
}
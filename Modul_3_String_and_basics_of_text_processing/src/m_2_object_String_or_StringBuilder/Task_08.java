package m_2_object_String_or_StringBuilder;

/**
 * Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран. 
 * Случай, когда самых длинных слов может быть несколько, не обрабатывать.
 */

public class Task_08 {

	public static void main(String[] args) {
		String text = "In the red field, a silver knight's cross";
		System.out.println(search(text));

	}

	private static String search(String text) {
		String[] words = text.split(" ");
		String maxWordLength = words[0];
		int WordLength = words[0].length();
		int length;
		for (int i = 1; i < words.length; i++) {
			if ((length = words[i].length()) > WordLength) {
				maxWordLength= words[i];
				WordLength = length;
			}
		}
		return maxWordLength;
	}
}
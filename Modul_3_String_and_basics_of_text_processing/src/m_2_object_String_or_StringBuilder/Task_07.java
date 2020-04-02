package m_2_object_String_or_StringBuilder;

/**
 * Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы. 
 * Например, если было введено "abc cde def", то должно быть выведено "abcdef".
 */

public class Task_07 {

	public static void main(String[] args) {
		String text = "abc cde def";
		System.out.println(edit(text));
	}

	private static String edit(String text) {
		text=text.replaceAll(" ", "");
		StringBuilder stringBuilder = new StringBuilder(text);
		for (int i = 0; i < stringBuilder.length() - 1; i++) {
			String sign = String.valueOf(stringBuilder.charAt(i));
			int index;

			while ((index = stringBuilder.indexOf(sign, i + 1)) != -1)
				stringBuilder.deleteCharAt(index);

		}
		return stringBuilder.toString();
	}
}
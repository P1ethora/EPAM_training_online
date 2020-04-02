package m_1_linearArrays;

import java.util.Arrays;

/**
 *В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. 
 *Если таких чисел несколько, то определить наименьшее из них.
 */

public class Task_09 {

	public static void main(String[] args) {

		int[] list = { 3, 2, 3, 2, 3, 2, 3, 2, 3, 3 };

		System.out.println(detect(list));
	}

	private static int detect(int[] mass) {
		int[] list = Arrays.copyOf(mass, mass.length);
		int muchRepeat = -1;
		int maxCount = -1;

		for (int i = 0; i < list.length; i++) {
			if (i != 0 && list[i] == list[0]) continue;
			int count = 1;

			if (i < list.length - 1) {
				for (int j = i + 1; j < list.length; j++) {
					if (list[i] == list[j]) {
						count = count + 1;
						list[j] = list[0];
					}
				}
			}

			if (maxCount < count) {
				maxCount = count;
				muchRepeat = list[i];
			} else if (maxCount == count && muchRepeat > list[i]) {
				muchRepeat = list[i];
			}
		}
		
		return muchRepeat;
	}
}
package fr.algorithmie;

import java.util.Arrays;

public class InversionContenu {

	public static void main(String[] args) {
		int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };
		System.out.println(Arrays.toString(array));

		int[] arrayCopy = array.clone();
		for (int i = arrayCopy.length - 1; i >= 0;) {
			int temp = array[i];
			array[i] = array[array.length - 1 - i];
			array[array.length - 1 - i] = temp;
			System.out.println(Arrays.toString(array));
			break;
		}

	}

}

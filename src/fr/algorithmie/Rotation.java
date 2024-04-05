package fr.algorithmie;

import java.util.Arrays;

public class Rotation {

	public static void main(String[] args) {
		int[] tableau = { 0, 1, 2, 3 };

		int dernierElement = tableau[tableau.length - 1];

		for (int i = dernierElement; i > 0; i--) {
			tableau[i] = tableau[i - 1];
		}

		tableau[0] = dernierElement;
		System.out.println(Arrays.toString(tableau));

	}
}

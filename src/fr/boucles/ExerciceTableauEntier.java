package fr.boucles;

import java.util.Arrays;

public class ExerciceTableauEntier {

	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println(numbers[0]);
		System.out.println(numbers.length);
		System.out.println(numbers[numbers.length-1]);
		numbers[4] = 8;
		System.out.println(numbers[4]);
	}

}

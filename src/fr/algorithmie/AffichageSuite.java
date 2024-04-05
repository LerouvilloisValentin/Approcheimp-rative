package fr.algorithmie;

public class AffichageSuite {

	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		for (int number : numbers) {
			System.out.println(number);
		}
		for (int i = 1; i < 11; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 1) {
				System.out.println(i);
			}
		}
		int i = 0;
			while (i < numbers.length) {
			System.out.println(numbers[i]);
			i++;
		}
		i =0;
		while (i <= 10) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
			i++;
		}
		i =0;
		while (i <= 10) {
			if (i % 2 == 1) {
				System.out.println(i);
			}
			i++;
		}

	}

}

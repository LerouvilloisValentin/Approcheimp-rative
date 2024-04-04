package fr.boucles;

public class ExerciceBoucleBase {

	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		for (int number : numbers) {
//			System.out.println(number);
		}
		String[] names = { "lerouvillois valentin" };
		for (String name : names) {
			for (int i = 0; i < 10; i++) {
//				System.out.println(name);
			}
		}
		for (int i = 2; i < 101; i++)
			if (i % 2 == 0) {
//				System.out.println(i);

			}
		for (int i = 1; i < 100; i++)
			if (i % 2 == 1) {
				System.out.println(i);

			}


	}

}

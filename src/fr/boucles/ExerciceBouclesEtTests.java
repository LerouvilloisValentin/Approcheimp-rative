package fr.boucles;

public class ExerciceBouclesEtTests {

	public static void main(String[] args) {
		int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };
		for (int elementOfArray : array) {
//			System.out.println(elementOfArray);
		}
		for (int i = array.length - 1; i >= 0; i--) {
//            System.out.println(array[i]);
		}
		for (int elementOfArray : array) {
			if (elementOfArray >= 3)
				System.out.println(elementOfArray);
		}
	}

}

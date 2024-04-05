package fr.algorithmie;

public class FirstLast6 {

	public static void main(String[] args) {
		int[] array = { 6, 4, 5, 7 };

		if (array.length - 1 == 6 || array[0] == 6 && array.length >= 1) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

	}

}

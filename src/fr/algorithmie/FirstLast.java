package fr.algorithmie;

public class FirstLast {

	public static void main(String[] args) {
		int[] array = { 6, 4, 5, 6 };
		int lastElement = array[array.length - 1];

		if (lastElement == array[0] && array.length >= 1) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

}

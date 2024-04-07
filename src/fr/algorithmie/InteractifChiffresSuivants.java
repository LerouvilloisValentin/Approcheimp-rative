package fr.algorithmie;

import java.util.Scanner;

public class InteractifChiffresSuivants {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int nb;
		System.out.println("Proposez un chiffre entre 1 et 10:");
		nb = scanner.nextInt();
		for (int i = 0; i < 10; i++) {
			System.out.println(nb += 1);
			;
		}

	}

}

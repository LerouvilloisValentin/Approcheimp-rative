package fr.algorithmie;

import java.util.Scanner;

public class InteractifSommeArithmetique {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int nb;
		int somme = 0;
		System.out.println("Proposez un chiffre entre 1 et 10:");
		nb = scanner.nextInt();
		for (int i = 1; i < nb; i++) {
			somme += i;
		}
		System.out.println(somme + nb);
	}

}

package fr.algorithmie;

import java.util.Scanner;

public class InteractifTableMult {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Veuillez saisir un nombre entre 1 et 10 :");
		int nb;
		do {
			nb = scanner.nextInt();
			if (nb < 1 || nb > 10) {
				System.out.println("Le nombre saisi doit être entre 1 et 10. Veuillez réessayer :");
			}
		} while (nb < 1 || nb > 10);
		{
			System.out.println("Vous avez bien saisie:" + nb);
			for (int i = 0; i < 10; i++) {
				System.out.println(nb + "x" + i + "=" + (i * nb));
			}
		}

		scanner.close();
	}

}

package fr.algorithmie;

import java.util.Scanner;

public class InteractifTantQue {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Veuillez saisir un nb:");
		int nb;
		do{
			nb = scanner.nextInt();
			 if (nb < 1 || nb > 10) {
	                System.out.println("Le nombre saisi doit être entre 1 et 10. Veuillez réessayer :");
	            }
		} while (nb <1 || nb >10); 
		{
			System.out.println("Vous avez tout compris : " + nb);
		}

		scanner.close();
	}

}

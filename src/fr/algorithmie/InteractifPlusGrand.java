package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusGrand {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int nb;
		int max = 0;
	
		System.out.println("Proposez 10 nombres:");
		for(int i =0 ; i<10; i++) {
			nb = scanner.nextInt();
			if(nb> max) {
				max=nb;
			}
		}
		System.out.println("Le chiffre le plus grand été " + max);

	}

}

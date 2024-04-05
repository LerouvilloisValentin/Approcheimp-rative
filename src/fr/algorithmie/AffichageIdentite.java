package fr.algorithmie;

public class AffichageIdentite {

	public static void main(String[] args) {
		String[] identities = { "valentin Lerouvillois 30 ans" };
		for (String identity : identities) {
			for (int i = 0; i < 10; i++) {
				System.out.println(identity);
			}
		}

	}

}

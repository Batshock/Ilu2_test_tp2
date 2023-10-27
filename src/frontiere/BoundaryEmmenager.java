package frontiere;

import controleur.ControlEmmenager;

public class BoundaryEmmenager {
	private ControlEmmenager controlEmmenager;

	public BoundaryEmmenager(ControlEmmenager controlEmmenager) {
		this.controlEmmenager = controlEmmenager;
	}

	public void emmenager(String nomVisiteur) {
		if (controlEmmenager.isHabitant(nomVisiteur)) {
			System.out.println(
					"Mais vous Êtes déjà  un habitant du village !");
		} else {
			StringBuilder question = new StringBuilder();
			question.append("Êtes-vous :\n");
			question.append("1 - un druide.\n");
			question.append("2 - un gaulois.\n");
			int choixUtilisateur = -1;
			do {
				choixUtilisateur = Clavier.entrerEntier(question.toString());
				switch (choixUtilisateur) {
				case 1:
					emmenagerDruide(nomVisiteur);
					break;

				case 2:
					//TODO a completer
					question.append("Quelle est votre force ?\n");
					int choixForce = -1;
					do {
						choixForce = Clavier.entrerEntier(question.toString());
					}
					while (choixForce < 1);
					controlEmmenager.ajouterGaulois(nomVisiteur,choixForce);
					break;

				default:
					System.out
							.println("Vous devez choisir le chiffre 1 ou 2 !");
					break;
				}
			} while (choixUtilisateur != 1 && choixUtilisateur != 2);
		}
	}

	private void emmenagerDruide(String nomVisiteur) {
		//TODO a completer
		StringBuilder question = new StringBuilder();
		System.out.println("Quelle est votre force ?\n");
		int choixForce = -1;
		do {
			choixForce = Clavier.entrerEntier(question.toString());
		} while (choixForce < 1);
		System.out.println("Quelle est la force de potion la plus faible que vous produisez ?\n");
		int choixEffetPotionMin = -1;
		do {
			choixEffetPotionMin = Clavier.entrerEntier(question.toString());
		} while (choixEffetPotionMin < 1);
		System.out.println("Quelle est la force de potion la plus forte que vous produisez ?\n");
		int choixEffetPotionMax = -1;
		do {
			choixEffetPotionMax = Clavier.entrerEntier(question.toString());
		} while (choixEffetPotionMax < choixEffetPotionMin);
	
		controlEmmenager.ajouterDruide(nomVisiteur, choixForce, choixEffetPotionMin, choixEffetPotionMax);
	}
}

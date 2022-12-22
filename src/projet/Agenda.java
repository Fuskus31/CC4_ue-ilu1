package projet;

class Agenda {
	Tache[] taches;
	int nbTaches;

	public Agenda() {
		taches = new Tache[100];
		nbTaches = 0;
	}

	public void ajouterTache(Tache tache) {
		taches[nbTaches] = tache;
		nbTaches++;
	}

	public void supprimerTache(Tache tache) {
		for (int i = 0; i < nbTaches; i++) {
			if (taches[i] == tache) {
				for (int j = i; j < nbTaches - 1; j++) {
					taches[j] = taches[j + 1];
				}
				nbTaches--;
				break;
			}
		}
	}

	public void afficherTaches() {
		for (int i = 0; i < nbTaches; i++) {
			System.out.println(taches[i].nom + " (" + taches[i].categorie + ") : " + taches[i].heures + " heures");
			System.out.print("Personnes impliquées : ");
			for (int j = 0; j < taches[i].personnes.length; j++) {
				System.out.print(taches[i].personnes[j] + " ");
			}
			System.out.println();
		}
	}

}
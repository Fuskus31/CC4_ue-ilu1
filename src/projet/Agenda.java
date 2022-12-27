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

	public Tache getTaches() {
		return taches[0];
	}

	public void setTaches(Tache[] taches) {
		this.taches = taches;
	}

	public int getNbTaches() {
		return nbTaches;
	}

	public void setNbTaches(int nbTaches) {
		this.nbTaches = nbTaches;
	}

}
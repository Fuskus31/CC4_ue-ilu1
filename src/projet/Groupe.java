package projet;

class Groupe extends Agenda {
	Personne[] personnes;

	public Groupe() {
		super();
		personnes = new Personne[100];
	}

	public void ajouterPersonne(Personne personne) {
		int i = 0;
		while (personnes[i] != null) {
			i++;
		}
		personnes[i] = personne;
	}
}
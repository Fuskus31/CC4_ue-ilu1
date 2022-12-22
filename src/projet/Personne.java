package projet;

class Personne extends Agenda {
	String nom;

	public Personne(String nom) {
		super();
		this.nom = nom;
	}

	public void afficherNom() {
		System.out.println(nom);
	}
}
package projet;

class Tache {
	String nom;
	String categorie;
	int heures;
	String[] personnes;

	public Tache(String nom, String categorie, int heures, String[] personnes) {
		this.nom = nom;
		this.categorie = categorie;
		this.heures = heures;
		this.personnes = personnes;
	}
}
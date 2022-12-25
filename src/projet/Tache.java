package projet;

import java.time.LocalDateTime;

class Tache {
	private String nom;
	private String categorie;
	private int heures;
	private String[] personnes;
	private LocalDateTime dateDebut;
	private LocalDateTime dateFin;

	public Tache(String nom, String categorie, int heures, String[] personnes, LocalDateTime dateDebut,
			LocalDateTime dateFin) {
		this.nom = nom;
		this.categorie = categorie;
		this.heures = heures;
		this.personnes = personnes;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
	}

	public String getNom() {
		return nom;
	}

	public String getCategorie() {
		return categorie;
	}

	public int getHeures() {
		return heures;
	}

	public String[] getPersonnes() {
		return personnes;
	}

	public String getTablePersonnes(String[] personne) {
		return personne[0];
	}

	public LocalDateTime getDateDebut() {
		return dateDebut;
	}

	public LocalDateTime getDateFin() {
		return dateFin;
	}

}

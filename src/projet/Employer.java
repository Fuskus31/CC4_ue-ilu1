package projet;

import java.time.format.DateTimeFormatter;

public class Employer extends Humain {
	// age et nom de classe mere humain
	private Agenda[] agenda = new Agenda[2];
	int nbAgenda = 0;

	public Employer(String nom) {
		super(nom);
		// TODO Auto-generated constructor stub
	}

	public void parler() {
		System.out.println("Bonjour, je suis EmpoloierQuiCode " + getNom() + " j'ai " + getAge() + " ans.");
	}

	public void setAgenda(Tache tache) {
		if (this.agenda[nbAgenda] == null) {
			this.agenda[nbAgenda] = new Agenda();
		}

		this.agenda[nbAgenda].ajouterTache(tache);
	}

	public void afficherTache() {

		for (int i = 0; i < this.agenda[nbAgenda].nbTaches; i++) {
			System.out.println("NomTache employer : " + this.agenda[nbAgenda].getTaches().getNom());
			System.out.println("Catégorie  : " + this.agenda[nbAgenda].getTaches().getCategorie());
			System.out.println("Heures : " + this.agenda[nbAgenda].getTaches().getHeures());
			System.out.print("Personnes : ");
			for (String personne : this.agenda[nbAgenda].getTaches().getPersonnes()) {
				System.out.print(personne + " ");
			}
			System.out.println();
			System.out.println("Date de début de la tache de l'employer : " + this.agenda[nbAgenda].getTaches()
					.getDateDebut().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));
			System.out.println("Date de fin de la tache de l'employer : " + this.agenda[nbAgenda].getTaches()
					.getDateFin().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));
			System.out.println();
		}
	}
}

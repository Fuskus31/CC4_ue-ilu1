package projet;

import java.time.format.DateTimeFormatter;

class Groupe {
	private Tache[] taches;
	private int nbTaches;

	public Groupe() {
		taches = new Tache[100];
		nbTaches = 0;
	}

	public void ajouterTache(Tache tache) {
		taches[nbTaches] = tache;
		nbTaches++;
	}

	public boolean chevauchementTache(Tache tache) {
		for (int i = 0; i < nbTaches; i++) {
			if (tache.getDateDebut().isBefore(taches[i].getDateFin())
					&& tache.getDateFin().isAfter(taches[i].getDateDebut())) {
				return true;
			}
		}
		return false;
	}

	public void afficherTaches() {
		for (int i = 0; i < nbTaches; i++) {
			System.out.println("Nom : " + taches[i].getNom());
			System.out.println("Catégorie : " + taches[i].getCategorie());
			System.out.println("Heures : " + taches[i].getHeures());
			System.out.print("Personnes : ");
			for (String personne : taches[i].getPersonnes()) {
				System.out.print(personne + " ");
			}
			System.out.println();
			System.out.println("Date de début : "
					+ taches[i].getDateDebut().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));
			System.out.println(
					"Date de fin : " + taches[i].getDateFin().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));
			System.out.println();
		}
	}
}

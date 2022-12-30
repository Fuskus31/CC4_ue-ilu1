package projet;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Utilisateur {
	public static void main(String[] args) {

		// creation d'une tache pour un employer ( personnel )
		Humain homme = new Humain("MichelTolosa");
		homme.parler();

		Employer kevin = new Employer("kevin");
		kevin.parler();
		Tache tacheExemple = new Tache("Nettoyer la maison", "Travail", 4, new String[] { "kevin" },
				LocalDateTime.of(2022, 6, 15, 8, 0), LocalDateTime.of(2022, 6, 15, 12, 0));
		kevin.setAgenda(tacheExemple);
		kevin.afficherTache();

		String dateDebutString;
		String personnesString;
		String[] personnes;
		String categorie;
		String nom;
		int heures;
		LocalDateTime dateFin;
		LocalDateTime dateDebut;
		Groupe groupe = new Groupe();
		Scanner sc = new Scanner(System.in);
		int stoppeur = 1;
		while (stoppeur == 1) {
			System.out.print("Entrez le nom de la tâche : ");
			nom = sc.nextLine();

			System.out.print("Entrez la catégorie de la tâche : ");
			categorie = sc.nextLine();
			while (!categorie.equals("travail") && !categorie.equals("loisir")) {
				System.out.println("La catégorie doit être 'travail' ou 'loisir', veuillez réessayer.");
				System.out.print("Entrez la catégorie de la tâche : ");
				categorie = sc.nextLine();
			}

			while (true) {
				System.out.print("Entrez le nombre d'heures nécessaires pour terminer la tâche : ");
				try {
					heures = sc.nextInt();
					if (heures > 0) {
						break;
					} else {
						System.out.println("Le nombre d'heures doit être supérieur à 0.");
					}
				} catch (InputMismatchException e) {
					System.out.println("Veuillez entrer un entier valide.");
					sc.nextLine();
				}
			}

			sc.nextLine(); // Consommation de la ligne vide après l'entier

			System.out.print("Entrez les personnes impliquées dans la tâche (séparées par des espaces) : ");
			personnesString = sc.nextLine();
			personnes = personnesString.split(" ");

			System.out.print("Entrez la date de début de la tâche (jj/mm/aaaa hh:mm) : ");
			dateDebutString = sc.nextLine();
			dateDebut = LocalDateTime.parse(dateDebutString, DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));

			System.out.print("Entrez la date de fin de la tâche (jj/mm/aaaa hh:mm) : ");
			String dateFinString = sc.nextLine();
			dateFin = LocalDateTime.parse(dateFinString, DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));

			Tache tache = new Tache(nom, categorie, heures, personnes, dateDebut, dateFin);
			if (groupe.chevauchementTache(tache)) {
				System.out.println(
						"La tâche chevauche une autre tâche existante, veuillez en choisir une autre plage horaire.");
			} else {
				groupe.ajouterTache(tache);
				System.out.println("Emploi du temps du groupe :");
				groupe.afficherTaches();
				Csv.ecrireTaches(groupe.getTaches(), "taches.csv", groupe.getNbTaches());

			}
			System.out.print("Entrez 1 pour continuer à ajouter des taches 0 sinon : ");
			stoppeur = sc.nextInt();
			sc.nextLine(); // Consommation de la ligne vide après l'entier

		}
		// Ajoutez des tâches au groupe...

		sc.close();
	}

}

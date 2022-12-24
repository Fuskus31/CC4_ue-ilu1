package projet;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// Création du groupe
//		Groupe groupe = new Groupe();
//		// Ajout de personnes au groupe
//		groupe.ajouterPersonne(new Personne("Alice"));
//		groupe.ajouterPersonne(new Personne("Bob"));
//		groupe.ajouterPersonne(new Personne("Charlie"));
//
//		// Ajout de tâches au groupe
//		groupe.ajouterTache(new Tache("Rédiger un rapport", "Travail", 4, new String[] { "Alice", "Bob" }));
//		groupe.ajouterTache(new Tache("Faire du sport", "Loisir", 2, new String[] { "Alice", "Charlie" }));
//		groupe.ajouterTache(new Tache("Cuisiner un repas", "Loisir", 3, new String[] { "Charlie" }));
//
//		// Affichage de l'emploi du temps du groupe
//		System.out.println("Emploi du temps du groupe :");
//		groupe.afficherTaches();
//
//		// Filtrage des tâches par catégorie
//		System.out.println("Tâches de loisir :");
//		groupe.filtrerTaches("Loisir");
//
//		// Filtrage des tâches par personne impliquée
//		System.out.println("Tâches impliquant Alice :");
//		groupe.filtrerTaches(new String[] { "Alice" });

		// lire les données entrées par l'utilisateur au clavier

//		String nom;
//		String categorie;
//		int heures;
//		Groupe groupe = new Groupe();
//		Scanner sc = new Scanner(System.in);
//		int stoppeur = 1;
//
//		while (stoppeur == 1) {
//
//			System.out.print("Entrez le nom de la tâche : ");
//			nom = sc.nextLine();
//
//			System.out.print("Entrez la catégorie de la tâche : ");
//			categorie = sc.nextLine();
//
//			System.out.print("Entrez le nombre d'heures nécessaires pour terminer la tâche : ");
//			heures = sc.nextInt();
//			sc.nextLine(); // Consommation de la ligne vide après l'entier
//
//			System.out.print("Entrez les personnes impliquées dans la tâche (séparées par des espaces) : ");
//			String personnesString = sc.nextLine();
//			String[] personnes = personnesString.split(" ");
//
//			Tache tache = new Tache(nom, categorie, heures, personnes);
//			groupe.ajouterTache(tache);
//			System.out.println("Emploi du temps du groupe :");
//			groupe.afficherTaches();
//
//			System.out.print("Entrez 1 pour continuer à ajouter des taches 0 sinon ");
//			stoppeur = sc.nextInt();
//			sc.nextLine();
//
//		}
//		sc.close();
//		

		String dateDebutString;
		String personnesString;
		String[] personnes;
		String categorie;
		String nom;
		int heures;
		LocalDateTime dateFin;
		LocalDateTime dateDebut;
		DateTimeFormatter formatter;
		Groupe groupe = new Groupe();
		Scanner sc = new Scanner(System.in);
		int stoppeur = 1;
		while (stoppeur == 1) {
			System.out.print("Entrez le nom de la tâche : ");
			nom = sc.nextLine();

			System.out.print("Entrez la catégorie de la tâche : ");
			categorie = sc.nextLine();

			System.out.print("Entrez le nombre d'heures nécessaires pour terminer la tâche : ");
			heures = sc.nextInt();
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
				Csv.ecrireTaches(tache, "taches.csv");
			}
			System.out.print("Entrez 1 pour continuer à ajouter des taches 0 sinon : ");
			stoppeur = sc.nextInt();
			sc.nextLine(); // Consommation de la ligne vide après l'entier

		}
		// Ajoutez des tâches au groupe...

		sc.close();
	}
}

package projet;

//public class Main {
//
//	public static void main(String[] args) {
//	}
// creation d'une tache pour un employer ( personnel )
//		Humain homme = new Humain("MichelTolosa");
//		homme.parler();
//
//		Employer kevin = new Employer("kevin");
//		kevin.parler();
//		Tache tacheExemple = new Tache("Nettoyer la maison", "Travail", 4, new String[] { "kevin" },
//				LocalDateTime.of(2022, 6, 15, 8, 0), LocalDateTime.of(2022, 6, 15, 12, 0));
//		kevin.setAgenda(tacheExemple);
//		kevin.afficherTache();

// test des fonctions
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

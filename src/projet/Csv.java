package projet;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Csv {

	public static void ecrireTaches(Tache[] taches, String nomFichier, int nbtache) {
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(nomFichier));
			for (int i = 0; i < nbtache; i++) {
				Tache tache = taches[i];
				String[] tabPersonne = tache.getPersonnes();

				String personnes = "";
				for (int j = 0; j < tabPersonne.length; j++) {
					personnes += tabPersonne[j] + ' ';
				}

				writer.write(tache.getNom() + "," + tache.getCategorie() + "," + tache.getHeures() + "," + personnes
						+ "," + tache.getDateDebut() + "," + tache.getDateFin());
				writer.newLine();
			}
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

package projet;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Csv {
	public static void ecrireTaches(Tache tache, String nomFichier) {
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(nomFichier));

			writer.write(tache.getNom() + "," + tache.getCategorie() + "," + tache.getHeures() + ","
					+ tache.getPersonnes() + "," + tache.getDateDebut() + "," + tache.getDateFin());
			writer.newLine();

			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

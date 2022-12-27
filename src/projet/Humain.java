package projet;

public class Humain {

	protected String nom = "humain";
	private int age = 18;

	public Humain(String nom) {
		this.nom = nom;

	}

	public String getNom() {
		return this.nom;
	}

	public int getAge() {
		return this.age;
	}

	public void parler() {
		System.out.println("Bonjour, je suis humain " + getNom() + " j'ai " + getAge() + " ans.");
	}
}

package exo2;

public class Professeur extends Personne {
	private String matiere;

	public Professeur(int id, String nom, String prenom, String adresse, String matiere) {
		super(id, nom, prenom, adresse);
		this.matiere = matiere;
	}

		@Override
	public String toString() {
		return "Professeur [" + super.toString() + ", matière=" + matiere + "]";
	}
}

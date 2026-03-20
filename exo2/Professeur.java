package exo2;

public class Professeur extends Personne {
	private String matiere;

	public Professeur(int id, String nom, String prenom, String adresse, String matiere) {
		super(id, nom, prenom, adresse);
		this.matiere = matiere;
	}

		@Override
	public String toString() {
		return "Professeur [id=" + getId() + ", nom=" + getNom() + ", prenom=" + getPrenom() +
				", adresse=" + getAdresse() + ", matière enseigner=" + matiere;
	}
}

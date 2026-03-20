package exo2;

public class Etudiant extends Personne {
	private int anneeScolaire;
	private String niveau;

	public Etudiant(int id, String nom, String prenom, String adresse, String niveau, int anneeScolaire) {
		super(id, nom, prenom, adresse);
		this.anneeScolaire = anneeScolaire;
		this.niveau = niveau;
	}

	@Override
	public String toString() {
		return "Etudiant [" + super.toString() + ", niveau=" + niveau + ", année=" + anneeScolaire + "]";
	}
}

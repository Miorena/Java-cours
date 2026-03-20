package exo2;

public class Personne {
	private int id;
	private String nom;
	private String prenom;
	private String adresse;

	public Personne(int id, String nom, String prenom, String adresse) {
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
	}

	// setters
	public void setId(int id) { this.id = id; }
	public void setNom(String nom) { this.nom = nom; }
	public void setPrenom(String prenom) { this.prenom = prenom; }
	public void setAdresse(String adresse) { this.adresse = adresse; }

	// getters
	public int getId() { return id; }
	public String getNom() { return nom; }
	public String getPrenom() { return prenom; }
	public String getAdresse() { return adresse; }
}

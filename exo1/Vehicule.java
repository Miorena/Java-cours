package exo1;

public class Vehicule {
	private String idVehicule;
	private String carrosserie;
	private String marque;
	private String modele;
	private int nombreDeRoues;
	private int placeAsise;

	public Vehicule(String idVehicule, String carrosserie, String marque, String modele, int nombreDeRoues,
			int placeAsise) {
		this.idVehicule = idVehicule;
		this.carrosserie = carrosserie;
		this.marque = marque;
		this.modele = modele;
		this.nombreDeRoues = nombreDeRoues;
		this.placeAsise = placeAsise;
	}

	public void setIdVehicule(String idVehicule) { this.idVehicule = idVehicule; }
	public void setCarrosserie(String carrosserie) { this.carrosserie = carrosserie; }
	public void setMarque(String marque) { this.marque = marque; }
	public void setModele(String modele) { this.modele = modele; }
	public void setNomberDeRoues(int nombreDeRoues) { this.nombreDeRoues = nombreDeRoues; }
	public void setPlaceAsise(int placeAsise) { this.placeAsise = placeAsise; }

	public String getIdVehicule() { return idVehicule; }
	public String getCarrosserie() { return carrosserie; }
	public String getMarque() { return marque;}
	public String getModele() { return modele; }
	public int getNombreDeRoues() { return nombreDeRoues; }
	public int getPlaceAsise() { return placeAsise; }

	@Override
	public String toString() {
		return "id=" + idVehicule + ", carrosserie=" + carrosserie + ", marque=" + marque +
				", modele=" + modele + ", nombreRoues=" + nombreDeRoues + ", placeAsise=" + placeAsise;
	}
}

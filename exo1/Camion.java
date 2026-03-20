package exo1;

public class Camion extends Vehicule {

	// Attributs spécifiques
	private int essieux;
	private double tonnage;
	private boolean remorque;
	private double ptc;
	private double pv;
	private double cu;

	// Constructeur
	public Camion(String idVehicule, String marque, String modele,
			int essieux, double tonnage, boolean remorque,
			double ptc, double pv, double cu) {
		super(idVehicule, "Camion", marque, modele, essieux * 2, 2);
		this.essieux = essieux;
		this.tonnage = tonnage;
		this.remorque = remorque;
		this.ptc = ptc;
		this.pv = pv;
		this.cu = cu;
	}

	// Getters
	public int getEssieux() {
		return essieux;
	}

	public double getTonnage() {
		return tonnage;
	}

	public boolean getRemorque() {
		return remorque;
	}

	public double getPtc() {
		return ptc;
	}

	public double getPv() {
		return pv;
	}

	public double getCu() {
		return cu;
	}

	@Override
	public String toString() {
		return "Camion [id=" + getIdVehicule() + ", marque=" + getMarque() +
				", essieux=" + essieux + ", tonnage=" + tonnage +
				", PTC=" + ptc + ", PV=" + pv + ", CU=" + cu +
				", remorque=" + remorque + "]";
	}
}
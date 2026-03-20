package exo1;

public class Camion extends Vehicule {
	private int essieux;
	private double tonnage;
	private boolean remorque;
	private double ptc;
	private double pv;
	private double cu;

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

	public void setEssieux(int essieux) { this.essieux = essieux; }
	public void setTonnage(double tonnage) { this.tonnage = tonnage; }
	public void setRemorque(boolean remorque) { this.remorque = remorque; }
	public void setPtc(double ptc) { this.ptc = ptc; }
	public void setPv(double pv) { this.pv = pv; }
	public void setCu(double cu) { this.cu = cu; }

	public int getEssieux() { return essieux; }
	public double getTonnage() { return tonnage; }
	public boolean getRemorque() { return remorque; }
	public double getPtc() { return ptc; }
	public double getPv() { return pv; }
	public double getCu() { return cu; }

	@Override
	public String toString() {
		return "Camion [id=" + getIdVehicule() + ", marque=" + getMarque() +
				", essieux=" + essieux + ", tonnage=" + tonnage +
				", PTC=" + ptc + ", PV=" + pv + ", CU=" + cu +
				", remorque=" + remorque + "]";
	}
}
package exo1;

public class Moto extends Vehicule{
	public Moto(String idVehicule, String marque, String modele) {
		super(idVehicule, "VL", marque, modele, 2, 2);
	}

	@Override
	public int  getNombreDeRoues() {
		return 2;
	}

	@Override
	public int getPlaceAsise() {
		return 2;
	}

	@Override
	public String toString() {
		return "Moto [id=" + getIdVehicule() + ", marque=" + getMarque() +
				", modele=" + getModele() + ", roues=" + getNombreDeRoues() +
				", places=" + getPlaceAsise() + "]";
	}
}

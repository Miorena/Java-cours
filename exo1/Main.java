package exo1;

public class Main {
	public static void main(String[] args) {
		Camion c = new Camion("C001", "Mercedes", "Actros",
			3, 26.0, true, 38000, 12000,26000);

		Moto m = new Moto("M001", "Yamaha", "MT-07");

		System.out.println(c);
		System.out.println(m);
		System.out.println("Roues moto: " + m.getNombreDeRoues());
		System.out.println("Places moto: " + m.getPlaceAsise());
	}
}

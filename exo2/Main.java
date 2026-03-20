package exo2;

public class Main {
	public static void main(String[] args) {
		Etudiant e1 = new Etudiant(1, "Dupand", "Paule", "13e rue du Plancher", "L3", 2026);
		Professeur p = new Professeur(1, "Lebarbu", "Luc", "La corniche", "Histoire");

		System.out.println(e1);
		System.out.println(p);
	}
}

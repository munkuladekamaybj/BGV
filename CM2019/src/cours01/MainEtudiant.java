package cours01;

public class MainEtudiant {
	public static void main(String[] args) {
		Etudiant eleve1 = new Etudiant("Castiaux", "Julien", 42);
		eleve1.setNom = ("Castiaux");
		eleve1.setPrenom = ("Julien");
		eleve1.setNumero = (42);
		System.out.println(eleve1);
		
		Etudiant eleve2 = new Etudiant("Dupont", "J�r�my", 3);
		eleve2.setNom = ("Dupont");
		eleve2.setPrenom = ("J�r�my");
		eleve2.setNumero = (3);
		System.out.println(eleve2);
	}

}

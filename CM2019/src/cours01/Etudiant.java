package cours01;

public class Etudiant {
	private String nom;
	private String prenom;
	private int numero;
	

	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	@Override
	public String toString() {
		return "Etudiant [nom=" + nom + ", prenom=" + prenom + ", numero=" + numero + "]";
	}
	public static void main(String[] args) {
		Etudiant eleve1 = new Etudiant();
		eleve1.nom = "Castiaux";
		eleve1.prenom = "Julien";
		eleve1.numero = 42;
		Etudiant eleve2 = new Etudiant();
		eleve2.nom = "Dupont";
		eleve2.prenom = "Jérémy";
		eleve2.numero = 3;
	}
	public Etudiant() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Etudiant(String nom, String prenom, int numero) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.numero = numero;
	}

}

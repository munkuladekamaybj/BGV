package cours01;

public class Livre {
	private String auteur;
	private String titre;
	private int nombresPage;
	
	
	
	public Livre(String auteur, String titre, int nombresPage) {
		super();
		this.auteur = auteur;
		this.titre = titre;
		this.nombresPage = nombresPage;
		}
	
	public Livre() {
		super();
	}
	
	public static void main(String[] args) {
		Livre lelivre1 = new Livre();
		lelivre1.auteur = "Proust";
		lelivre1.titre = "A la recherche du temps perdu";
		lelivre1.nombresPage = 1800;
		
		Livre lelivre2 = new Livre();
		lelivre2.auteur = "George R. R. Martin";
		lelivre2.titre = "Le Trône de fer";
		lelivre2.nombresPage = 1900;
		
		}
	public Livre(String auteur, String titre, int nombresPage) {
		super();
		this.auteur = auteur;
		this.titre = titre;
		this.nombresPage = nombresPage;
	}
	

}

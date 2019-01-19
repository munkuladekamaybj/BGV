package cours01;

public class HuileEssentielle {
	private String nom;
	private double contenance;
	private double prix;
	
	public HuileEssentielle(String nom, double contenance, double prix) {
		super();
		this.nom = nom;
		this.contenance = contenance;
		this.prix = prix;
	}
	

	public HuileEssentielle() {
		super();
		
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public double getContenance() {
		return contenance;
	}
	public void setContenance(double contenance) {
		this.contenance = contenance;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}

	@Override
	public String toString() {
		return "HuileEssentielle [nom=" + nom + ", contenance=" + contenance + "ml, prix=" + prix + "€]";
	}
	public static void main(String[] args) {
		
		HuileEssentielle huile1 = new HuileEssentielle();
		huile1.nom = "orangesanguine";
		huile1.contenance = 10;
		huile1.prix = 2.20;
		System.out.println(huile1);
		
		HuileEssentielle huile2 = new HuileEssentielle();
		huile2.nom = "eucalyptus radié";
		huile2.contenance = 30;
		huile2.prix = 5.90;
		System.out.println(huile2);
	}
	
}

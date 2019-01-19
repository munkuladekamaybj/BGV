package cours01;

public class Animal {
	
	private String espece;
	private int age;
	private double poids;
	public Animal() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Animal(String espece, int age, double poids) {
		super();
		this.espece = espece;
		this.age = age;
		this.poids = poids;
	}
	public static void main(String[] args) {
		Animal felix = new Animal();
		felix.espece = "Chat";
		felix.age = 5;
		felix.poids = 3;
		Animal milou = new Animal();
		milou.espece = "chien";
		milou.age = 7;
		milou.poids = 80;
	}

}


package pizza;

import java.util.ArrayList;

public abstract class Pizza {

	protected String nom;
	protected String pate;
	protected String sauce;
	protected ArrayList<String> garnitures;

	/**
	 * 
	 */
	protected Pizza() {
		this.nom = "";
		this.pate = "";
		this.sauce = "";
		this.garnitures = new ArrayList<String>();

	}


	public void prepare() {
		System.out.println("Preparation de " + this.nom );
		System.out.println("Etalage de la pate...");
		System.out.println("Ajout de la sauce... ");
		System.out.println("Ajout des garnitures:");
		for (int i=0; i<garnitures.size(); i++) {
			System.out.println(" " + this.garnitures.get(i));
		}

	}

	public void bake() {
		System.out.println("Cuisson");
	}

	public void cut() {
		System.out.println("Decoupage" );
	}

	public void wrap() {
		System.out.println("Emballage");

	}
	public String getName() {

		return this.nom;

	}
}


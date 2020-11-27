package pizza;
public class PizzaGrecqueStyleBrest extends Pizza {

	public PizzaGrecqueStyleBrest() {
		this.nom = "Pizza grecque Brest";
		this.garnitures.add("Parmigiano reggiano rape");
	}
	
	@Override
	public void cut() {
		super.cut();
		System.out.println("Decoupage en parts triangulaires");
	}

}

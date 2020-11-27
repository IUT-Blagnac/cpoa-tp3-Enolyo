package pizza;
public class PizzaGrecqueStyleBrest extends Pizza {

	public PizzaGrecqueStyleBrest() {
		this.nom = "Pizza grecque Brest";
		this.garnitures.add("Parmigiano reggiano rapé");
	}
	
	@Override
	protected void couper() {
		super.couper();
		System.out.println("Decoupage en parts triangulaires");
	}

}

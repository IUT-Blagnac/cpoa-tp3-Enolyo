package pizza;

public class PizzaCheeseStyleBrest extends Pizza{

	public PizzaCheeseStyleBrest() {
		this.nom = "Pizza fromage";
		this.garnitures.add("Parmigiano reggiano rapé");
		
	}
	@Override
	protected void couper() {
		super.couper();
		System.out.println("Decoupage en parts triangulaires");
	}

}

package pizza;

public class PizzaCheeseStyleBrest extends Pizza{

	public PizzaCheeseStyleBrest() {
		this.nom = "Pizza fromage";
		this.garnitures.add("Parmigiano reggiano rapé");
		
	}
	@Override
	public void cut() {
		super.cut();
		System.out.println("Decoupage en parts triangulaires");
	}

}

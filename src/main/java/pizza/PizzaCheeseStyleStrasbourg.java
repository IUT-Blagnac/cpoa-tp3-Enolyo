package pizza;

public class PizzaCheeseStyleStrasbourg extends Pizza{

	public PizzaCheeseStyleStrasbourg() {
		this.nom = "Pizza fromage strabourg";
		this.garnitures.add("Mozzarella en lamelles");
	
	}
	@Override
	public void cut() {
		super.cut();
		System.out.println("Decoupage en parts carrees");
	}
}

package pizza;
public class PizzaGrecqueStyleStrasbourg extends Pizza {

	public PizzaGrecqueStyleStrasbourg() {
		this.nom = "Pizza grecque Strasbourg";
		this.garnitures.add("Mozzarella en lamelles");

	}
	@Override
	protected void couper() {
		super.couper();
		System.out.println("Decoupage en parts carrees");
	}
}

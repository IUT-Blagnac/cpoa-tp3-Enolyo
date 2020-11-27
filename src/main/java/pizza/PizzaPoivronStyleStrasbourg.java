package pizza;
public class PizzaPoivronStyleStrasbourg extends Pizza{
	
	public PizzaPoivronStyleStrasbourg() {
		this.nom = "Pizza sauce style Strasbourg et poivrons";
		this.garnitures.add("Mozzarella en lamelles");

	}
	@Override
	public void cut() {
		super.cut();
		System.out.println("Decoupage en parts carrees");
	}
}

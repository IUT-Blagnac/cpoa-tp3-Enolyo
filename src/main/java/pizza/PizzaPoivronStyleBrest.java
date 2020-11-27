package pizza;
public class PizzaPoivronStyleBrest extends Pizza{

	public PizzaPoivronStyleBrest() {
		this.nom = "Pizza poivron Brest";
		this.garnitures.add("Parmigiano reggiano rapé");
	}
	
	@Override
	protected void couper() {
		super.couper();
		System.out.println("Decoupage en parts triangulaires");
	}
}

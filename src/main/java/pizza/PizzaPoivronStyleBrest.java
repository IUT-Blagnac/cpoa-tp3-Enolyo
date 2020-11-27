package pizza;
public class PizzaPoivronStyleBrest extends Pizza{

	public PizzaPoivronStyleBrest() {
		this.nom = "Pizza poivron Brest";
		this.garnitures.add("Parmigiano reggiano rape");
	}
	
	@Override
	public void cut() {
		super.cut();
		System.out.println("Decoupage en parts triangulaires");
	}
}

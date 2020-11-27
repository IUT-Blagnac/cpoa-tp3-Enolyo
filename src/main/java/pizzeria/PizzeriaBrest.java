package pizzeria;
import pizzaFactory.*;


public class PizzeriaBrest extends Pizzeria {

	public PizzeriaBrest() {
		this.PizzaFactory = PizzaFactoryBrest.getInstance();
	}
}

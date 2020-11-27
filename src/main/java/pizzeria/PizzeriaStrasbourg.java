package pizzeria;
import pizzaFactory.*;

public class PizzeriaStrasbourg extends Pizzeria {
	
	public PizzeriaStrasbourg() {
		this.PizzaFactory = PizzaFactoryStrasbourg.getInstance();
	}
}

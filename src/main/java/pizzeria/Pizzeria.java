package pizzeria;
import pizzaFactory.*;
import pizza.*;

public abstract class Pizzeria {
	PizzaFactory PizzaFactory ;
	public Pizza orderPizza(String string) {
		
		
		Pizza instance = PizzaFactory.createPizza(string);

		instance.prepare();
		instance.bake();
		instance.cut();
		instance.wrap();

		return instance;
	}
	
}
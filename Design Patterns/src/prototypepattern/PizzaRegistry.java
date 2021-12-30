/**
 * 
 */
package prototypepattern;

import java.util.HashMap;
import java.util.Map;

/**
 * @author roshn
 *
 */
public class PizzaRegistry {
	
	private Map<PizzaType, Pizza> pizzas = new HashMap<PizzaType, Pizza>();

	public PizzaRegistry() {
		this.initialize();
	}
	
	public Pizza getPizza(PizzaType pizzatype) {
		Pizza pizza = null;
		try {
			pizza = (Pizza) pizzas.get(pizzatype).clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return pizza;
		
	}

	private void initialize() {
		
		NonVegPizza nonVegPizza = new NonVegPizza();
		nonVegPizza.setPizzaSize("Medium");
		nonVegPizza.setPrice(1000.00);
		nonVegPizza.setMeatType("Chicekn");
		
		VegPizza vegPizza = new VegPizza();
		vegPizza.setPizzaSize("Medium");
		vegPizza.setPrice(750.00);
		
		pizzas.put(PizzaType.NON_VEGETERIAN, nonVegPizza);
		pizzas.put(PizzaType.VEGETERIAN, vegPizza);
		
		
		
	}

	
	
	

}

/**
 * 
 */
package prototypepattern;

/**
 * @author roshn
 *
 */
public class MainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PizzaRegistry pizzaRegistry = new PizzaRegistry();
		
		NonVegPizza nonVegPizza1 = (NonVegPizza) pizzaRegistry.getPizza(PizzaType.NON_VEGETERIAN);
		nonVegPizza1.setNumberOfpizza(5);
		nonVegPizza1.orderPizza(nonVegPizza1.getNumberOfpizza());
		System.out.println(nonVegPizza1);
		
		
		NonVegPizza nonVegPizza2 = (NonVegPizza) pizzaRegistry.getPizza(PizzaType.NON_VEGETERIAN);
		nonVegPizza2.setMeatType("pork");
		nonVegPizza2.setPrice(1200.00);
		nonVegPizza2.setNumberOfpizza(2);
		nonVegPizza2.orderPizza(nonVegPizza2.getNumberOfpizza());
		System.out.println(nonVegPizza2);
		
		VegPizza VegPizza1 = (VegPizza) pizzaRegistry.getPizza(PizzaType.VEGETERIAN);
		VegPizza1.setNumberOfpizza(1);
		VegPizza1.orderPizza(VegPizza1.getNumberOfpizza());
		System.out.println(VegPizza1);
	}

}

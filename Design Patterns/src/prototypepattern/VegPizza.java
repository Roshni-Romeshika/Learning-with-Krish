/**
 * 
 */
package prototypepattern;

/**
 * @author roshn
 *
 */
public class VegPizza extends Pizza{

	@Override
	public void orderPizza(int pizzaBox) {
		System.out.println(pizzaBox +" Vegeterian pizza boxes are preparing...");
		
	}

	public String toString() {
		return "Pizza Order: --------------------------------------------------------------------------\n"
	            + "Size of pizza = " + getPizzaSize() + "\n" 
				+ "Price per pizza = " + getPrice() + "\n" 
	            + "Ordered pizza boxes = " + getNumberOfpizza() + "\n"
		        + "-------------------------------------------------------------------------------------\n";
	}
	
	
	

}

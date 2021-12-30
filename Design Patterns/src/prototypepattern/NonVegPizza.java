/**
 * 
 */
package prototypepattern;

/**
 * @author roshni
 *
 */
public class NonVegPizza extends Pizza{
	
	private String meatType;
	
	

	public String getMeatType() {
		return meatType;
	}



	public void setMeatType(String meatType) {
		this.meatType = meatType;
	}



	@Override
	public void orderPizza(int pizzaBox) {
		System.out.println(pizzaBox +" Non-Vegeterian pizza boxes are preparing...");		
	}



	@Override
	public String toString() {
		return "Pizza Order: --------------------------------------------------------------------------\n"
				+ "Type of meat = " + meatType + "\n"
	            + "Size of pizza = " + getPizzaSize() + "\n" 
				+ "Price per pizza = " + getPrice() + "\n" 
	            + "Ordred pizza boxes= " + getNumberOfpizza() + "\n"
		        + "-------------------------------------------------------------------------------------\n";
	}
	

	
	

	


	
	
	
	
	
	

}

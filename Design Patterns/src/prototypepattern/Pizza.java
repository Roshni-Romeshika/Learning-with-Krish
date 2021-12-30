package prototypepattern;

public abstract class Pizza implements Cloneable{
	
	private String pizzaSize;
	private double price;
	private int numberOfpizza;
	
	public String getPizzaSize() {
		return pizzaSize;
	}
	public void setPizzaSize(String pizzaSize) {
		this.pizzaSize = pizzaSize;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double d) {
		this.price = d;
	}
	public int getNumberOfpizza() {
		return numberOfpizza;
	}
	public void setNumberOfpizza(int numberOfpizza) {
		this.numberOfpizza = numberOfpizza;
	}
	
	//abstract method to pizza order
	public abstract void orderPizza(int pizzaBox);
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	@Override
	public String toString() {
		return "Pizza Order: --------------------------------------------------------------------------\n"
	            + "pizzaSize = " + pizzaSize + "\n" 
				+ "price = " + price + "\n" 
	            + "numberOfpizza = " + numberOfpizza + "\n"
		        + "-------------------------------------------------------------------------------------";
	}
	
	
	
	
	
	

}

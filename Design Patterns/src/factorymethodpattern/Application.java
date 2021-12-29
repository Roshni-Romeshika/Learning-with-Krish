package factorymethodpattern;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComboOfferFactory ComOffFac1 = ComboOffer.createComboOffer(ComboOfferName.BASIC);
		System.out.println(ComOffFac1);
		
		ComboOfferFactory ComOffFac2 = ComboOffer.createComboOffer(ComboOfferName.SUPER);
		System.out.println(ComOffFac2);

	}

}

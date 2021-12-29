package factorymethodpattern;

public class ComboOffer {
	public static ComboOfferFactory createComboOffer(ComboOfferName comboOfferName){
	     switch(comboOfferName){
	        case BASIC:
	          return new BasicComboOffer();
	        case SUPER:
	          return new SuperComboOffer();
	        default:
	          return null;
	    } 
	  }

}

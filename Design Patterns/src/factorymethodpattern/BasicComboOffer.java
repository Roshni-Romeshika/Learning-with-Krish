package factorymethodpattern;

public class BasicComboOffer extends ComboOfferFactory{
    protected void createComboOffer(){
        comboItem.add(new ChickenFriedRice());
        comboItem.add(new ChilliChicken());
        comboItem.add(new Soup());
    }
}

package factorymethodpattern;

import java.util.ArrayList;
import java.util.List;

public abstract class ComboOfferFactory {

	protected List<ComboItem> comboItem = new ArrayList<>();
    public ComboOfferFactory(){
        // invoke the createPackage method
        createComboOffer();
    }
    protected abstract void createComboOffer();
    @Override
    public String toString(){
        return "COMBO OFFER{"+
               "Food Items=" + comboItem +
               "}";
    }
}

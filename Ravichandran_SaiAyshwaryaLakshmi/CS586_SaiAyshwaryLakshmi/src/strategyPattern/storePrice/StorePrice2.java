package strategyPattern.storePrice;

import abstractFactoryPattern.AbstractFactory;
import abstractFactoryPattern.ConcreteFactory2;
import dataStore.DataStore;

public class StorePrice2 extends StorePrice{

	/* (non-Javadoc)
	 * @see strategyPattern.storePrice.StorePrice#storeGasPrices()
	 */
	@Override
	public void storeGasPrices() {
		// TODO Auto-generated method stub
		DataStore ds;
		AbstractFactory af = new ConcreteFactory2();
		ds = ConcreteFactory2.getDataStore();
		ds.setRegularGasPrice(ds.getTempRcost());// sets the value of Regular Gas in the dataStore by using the user's input that is store in a temporary variable
		ds.setSuperPrice(ds.getTempSprice());// sets the value of Super Gas in the dataStore by using the user's input that is store in a temporary variable
		ds.setPremiumPrice(ds.getTempPremium()); // sets the value of Premium Gas in the dataStore by using the user's input that is store in a temporary variable
	}

}

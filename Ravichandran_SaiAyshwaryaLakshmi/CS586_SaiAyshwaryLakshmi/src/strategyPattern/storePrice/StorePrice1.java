package strategyPattern.storePrice;

import abstractFactoryPattern.AbstractFactory;
import abstractFactoryPattern.ConcreteFactory1;
import dataStore.DataStore;

public class StorePrice1 extends StorePrice{

	@Override
	public void storeGasPrices() {
		// TODO Auto-generated method stub
		AbstractFactory af = new ConcreteFactory1();
		DataStore ds = ConcreteFactory1.getDataStore();
		ds.setRegularPrice(ds.getTempRprice());// sets the value of Regular Gas in the dataStore by using the user's input that is store in a temporary variable
		ds.setDieselPrice(ds.getTempDprice()); // sets the value of Diesel in the dataStore by using the user's input that is store in a temporary variable
	}
}
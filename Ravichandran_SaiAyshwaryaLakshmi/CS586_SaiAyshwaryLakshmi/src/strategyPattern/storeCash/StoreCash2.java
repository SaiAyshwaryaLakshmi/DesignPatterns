package strategyPattern.storeCash;

import abstractFactoryPattern.AbstractFactory;
import abstractFactoryPattern.ConcreteFactory2;
import dataStore.DataStore;

public class StoreCash2 extends StoreCash{

	/* (non-Javadoc)
	 * @see strategyPattern.storeCash.StoreCash#AcceptCash()
	 */

	public void acceptCash() {
		// TODO Auto-generated method stub
		
		AbstractFactory af = new ConcreteFactory2();
		DataStore ds = ConcreteFactory2.getDataStore();
		ds.setCash(ds.getTempCash()); //Accepts Cash into the dataStore (GasPump2)
	}

}

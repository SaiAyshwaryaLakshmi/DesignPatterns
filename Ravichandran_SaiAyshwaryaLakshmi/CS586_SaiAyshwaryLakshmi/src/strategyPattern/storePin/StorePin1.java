package strategyPattern.storePin;

import abstractFactoryPattern.AbstractFactory;
import abstractFactoryPattern.ConcreteFactory2;
import dataStore.DataStore;

public class StorePin1 extends StorePin {

	/* (non-Javadoc)
	 * @see strategyPattern.storePin.StorePin#storePin()
	 */
	@Override
	public void storePin() {
		// TODO Auto-generated method stub
		AbstractFactory af = new ConcreteFactory2();
		DataStore ds = ConcreteFactory2.getDataStore();
		ds.setPin(ds.getTempPin());
	}

}

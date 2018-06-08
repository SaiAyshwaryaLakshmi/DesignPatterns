package strategyPattern.setInitialValues;

import abstractFactoryPattern.AbstractFactory;
import abstractFactoryPattern.ConcreteFactory1;
import dataStore.DataStore;

public class SetInititalValues1 extends SetInitialValues{

	/* (non-Javadoc)
	 * @see strategyPattern.setInitialValues.SetInitialValues#StoreInitialValues()
	 */
	@Override
	public void storeInitialValues() {
		// TODO Auto-generated method stub
		
		DataStore ds;
		AbstractFactory af = new ConcreteFactory1();
		ds = ConcreteFactory1.getDataStore();
		ds.setInitialValues(); //setting the Initial values to 0
	}

}

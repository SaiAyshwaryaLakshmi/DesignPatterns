package strategyPattern.setInitialValues;

import abstractFactoryPattern.AbstractFactory;
import abstractFactoryPattern.ConcreteFactory1;
import abstractFactoryPattern.ConcreteFactory2;
import dataStore.DataStore;

public class SetInitialValues2 extends SetInitialValues{

	/* (non-Javadoc)
	 * @see strategyPattern.setInitialValues.SetInitialValues#StoreInitialValues()
	 */
	
	@Override
	public void storeInitialValues() {
		// TODO Auto-generated method stub
		
		DataStore ds;
		AbstractFactory af = new ConcreteFactory2();
		ds = ConcreteFactory2.getDataStore();
		ds.setInitialValues();

  }
}

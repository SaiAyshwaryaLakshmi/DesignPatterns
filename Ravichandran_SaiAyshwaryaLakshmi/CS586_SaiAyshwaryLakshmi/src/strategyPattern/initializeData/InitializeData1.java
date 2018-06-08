package strategyPattern.initializeData;

import abstractFactoryPattern.AbstractFactory;
import abstractFactoryPattern.ConcreteFactory1;
import abstractFactoryPattern.ConcreteFactory2;
import dataStore.DataStore;

public class InitializeData1 extends InitializeData {

	/* (non-Javadoc)
	 * @see strategyPattern.initializeData.InitializeData#initializeData()
	 */
	@Override
	public void initializeData() {
		// TODO Auto-generated method stub
		AbstractFactory af = new ConcreteFactory1();
		DataStore ds = ConcreteFactory1.getDataStore();
		ds.setInitializeData();
	}

}

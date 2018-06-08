package strategyPattern.initializeData;

import abstractFactoryPattern.AbstractFactory;
import abstractFactoryPattern.ConcreteFactory1;
import abstractFactoryPattern.ConcreteFactory2;
import dataStore.DataStore;

public class InitializeData2 extends InitializeData{

	/* (non-Javadoc)
	 * @see strategyPattern.initializeData.InitializeData#initializeData()
	 */
	@Override
	public void initializeData() {
		// TODO Auto-generated method stub
		AbstractFactory af = new ConcreteFactory2();
		DataStore ds = ConcreteFactory2.getDataStore();
		ds.setInitializeData();
	}

	
}

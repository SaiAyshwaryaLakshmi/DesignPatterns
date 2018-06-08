package strategyPattern.pumpGasUnit;

import abstractFactoryPattern.AbstractFactory;
import abstractFactoryPattern.ConcreteFactory1;
import abstractFactoryPattern.ConcreteFactory2;
import dataStore.DataStore;

public class PumpGasUnit2 extends PumpGasUnit {

	/* (non-Javadoc)
	 * @see strategyPattern.pumpGasUnit.PumpGasUnit#UnitOfGasPumped()
	 */
	@Override
	public void UnitOfGasPumped() {
		// TODO Auto-generated method stub
		
		DataStore ds;
		AbstractFactory af = new ConcreteFactory2();
		ds = ConcreteFactory2.getDataStore();
	
		ds.setL(ds.getL() + 1);
		ds.setAmountOfGasInt(ds.getL());

	}

}

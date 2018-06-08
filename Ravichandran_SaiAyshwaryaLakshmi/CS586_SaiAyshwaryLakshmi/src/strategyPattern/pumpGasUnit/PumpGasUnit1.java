package strategyPattern.pumpGasUnit;

import abstractFactoryPattern.AbstractFactory;
import abstractFactoryPattern.ConcreteFactory1;
import dataStore.DataStore;

public class PumpGasUnit1 extends PumpGasUnit{

	/* (non-Javadoc)
	 * @see strategyPattern.pumpGasUnit.PumpGasUnit#UnitOfGasPumped()
	 */
	@Override
	public void UnitOfGasPumped() {
		// TODO Auto-generated method stub
		DataStore ds;
		AbstractFactory af = new ConcreteFactory1();
		ds = ConcreteFactory1.getDataStore();
	
		ds.setG(ds.getG() + 1);
		ds.setAmoutOfGas(ds.getG());
		
	}

}

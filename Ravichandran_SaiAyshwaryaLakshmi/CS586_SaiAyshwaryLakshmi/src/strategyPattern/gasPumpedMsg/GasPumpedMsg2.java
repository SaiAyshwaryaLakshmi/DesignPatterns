package strategyPattern.gasPumpedMsg;

import abstractFactoryPattern.AbstractFactory;
import abstractFactoryPattern.ConcreteFactory1;
import abstractFactoryPattern.ConcreteFactory2;
import dataStore.DataStore;

public class GasPumpedMsg2 extends GasPumpedMsg {

	/* (non-Javadoc)
	 * @see strategyPattern.gasPumpedMsg.GasPumpedMsg#gasPumpedMsg()
	 */
	@Override
	public void gasPumpedMsg() {
		// TODO Auto-generated method stub
		DataStore ds;
		AbstractFactory af = new ConcreteFactory2();
		ds = ConcreteFactory2.getDataStore();
		System.out.println("The Amount of Gas Pumped is: \t"+ds.getAmountOfGasInt());
	}

}

package strategyPattern.gasPumpedMsg;

import abstractFactoryPattern.AbstractFactory;
import abstractFactoryPattern.ConcreteFactory1;
import dataStore.DataStore;

public class GasPumpedMsg1 extends GasPumpedMsg{

	/* (non-Javadoc)
	 * @see strategyPattern.gasPumpedMsg.GasPumpedMsg#gasPumpedMsg()
	 */
	@Override
	public void gasPumpedMsg() {
		// TODO Auto-generated method stub
		DataStore ds;
		AbstractFactory af = new ConcreteFactory1();
		ds = ConcreteFactory1.getDataStore();
		System.out.println("The Amount of Gas Pumped is: \t"+ds.getAmoutOfGas());
	}

}

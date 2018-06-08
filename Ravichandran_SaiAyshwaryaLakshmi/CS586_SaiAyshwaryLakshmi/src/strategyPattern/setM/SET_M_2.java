/**
 * 
 */
package strategyPattern.setM;

import abstractFactoryPattern.AbstractFactory;
import abstractFactoryPattern.ConcreteFactory2;
import dataStore.DataStore;

/**
 * @author ayshw
 *
 */
public class SET_M_2 extends SET_M {

	/* (non-Javadoc)
	 * @see strategyPattern.setM.SET_M#setValueM()
	 */
	@Override
	public void setValueM(int value) {
		// TODO Auto-generated method stub
		AbstractFactory af = new ConcreteFactory2();
		DataStore ds = ConcreteFactory2.getDataStore();
		ds.setM(value);
	}

}

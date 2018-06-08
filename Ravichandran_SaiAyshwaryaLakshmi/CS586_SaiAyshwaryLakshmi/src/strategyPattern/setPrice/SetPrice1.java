package strategyPattern.setPrice;

import abstractFactoryPattern.AbstractFactory;
import abstractFactoryPattern.ConcreteFactory1;
import dataStore.DataStore;

public class SetPrice1 extends SetPrice{

	/* (non-Javadoc)
	 * @see strategyPattern.setPrice.SetPrice#setPrice(int, int)
	 */
	@Override
	public void setPrice(int gasType) {
		// TODO Auto-generated method stub
		
		DataStore ds;
		AbstractFactory af = new ConcreteFactory1();
		ds = ConcreteFactory1.getDataStore();
		if (gasType == 0)
			ds.setTempPrice(ds.getRegularPrice());
		else if (gasType == 1)
			ds.setTempPrice(ds.getDieselPrice());
	}

	

}

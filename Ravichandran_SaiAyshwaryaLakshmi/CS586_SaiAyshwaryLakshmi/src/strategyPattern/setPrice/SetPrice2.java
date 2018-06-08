package strategyPattern.setPrice;

import abstractFactoryPattern.AbstractFactory;
import abstractFactoryPattern.ConcreteFactory1;
import abstractFactoryPattern.ConcreteFactory2;
import dataStore.DataStore;

public class SetPrice2 extends SetPrice {

	/* (non-Javadoc)
	 * @see strategyPattern.setPrice.SetPrice#setPrice(int, int)
	 */
	@Override
	public void setPrice(int gasType) {
		// TODO Auto-generated method stub
		int calc = 0;
		DataStore ds;
		AbstractFactory af = new ConcreteFactory2();
		ds = ConcreteFactory2.getDataStore();
        int M = ds.getM();
		if (gasType == 0 && M == 0 )
			ds.setTempPriceInt(ds.getRegularGasPrice());
		else if (gasType == 1 && M == 0)
			ds.setTempPriceInt(ds.getSuperPrice());
		else if (gasType == 2 && M == 0)
			ds.setTempPriceInt(ds.getPremiumPrice());
		else if (gasType == 0 && M == 1)
		{
			calc = (int) (1.1*ds.getRegularGasPrice());
			ds.setTempPriceInt(calc);
		}
		else if (gasType == 1 && M == 1)
		{
			ds.setTempPriceInt((int) (1.1*ds.getSuperPrice()));
		}
		else if (gasType == 2 && M == 1)
		{
			ds.setTempPriceInt((int) (1.1*ds.getPremiumPrice()));
		}
	}

}

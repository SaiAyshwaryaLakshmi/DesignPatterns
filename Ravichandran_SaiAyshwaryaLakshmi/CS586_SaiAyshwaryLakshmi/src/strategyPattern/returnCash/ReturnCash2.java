package strategyPattern.returnCash;

import abstractFactoryPattern.AbstractFactory;
import abstractFactoryPattern.ConcreteFactory2;
import dataStore.DataStore;

public class ReturnCash2 extends ReturnCash{

	/* (non-Javadoc)
	 * @see strategyPattern.returnCash.ReturnCash#returnCash()
	 */
	@Override
	public void returnCash() {
		// TODO Auto-generated method stub
		int cash  = 0 ; int  total = 0; int balance = 0;
		AbstractFactory af = new ConcreteFactory2();
		DataStore ds = ConcreteFactory2.getDataStore();
		total = ds.getTotalInt();
		cash = (int) ds.getCash();
		balance = (cash) - (total);
		ds.setBalance(balance);
		System.out.println("Balance...\t"+ds.getBalance());
		if(ds.getBalance() > 0)
		{
		   System.out.println("Returning CashAmount "+ds.getBalance());
		}
	}

}

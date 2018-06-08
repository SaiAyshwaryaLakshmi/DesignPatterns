package strategyPattern.printReceipt;

import abstractFactoryPattern.AbstractFactory;
import abstractFactoryPattern.ConcreteFactory1;
import abstractFactoryPattern.ConcreteFactory2;
import dataStore.DataStore;

public class PrintReceipt2 extends PrintReceipt {

	/* (non-Javadoc)
	 * @see strategyPattern.printReceipt.PrintReceipt#printReceipt()
	 */
	@Override
	public void printReceipt() {
		// TODO Auto-generated method stub
		int t = 0;
		DataStore ds;
		AbstractFactory af = new ConcreteFactory2();
		ds = ConcreteFactory2.getDataStore();
		ds.setPriceInt(ds.getTempPriceInt());
		int pt = ds.getPriceInt();
		int gI = ds.getAmountOfGasInt();
		t = pt * gI ;
		ds.setTotalInt(t);
		System.out.println("The Total Amount of Gas Disposed is \t"+ds.getAmountOfGasInt()+"\t and the Total is \t"+ds.getTotalInt());;
	    //The above action indicates the amount of gas disposed and the total amount for those units of gas;
	}

}

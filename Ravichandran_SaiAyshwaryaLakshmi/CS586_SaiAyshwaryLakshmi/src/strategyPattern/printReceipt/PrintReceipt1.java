package strategyPattern.printReceipt;

import abstractFactoryPattern.AbstractFactory;
import abstractFactoryPattern.ConcreteFactory1;
import dataStore.DataStore;

public class PrintReceipt1 extends PrintReceipt {

	/* (non-Javadoc)
	 * @see strategyPattern.printReceipt.PrintReceipt#printReceipt()
	 */
	@Override
	public void printReceipt() {
		// TODO Auto-generated method stub
		DataStore ds;
		AbstractFactory af = new ConcreteFactory1();
		ds = ConcreteFactory1.getDataStore();
		ds.setPrice(ds.getTempPrice());
		double total = ds.getPrice()*ds.getAmoutOfGas();
		ds.setTotal(total);
		System.out.println("The Total Amount of Gas Disposed is \t"+ds.getAmoutOfGas()+"\t and the Total is \t"+ds.getTotal());;
	    //The above action indicates the amount of gas disposed and the total amount for those units of gas;
	}

}

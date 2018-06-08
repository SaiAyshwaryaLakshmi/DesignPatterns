package abstractFactoryPattern;

import dataStore.DataStore;
import strategyPattern.cancelMsg.CancelMsg;
import strategyPattern.displayMenu.DisplayMenu;
import strategyPattern.enterPin.EnterPin;
import strategyPattern.gasPumpedMsg.GasPumpedMsg;
import strategyPattern.initializeData.InitializeData;
import strategyPattern.payMsg.PayMsg;
import strategyPattern.printReceipt.PrintReceipt;
import strategyPattern.pumpGasUnit.PumpGasUnit;
import strategyPattern.readyMsg.ReadyMsg;
import strategyPattern.rejectMsg.RejectMsg;
import strategyPattern.returnCash.ReturnCash;
import strategyPattern.setInitialValues.SetInitialValues;
import strategyPattern.setM.SET_M;
import strategyPattern.setPrice.SetPrice;
import strategyPattern.stopMsg.StopMsg;
import strategyPattern.storeCash.StoreCash;
import strategyPattern.storePin.StorePin;
import strategyPattern.storePrice.StorePrice;
import strategyPattern.wrongPinMsg.WrongPinMsg;

public abstract class AbstractFactory {
	
	static DataStore ds = null;

	/**
	 * @return dataStore used by GasPump
	 */
	public static DataStore getDataStore() {
		return ds;
	}

	/**
	 * @param Sets the dataStore used by GasPump
	 */
	public static void setDataStore(DataStore dsValue) {
		AbstractFactory.ds = dsValue;
	}
	
	/**
	 * StorePrices // stores price(s) for the gas from the temporary data store
		PayMsg // displays a type of payment method
		StoreCash // stores cash from the temporary data store
		DisplayMenu // display a menu with a list of selections
		RejectMsg // displays credit card not approved message
		SetPrice(int g, int M) // set the price for the gas identified by g identifier as in SelectGas(int g); if M=1, the price may be increased
		ReadyMsg // displays the ready for pumping message
		SetInitialValues // set G (or L) and total to 0;
		PumpGasUnit // disposes unit of gas and counts # of units disposed
		GasPumpedMsg // displays the amount of disposed gas
		StopMsg // stop pump message and receipt? msg (optionally)
		PrintReceipt // print a receipt
		CancelMsg // displays a cancellation message
		ReturnCash // returns the remaining cash
		WrongPinMsg // displays incorrect pin message
		StorePin // stores the pin from the temporary data store
		EnterPinMsg // displays a message to enter pin
		InitializeData // set the value of price and cash to 0
	 * 
	 */
	
	public abstract StorePrice getStorePrice();    //  It is used to implement the storePrice Action using ConcreteClass
	public abstract PayMsg getPayMsg();			   // It is used to implement the PayMsg Action using ConcreteClass
	public abstract StoreCash getStoreCash();     //It is used to implement the storeCash Action using ConcreteClass
	public abstract DisplayMenu getDisplayMenu(); // It is used to implement the DisplayMenu Action using ConcreteClass
	public abstract RejectMsg 	getRejectMsg(); //It is used to implement the RejectMsg Action using ConcreteClass
	public abstract SetPrice    getSetPrice(); //It is used to implement the SetPrice Action using ConcreteClass
	public abstract ReadyMsg getReadyMsg(); //It is used to implement the ReadyMsg Action using ConcreteClass
	public abstract SetInitialValues getInitialValues(); //It is used to implement the SetInitialValues Action using ConcreteClass
	public abstract PumpGasUnit getPumpGasUnit();        //It is used to implement the PumpGasUnit Action using ConcreteClass
	public abstract GasPumpedMsg getGasPumpedMsg();      //It is used to implement the GasPumpedMsg Action using ConcreteClass
	public abstract StopMsg getStopMsg();                //It is used to implement the StopMsg Action using ConcreteClass
	public abstract PrintReceipt getPrintReceipt();      //It is used to implement the PrintReceipt Action using ConcreteClass
	public abstract CancelMsg getCancelMsg();            //It is used to implement the CancelMsg Action using ConcreteClass
	public abstract ReturnCash getReturnCash();          //It is used to implement the ReturnCash Action using ConcreteClass
	public abstract WrongPinMsg getWrongPinMsg();        //It is used to implement the WrongPinMsg Action using ConcreteClass
	public abstract StorePin getStorePin();              //It is used to implement the StorePin Action using ConcreteClass
	public abstract EnterPin getEnterPinMsg();           //It is used to implement the EnterPin Action using ConcreteClass
	public abstract InitializeData getInitializeData();  //It is used to implement the InitializeData Action using ConcreteClass
    public abstract SET_M getsetM();					//It is used to implement the SETM Action using ConcreteClass
}

package outputProcessor;

import abstractFactoryPattern.AbstractFactory;
import abstractFactoryPattern.ConcreteFactory1;
import abstractFactoryPattern.ConcreteFactory2;
import dataStore.DataStore;
import strategyPattern.storePrice.*;
import strategyPattern.cancelMsg.*;
import strategyPattern.displayMenu.*;
import strategyPattern.enterPin.*;
import strategyPattern.gasPumpedMsg.*;
import strategyPattern.initializeData.*;
import strategyPattern.payMsg.*;
import strategyPattern.printReceipt.*;
import strategyPattern.pumpGasUnit.*;
import strategyPattern.readyMsg.*;
import strategyPattern.rejectMsg.*;
import strategyPattern.returnCash.*;
import strategyPattern.setInitialValues.*;
import strategyPattern.setM.SET_M;
import strategyPattern.setPrice.*;
import strategyPattern.stopMsg.*;
import strategyPattern.storeCash.*;
import strategyPattern.storePin.*;
import strategyPattern.storePrice.*;
import strategyPattern.wrongPinMsg.*;

public class OutputProcessor {

	AbstractFactory af;
	
	public void StorePrice() 
	{
	   StorePrice storePriceClass = null; // Access the action Class StorePrice through a pointer
	   int gasPump = DataStore.getGasPump();
	   switch (gasPump){
	   					case 1:
	   						{
	   							af = new ConcreteFactory1();
	   							storePriceClass = af.getStorePrice(); // Access Store Price Class through Abstract Factory Pattern
	   							storePriceClass.storeGasPrices();
	   							break;
	   							}	   			
	   					case 2:	   						
	   					{
   							af = new ConcreteFactory2();
   							storePriceClass = af.getStorePrice(); // Access Store Price Class through Abstract Factory Pattern
   							storePriceClass.storeGasPrices();
   							break;
   							}
	   					
	   }
	}
	public void PayMsg() {
		PayMsg payMsgClass = null; // Access the action Class PayMessage through a pointer
		   int gasPump = DataStore.getGasPump();
		   switch (gasPump){
		   					case 1:
		   						{
		   							af = new ConcreteFactory1();
		   							payMsgClass = af.getPayMsg(); // Access PayMessage Class through Abstract Factory Pattern
		   							payMsgClass.Pay();
		   							break;
		   							}		   			
		   					case 2:		   						
		   					{
	   							af = new ConcreteFactory2();
	   							payMsgClass = af.getPayMsg(); // Access Pay Message Class through Abstract Factory Pattern
	   							payMsgClass.Pay();
	   							break;
	   							}
		   					
		   }
	}
	public void StoreCash() {
		StoreCash storeCashClass = null; // Access the action Class StoreCash through a pointer
		   int gasPump = DataStore.getGasPump();
		   switch (gasPump){
		   					case 1:
		   						{ break;
		   							}		   			
		   					case 2:		   						
		   					{
	   							af = new ConcreteFactory2();
	   							storeCashClass  = af.getStoreCash(); // Access StoreCash Class through Abstract Factory Pattern
	   							storeCashClass.acceptCash();
	   							break;
	   							}
		   }
	}
	public void DisplayMenu() {
		DisplayMenu displayMenuClass = null; // Access the action Class DisplayMenu through a pointer
		   int gasPump = DataStore.getGasPump();
		   switch (gasPump){
		   					case 1:
		   						{
		   							af = new ConcreteFactory1();
		   							displayMenuClass  = af.getDisplayMenu(); // Access DisplayMenu Class through Abstract Factory Pattern
		   		   					displayMenuClass.displayMenu();
		   		   					break;
		   							}		   			
		   					case 2:		   						
		   					{
	   							af = new ConcreteFactory2();
	   							displayMenuClass  = af.getDisplayMenu();// Access DisplayMenu Class through Abstract Factory Pattern
	   							displayMenuClass.displayMenu();
	   		   					break;
	   							}
		
		   }
	}
	public void RejectMsg() {
		RejectMsg rejectMsgClass = null; // Access the action Class RejectMsg through a pointer
		   int gasPump = DataStore.getGasPump();
		   switch (gasPump){
		   					case 1:
		   						{
		   							af = new ConcreteFactory1();
		   							rejectMsgClass  = af.getRejectMsg(); // Access RejectMsg Class through Abstract Factory Pattern
		   							rejectMsgClass.rejectMsg();
		   							break;
		   							}		   			
		   					case 2:		   						
		   					{
	   							af = new ConcreteFactory2();
	   							rejectMsgClass  = af.getRejectMsg();// Access RejectMsg Class through Abstract Factory Pattern
	   							rejectMsgClass.rejectMsg();
	   							break;
	   							}
		   }
	}
	public void SetPrice(int gasType) {
		SetPrice setPriceClass = null; // Access the action Class SetPrice through a pointer
		   int gasPump = DataStore.getGasPump();
		   switch (gasPump){
		   					case 1:
		   						{
		   							af = new ConcreteFactory1();
		   							setPriceClass  = af.getSetPrice(); // Access SetPrice Class through Abstract Factory Pattern
				   					setPriceClass.setPrice(gasType);
				   					break;
		   							}		   			
		   					case 2:		   						
		   					{
	   							af = new ConcreteFactory2();
	   							setPriceClass  = af.getSetPrice();// Access SetPrice Class through Abstract Factory Pattern
	   							setPriceClass.setPrice(gasType);
			   					break;
	   							}
		   }
	}
	public void ReadyMsg() {
		ReadyMsg readyMsgClass = null; // Access the action Class ReadyMsg through a pointer
		   int gasPump = DataStore.getGasPump();
		   switch (gasPump){
		   					case 1:
		   						{
		   							af = new ConcreteFactory1();
		   							readyMsgClass  = af.getReadyMsg(); // Access ReadyMsg Class through Abstract Factory Pattern
				   					readyMsgClass.readyMsg();
				   					break;
		   							}		   			
		   					case 2:		   						
		   					{
	   							af = new ConcreteFactory2();
	   							readyMsgClass  = af.getReadyMsg();// Access ReadyMsg Class through Abstract Factory Pattern
	   							readyMsgClass.readyMsg();
			   					break;
	   						}

		   }
	}
	public void SetInitialValues() {
		SetInitialValues setInitialValuesClass = null; // Access the action Class SetInitialValues through a pointer
		   int gasPump = DataStore.getGasPump();
		   switch (gasPump){
		   					case 1:
		   						{
		   							af = new ConcreteFactory1();
		   							setInitialValuesClass  = af.getInitialValues(); // Access SetInitialValues Class through Abstract Factory Pattern
		   							setInitialValuesClass.storeInitialValues();
		   							break;
		   							}		   			
		   					case 2:		   						
		   					{
	   							af = new ConcreteFactory2();
	   							setInitialValuesClass  = af.getInitialValues();// Access SetInitialValues Class through Abstract Factory Pattern
	   							setInitialValuesClass.storeInitialValues();
	   							break;
	   							}
		 
		   }
	}
	public void PumpGasUnit() {
		PumpGasUnit pumpGasUnitClass = null; // Access the action Class PumpGasUnit through a pointer
		   int gasPump = DataStore.getGasPump();
		   switch (gasPump){
		   					case 1:
		   						{
		   							af = new ConcreteFactory1();
		   							pumpGasUnitClass  = af.getPumpGasUnit(); // Access PumpGasUnit Class through Abstract Factory Pattern
				   					pumpGasUnitClass.UnitOfGasPumped();
				   					break;
		   							}		   			
		   					case 2:		   						
		   					{
	   							af = new ConcreteFactory2();
	   							pumpGasUnitClass = af.getPumpGasUnit();// Access PumpGasUnit Class through Abstract Factory Pattern
	   							pumpGasUnitClass.UnitOfGasPumped();
			   					break;
	   							}
		   }
	}
	public void GasPumpedMsg() {
		GasPumpedMsg gasPumpedMsgClass = null; // Access the action Class GasPumpedMsg through a pointer
		   int gasPump = DataStore.getGasPump();
		   switch (gasPump){
		   					case 1:
		   						{
		   							af = new ConcreteFactory1();
		   							gasPumpedMsgClass  = af.getGasPumpedMsg(); // Access GasPumpedMsg Class through Abstract Factory Pattern
				   					gasPumpedMsgClass.gasPumpedMsg();
				   					break;
		   							}		   			
		   					case 2:		   						
		   					{
	   							af = new ConcreteFactory2();
	   							gasPumpedMsgClass = af.getGasPumpedMsg();// Access GasPumpedMsg Class through Abstract Factory Pattern
	   							gasPumpedMsgClass.gasPumpedMsg();
			   					break;
	   							}
		   }
	}
	public void StopMsg() {
		StopMsg stopMsgClass = null; // Access the action Class StopMsg through a pointer
		   int gasPump = DataStore.getGasPump();
		   switch (gasPump){
		   					case 1:
		   						{
		   							af = new ConcreteFactory1();
		   							stopMsgClass  = af.getStopMsg(); // Access StopMsg Class through Abstract Factory Pattern
				   					stopMsgClass.stopMsg();
				   					break;
		   							}		   			
		   					case 2:		   						
		   					{
	   							af = new ConcreteFactory2();
	   							stopMsgClass = af.getStopMsg();// Access StopMsg Class through Abstract Factory Pattern
	   							stopMsgClass.stopMsg();
			   					break;
	   							}
		   }
	}
	public void PrintReceipt() {
		PrintReceipt printReceiptClass = null; // Access the action Class PrintReceipt through a pointer
		   int gasPump = DataStore.getGasPump();
		   switch (gasPump){
		   					case 1:
		   						{
		   							af = new ConcreteFactory1();
		   							printReceiptClass  = af.getPrintReceipt(); // Access PrintReceipt Class through Abstract Factory Pattern
				   					printReceiptClass.printReceipt();
				   					break;
		   							}		   			
		   					case 2:		   						
		   					{
	   							af = new ConcreteFactory2();
	   							printReceiptClass = af.getPrintReceipt();// Access PrintReceipt Class through Abstract Factory Pattern
	   							printReceiptClass.printReceipt();
			   					break;
	   						}
		   }
	}
	public void CancelMsg() {
		CancelMsg cancelMsgClass = null; // Access the action Class CancelMsg through a pointer
		   int gasPump = DataStore.getGasPump();
		   switch (gasPump){
		   					case 1:
		   						{
		   							af = new ConcreteFactory1();
		   							cancelMsgClass  = af.getCancelMsg(); // Access CancelMsg Class through Abstract Factory Pattern
		   							cancelMsgClass.cancelMsg();
		   							break;
		   							}		   			
		   					case 2:		   						
		   					{
	   							af = new ConcreteFactory2();
	   							cancelMsgClass = af.getCancelMsg();// Access CancelMsg Class through Abstract Factory Pattern
	   							cancelMsgClass.cancelMsg();
	   							break;
	   						}
		   				
		   }
		
	}
	public void ReturnCash() {
		ReturnCash returnCashClass = null; // Access the action Class ReturnCash through a pointer
		   int gasPump = DataStore.getGasPump();
		   switch (gasPump){
		   					case 1:
		   						{
				   					break;
		   							}		   			
		   					case 2:		   						
		   					{
	   							af = new ConcreteFactory2();
	   							returnCashClass  = af.getReturnCash();// Access ReturnCash Class through Abstract Factory Pattern
	   							returnCashClass.returnCash();
			   					break;
	   							}
		   }
	}
	public void WrongPinMsg() {
		WrongPinMsg wrongPinMsgClass = null; // Access the action Class WrongPinMsg through a pointer
		   int gasPump = DataStore.getGasPump();
		   switch (gasPump){
		   					case 1:
		   						{
		   							af = new ConcreteFactory1();
		   							wrongPinMsgClass  = af.getWrongPinMsg(); // Access WrongPinMsg Class through Abstract Factory Pattern
				   					wrongPinMsgClass.wrongPinMsg();
				   					break;
		   							}		   			
		   					case 2:		   						
		   					{
	   							af = new ConcreteFactory2();
	   							wrongPinMsgClass  = af.getWrongPinMsg();// Access WrongPinMsg Class through Abstract Factory Pattern
	   							wrongPinMsgClass.wrongPinMsg();
			   					break;
	   							}
		   }
	}
	public void StorePin() {
		StorePin storePinClass = null; // Access the action Class StorePin through a pointer
		   int gasPump = DataStore.getGasPump();
		   switch (gasPump){
		   					case 1:
		   						{
		   							af = new ConcreteFactory1();
		   							storePinClass  = af.getStorePin(); // Access StorePin Class through Abstract Factory Pattern
				   					storePinClass.storePin();
				   					break;
		   							}		   			
		   					case 2:		   						
		   					{
	   							af = new ConcreteFactory2();
	   							storePinClass  = af.getStorePin();// Access StorePin Class through Abstract Factory Pattern
	   							storePinClass.storePin();
			   					break;
	   							}
		   }
	}
	public void EnterPinMsg() {
		EnterPin enterPinClass = null; // Access the action Class EnterPin through a pointer
		   int gasPump = DataStore.getGasPump();
		   switch (gasPump){
		   					case 1:
		   						{
		   							af = new ConcreteFactory1();
		   							enterPinClass  = af.getEnterPinMsg(); // Access EnterPin Class through Abstract Factory Pattern
				   					enterPinClass.enterPin();
				   					break;
		   							}		   			
		   					case 2:		   						
		   					{
	   							af = new ConcreteFactory2();
	   							enterPinClass  = af.getEnterPinMsg();// Access EnterPin Class through Abstract Factory Pattern
	   							enterPinClass.enterPin();
			   					break;
	   							}
		   }
	}
	
	public void setM(int Value) {
		SET_M setMClass = null; // Access the action Class Set_M_2 through a pointer
		   int gasPump = DataStore.getGasPump();
		   switch (gasPump){
		   					case 1:
		   							{break;
		   							}		   			
		   					case 2:		   						
		   					{
	   							af = new ConcreteFactory2();
	   							setMClass  = af.getsetM();// Access Set_M_2 Class through Abstract Factory Pattern
	   							setMClass.setValueM(Value);
			   					break;
	   							}
		   }
	}
	public void InitializeData() {
	InitializeData initializeDataClass = null; // Access the action Class InitializeData through a pointer
		   int gasPump = DataStore.getGasPump();
		   switch (gasPump){
		   					case 1:
		   							{
		   								af = new ConcreteFactory2();
			   							initializeDataClass  = af.getInitializeData();// Access InitializeData Class through Abstract Factory Pattern
			   							initializeDataClass.initializeData();
					   					break;
		   								
		   							}		   			
		   					case 2:		   						
		   					{
		   						af = new ConcreteFactory2();
	   							initializeDataClass  = af.getInitializeData();// Access InitializeData Class through Abstract Factory Pattern
	   							initializeDataClass.initializeData();
	   							break;
	   							}
		   }
	}
		
	
}

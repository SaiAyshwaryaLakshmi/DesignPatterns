package statePattern;

import outputProcessor.OutputProcessor;

public class S1 extends States{

	public void PayType(int type) {
		OutputProcessor op = getOutputProcessor();
		switch(type) {
			case 1:
				op.setM(1);
				break;
				// Continue to State S2 without action
			case 2:
				op.setM(0);
				op.StoreCash();
				op.DisplayMenu();
				break;
				
			case 3:
				op.EnterPinMsg(); //Sends message to enter pin
				op.StorePin();	// Stores the Pin from the temporary DataStore
				break;
		
		}
	}
}

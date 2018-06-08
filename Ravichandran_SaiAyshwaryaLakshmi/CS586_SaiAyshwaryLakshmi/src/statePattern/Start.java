package statePattern;

import outputProcessor.OutputProcessor;

public class Start extends States{


	/**
	 * Activating the Gas Pump through the Output Processor and Storing the Prices
	 */
	public void Activate() {
		
		OutputProcessor op;
		op = getOutputProcessor();
	    op.StorePrice();
		
	}
}

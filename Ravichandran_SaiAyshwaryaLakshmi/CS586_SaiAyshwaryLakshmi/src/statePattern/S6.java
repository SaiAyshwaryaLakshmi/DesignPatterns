package statePattern;

import outputProcessor.OutputProcessor;

public class S6 extends States {

	public void NoReceipt()
	{
		OutputProcessor op = getOutputProcessor();
		op.ReturnCash(); //Returns Cash remaining 
	}
	
	public void Receipt()
	{
		OutputProcessor op = getOutputProcessor();
		op.PrintReceipt(); //Prints Receipt of Consumption and Cost
		op.ReturnCash(); //Returns Cash remaining 
	}
}

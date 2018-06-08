package statePattern;

import outputProcessor.OutputProcessor;

public abstract class States {
	
	/**
	 * The Following are the list of events that take place in 
	 * MDAEFSM of GasPump and that will be inherited by Corresponding States
	 * 
	 * They are given here as abstract Events
	 */
	
	OutputProcessor op;	
	public States()
	{
		op = new OutputProcessor(); 
	}	
	public OutputProcessor getOutputProcessor()
	{
		
		return op;  // Getting the object to access the output Processor		
	}	
	public void Activate() {}
	public void Start(){}
	public void PayType(int type){}
	public void Reject(){}
	public void Cancel() {}
	public void Approved() {}
	public void StartPump() {}
	public void Pump() {}
	public void StopPump() {}
	public void SelectGas(int g) {}
	public void Receipt() {}
	public void NoReceipt() {}
	public void CorrectPin() {}
	public void IncorrectPin() {}
	public void Continue() {}
}

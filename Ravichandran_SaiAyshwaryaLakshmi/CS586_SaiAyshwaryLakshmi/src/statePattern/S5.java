package statePattern;

import outputProcessor.OutputProcessor;

public class S5 extends States {

	public void Pump() {
		OutputProcessor op = getOutputProcessor();
		op.PumpGasUnit(); // disposes unit of gas and counts # of units disposed 
		op.GasPumpedMsg(); // Sends Units of Gas Pumped Msg
	}
	
	public void StopPump() {
		OutputProcessor op = getOutputProcessor();
		op.StopMsg(); // Indicates the Gas Pumping is stopped
		
	}
	

}

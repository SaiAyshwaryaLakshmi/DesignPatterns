package statePattern;

import outputProcessor.OutputProcessor;

public class S4 extends States {

	public void StartPump() {
		OutputProcessor op = getOutputProcessor();
		op.SetInitialValues(); // Set the initial Values
		op.ReadyMsg(); // Indicates that the Gas is ready to Pump
	}
}

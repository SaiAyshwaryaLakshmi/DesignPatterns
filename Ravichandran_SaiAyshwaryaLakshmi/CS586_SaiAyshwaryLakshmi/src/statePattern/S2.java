package statePattern;

import outputProcessor.OutputProcessor;

public class S2 extends States{

	public void Approved() {
		
		OutputProcessor op = getOutputProcessor();
		op.DisplayMenu(); // Display the Menu of Available Gas Options	
	}
	
	public void Reject() {
		
		OutputProcessor op = getOutputProcessor();
		op.RejectMsg(); // Inform the User that the Payment has been Rejected	
	}

	
}


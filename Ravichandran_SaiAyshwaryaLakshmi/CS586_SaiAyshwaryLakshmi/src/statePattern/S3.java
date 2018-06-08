package statePattern;

import outputProcessor.OutputProcessor;

public class S3 extends States {

	public void SelectGas(int type) {
		OutputProcessor op = getOutputProcessor();
		op.SetPrice(type);
	}
	
	public void Cancel() {
		OutputProcessor op = getOutputProcessor();
		op.CancelMsg();
		op.ReturnCash();
	}

	public void Continue()
	{
		// Continue to next State
	}
	
}

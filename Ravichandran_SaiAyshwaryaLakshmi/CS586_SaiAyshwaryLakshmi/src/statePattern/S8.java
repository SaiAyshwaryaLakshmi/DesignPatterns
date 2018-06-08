package statePattern;

import outputProcessor.OutputProcessor;

public class S8 extends States {
	
	public void IncorrectPin()
	{
		OutputProcessor op = getOutputProcessor();
		op.WrongPinMsg(); // Sends the Wrong Pin Message
	}

	public void CorrectPin()
	{
		OutputProcessor op = getOutputProcessor();
		op.DisplayMenu(); // Sends the Wrong Pin Message
	}
}

package statePattern;

import outputProcessor.OutputProcessor;

public class S0 extends States {

	/**
	 * In state S0 the start event performs the action to show Pay Message
	 */
	public void Start()
	{
		OutputProcessor op= getOutputProcessor();
		op.PayMsg();
	}
}

package strategyPattern.payMsg;

public class PayMsg2 extends PayMsg {

	/* (non-Javadoc)
	 * @see strategyPattern.payMsg.PayMsg#PayMessage()
	 */
	@Override
	public void Pay() {
		// TODO Auto-generated method stub
		//Displays the menu for Payment Options for Gas Pump2
		System.out.println("Please Pay Using One of the following Options");
		System.out.println("Credit Card ");
		System.out.println("Cash");
	}
}
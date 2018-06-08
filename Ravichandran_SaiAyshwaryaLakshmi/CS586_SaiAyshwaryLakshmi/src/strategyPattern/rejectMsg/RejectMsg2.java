package strategyPattern.rejectMsg;

public class RejectMsg2 extends RejectMsg {

	/* (non-Javadoc)
	 * @see strategyPattern.rejectMsg.RejectMsg#rejectMessage()
	 */
	@Override
	public void rejectMsg() {
		// TODO Auto-generated method stub
		
		System.out.println("Payment has been Rejected.. Please try again by inserting Cash or Credit Card"); // Decline Message for Gas Pump2
	}

}

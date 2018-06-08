package strategyPattern.rejectMsg;

public class RejectMsg1 extends RejectMsg {

	/* (non-Javadoc)
	 * @see strategyPattern.rejectMsg.RejectMsg#rejectMessage()
	 */
	@Override
	public void rejectMsg() {
		// TODO Auto-generated method stub
		
		System.out.println("Payment has been Rejected.. Please try again using a Credit or Debit Card"); // Decline Message for Gas Pump1
	}

}

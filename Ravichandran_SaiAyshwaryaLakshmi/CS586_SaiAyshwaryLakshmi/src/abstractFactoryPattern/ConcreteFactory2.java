package abstractFactoryPattern;

import strategyPattern.cancelMsg.CancelMsg;
import strategyPattern.cancelMsg.CancelMsg2;
import strategyPattern.displayMenu.DisplayMenu;
import strategyPattern.displayMenu.DisplayMenu2;
import strategyPattern.enterPin.EnterPin;
import strategyPattern.gasPumpedMsg.GasPumpedMsg;
import strategyPattern.gasPumpedMsg.GasPumpedMsg2;
import strategyPattern.initializeData.InitializeData;
import strategyPattern.initializeData.InitializeData2;
import strategyPattern.payMsg.PayMsg;
import strategyPattern.payMsg.PayMsg2;
import strategyPattern.printReceipt.PrintReceipt;
import strategyPattern.printReceipt.PrintReceipt2;
import strategyPattern.pumpGasUnit.PumpGasUnit;
import strategyPattern.pumpGasUnit.PumpGasUnit2;
import strategyPattern.readyMsg.ReadyMsg;
import strategyPattern.readyMsg.ReadyMsg2;
import strategyPattern.rejectMsg.RejectMsg;
import strategyPattern.rejectMsg.RejectMsg2;
import strategyPattern.returnCash.ReturnCash;
import strategyPattern.returnCash.ReturnCash2;
import strategyPattern.setInitialValues.SetInitialValues;
import strategyPattern.setInitialValues.SetInitialValues2;
import strategyPattern.setM.SET_M;
import strategyPattern.setM.SET_M_2;
import strategyPattern.setPrice.SetPrice;
import strategyPattern.setPrice.SetPrice2;
import strategyPattern.stopMsg.StopMsg;
import strategyPattern.stopMsg.StopMsg2;
import strategyPattern.storeCash.StoreCash;
import strategyPattern.storeCash.StoreCash2;
import strategyPattern.storePin.StorePin;
import strategyPattern.storePrice.StorePrice;
import strategyPattern.storePrice.StorePrice2;
import strategyPattern.wrongPinMsg.WrongPinMsg;

public class ConcreteFactory2 extends AbstractFactory {

	/* (non-Javadoc)
	 * @see abstractFactoryPattern.AbstractFactory#getStorePrice()
	 */
	@Override
	public StorePrice getStorePrice() {
		// TODO Auto-generated method stub
		return new StorePrice2();
	}

	/* (non-Javadoc)
	 * @see abstractFactoryPattern.AbstractFactory#getStoreCash()
	 */
	@Override
	public StoreCash getStoreCash() {
		// TODO Auto-generated method stub
		return new StoreCash2();
	}

	/* (non-Javadoc)
	 * @see abstractFactoryPattern.AbstractFactory#getDisplayMenu()
	 */
	@Override
	public DisplayMenu getDisplayMenu() {
		// TODO Auto-generated method stub
		return new DisplayMenu2();
	}

	/* (non-Javadoc)
	 * @see abstractFactoryPattern.AbstractFactory#getRejectMsg()
	 */
	@Override
	public RejectMsg getRejectMsg() {
		// TODO Auto-generated method stub
		return new RejectMsg2();
	}

	/* (non-Javadoc)
	 * @see abstractFactoryPattern.AbstractFactory#getSetPrice()
	 */
	@Override
	public SetPrice getSetPrice() {
		// TODO Auto-generated method stub
		return new SetPrice2();
	}

	/* (non-Javadoc)
	 * @see abstractFactoryPattern.AbstractFactory#getReadyMsg()
	 */
	@Override
	public ReadyMsg getReadyMsg() {
		// TODO Auto-generated method stub
		return new ReadyMsg2();
	}

	/* (non-Javadoc)
	 * @see abstractFactoryPattern.AbstractFactory#getInitialValues()
	 */
	@Override
	public SetInitialValues getInitialValues() {
		// TODO Auto-generated method stub
		return new SetInitialValues2();
	}

	/* (non-Javadoc)
	 * @see abstractFactoryPattern.AbstractFactory#getPumpGasUnit()
	 */
	@Override
	public PumpGasUnit getPumpGasUnit() {
		// TODO Auto-generated method stub
		return new PumpGasUnit2();
	}

	/* (non-Javadoc)
	 * @see abstractFactoryPattern.AbstractFactory#getGasPumpedMsg()
	 */
	@Override
	public GasPumpedMsg getGasPumpedMsg() {
		// TODO Auto-generated method stub
		return new GasPumpedMsg2();
	}

	/* (non-Javadoc)
	 * @see abstractFactoryPattern.AbstractFactory#getStopMsg()
	 */
	@Override
	public StopMsg getStopMsg() {
		// TODO Auto-generated method stub
		return new StopMsg2();
	}

	/* (non-Javadoc)
	 * @see abstractFactoryPattern.AbstractFactory#getPrintReceipt()
	 */
	@Override
	public PrintReceipt getPrintReceipt() {
		// TODO Auto-generated method stub
		return new PrintReceipt2();
	}

	/* (non-Javadoc)
	 * @see abstractFactoryPattern.AbstractFactory#getCancelMsg()
	 */
	@Override
	public CancelMsg getCancelMsg() {
		// TODO Auto-generated method stub
		return new CancelMsg2();
	}

	/* (non-Javadoc)
	 * @see abstractFactoryPattern.AbstractFactory#getReturnCash()
	 */
	@Override
	public ReturnCash getReturnCash() {
		// TODO Auto-generated method stub
		return new ReturnCash2();
	}

	/* (non-Javadoc)
	 * @see abstractFactoryPattern.AbstractFactory#getWrongPinMsg()
	 */
	@Override
	public WrongPinMsg getWrongPinMsg() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see abstractFactoryPattern.AbstractFactory#getStorePin()
	 */
	@Override
	public StorePin getStorePin() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see abstractFactoryPattern.AbstractFactory#getEnterPinMsg()
	 */
	@Override
	public EnterPin getEnterPinMsg() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see abstractFactoryPattern.AbstractFactory#getInitializeData()
	 */
	@Override
	public InitializeData getInitializeData() {
		// TODO Auto-generated method stub
		return new InitializeData2();
	}

	/* (non-Javadoc)
	 * @see abstractFactoryPattern.AbstractFactory#getPayMsg()
	 */
	@Override
	public PayMsg getPayMsg() {
		// TODO Auto-generated method stub
		return new PayMsg2();
	}

	/* (non-Javadoc)
	 * @see abstractFactoryPattern.AbstractFactory#getsetM()
	 */
	@Override
	public SET_M getsetM() {
		// TODO Auto-generated method stub
		return new SET_M_2();
	}

}

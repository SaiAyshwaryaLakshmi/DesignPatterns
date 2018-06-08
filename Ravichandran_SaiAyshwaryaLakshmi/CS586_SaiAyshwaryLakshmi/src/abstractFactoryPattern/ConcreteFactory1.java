package abstractFactoryPattern;

import strategyPattern.cancelMsg.CancelMsg;
import strategyPattern.cancelMsg.CancelMsg1;
import strategyPattern.displayMenu.DisplayMenu;
import strategyPattern.displayMenu.DisplayMenu1;
import strategyPattern.enterPin.EnterPin;
import strategyPattern.enterPin.EnterPin1;
import strategyPattern.gasPumpedMsg.GasPumpedMsg;
import strategyPattern.gasPumpedMsg.GasPumpedMsg1;
import strategyPattern.initializeData.InitializeData;
import strategyPattern.initializeData.InitializeData1;
import strategyPattern.payMsg.PayMsg;
import strategyPattern.payMsg.PayMsg1;
import strategyPattern.printReceipt.PrintReceipt;
import strategyPattern.printReceipt.PrintReceipt1;
import strategyPattern.pumpGasUnit.PumpGasUnit;
import strategyPattern.pumpGasUnit.PumpGasUnit1;
import strategyPattern.readyMsg.ReadyMsg;
import strategyPattern.readyMsg.ReadyMsg1;
import strategyPattern.rejectMsg.RejectMsg;
import strategyPattern.rejectMsg.RejectMsg1;
import strategyPattern.returnCash.ReturnCash;
import strategyPattern.setInitialValues.SetInitialValues;
import strategyPattern.setInitialValues.SetInititalValues1;
import strategyPattern.setM.SET_M;
import strategyPattern.setPrice.SetPrice;
import strategyPattern.setPrice.SetPrice1;
import strategyPattern.stopMsg.StopMsg;
import strategyPattern.stopMsg.StopMsg1;
import strategyPattern.storeCash.StoreCash;
import strategyPattern.storePin.StorePin;
import strategyPattern.storePin.StorePin1;
import strategyPattern.storePrice.StorePrice;
import strategyPattern.storePrice.StorePrice1;
import strategyPattern.wrongPinMsg.WrongPinMsg;
import strategyPattern.wrongPinMsg.WrongPinMsg1;

public class ConcreteFactory1 extends AbstractFactory{

	/* (non-Javadoc)
	 * @see abstractFactoryPattern.AbstractFactory#getStorePrice()
	 */
	@Override
	public StorePrice getStorePrice() {
		// TODO Auto-generated method stub
		return new StorePrice1();
	}

	/* (non-Javadoc)
	 * @see abstractFactoryPattern.AbstractFactory#getStoreCash()
	 */
	@Override
	public StoreCash getStoreCash() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see abstractFactoryPattern.AbstractFactory#getDisplayMenu()
	 */
	@Override
	public DisplayMenu getDisplayMenu() {
		// TODO Auto-generated method stub
		return new DisplayMenu1();
	}

	/* (non-Javadoc)
	 * @see abstractFactoryPattern.AbstractFactory#getRejectMsg()
	 */
	@Override
	public RejectMsg getRejectMsg() {
		// TODO Auto-generated method stub
		return new RejectMsg1();
	}

	/* (non-Javadoc)
	 * @see abstractFactoryPattern.AbstractFactory#getSetPrice()
	 */
	@Override
	public SetPrice getSetPrice() {
		// TODO Auto-generated method stub
		return new SetPrice1();
	}

	/* (non-Javadoc)
	 * @see abstractFactoryPattern.AbstractFactory#getReadyMsg()
	 */
	@Override
	public ReadyMsg getReadyMsg() {
		// TODO Auto-generated method stub
		return new ReadyMsg1();
	}

	/* (non-Javadoc)
	 * @see abstractFactoryPattern.AbstractFactory#getInitialValues()
	 */
	@Override
	public SetInitialValues getInitialValues() {
		// TODO Auto-generated method stub
		return new SetInititalValues1();
	}

	/* (non-Javadoc)
	 * @see abstractFactoryPattern.AbstractFactory#getPumpGasUnit()
	 */
	@Override
	public PumpGasUnit getPumpGasUnit() {
		// TODO Auto-generated method stub
		return new PumpGasUnit1();
	}

	/* (non-Javadoc)
	 * @see abstractFactoryPattern.AbstractFactory#getGasPumpedMsg()
	 */
	@Override
	public GasPumpedMsg getGasPumpedMsg() {
		// TODO Auto-generated method stub
		return new GasPumpedMsg1();
	}

	/* (non-Javadoc)
	 * @see abstractFactoryPattern.AbstractFactory#getStopMsg()
	 */
	@Override
	public StopMsg getStopMsg() {
		// TODO Auto-generated method stub
		return new StopMsg1();
	}

	/* (non-Javadoc)
	 * @see abstractFactoryPattern.AbstractFactory#getPrintReceipt()
	 */
	@Override
	public PrintReceipt getPrintReceipt() {
		// TODO Auto-generated method stub
		return new PrintReceipt1();
	}

	/* (non-Javadoc)
	 * @see abstractFactoryPattern.AbstractFactory#getCancelMsg()
	 */
	@Override
	public CancelMsg getCancelMsg() {
		// TODO Auto-generated method stub
		return new CancelMsg1();
	}

	/* (non-Javadoc)
	 * @see abstractFactoryPattern.AbstractFactory#getReturnCash()
	 */
	@Override
	public ReturnCash getReturnCash() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see abstractFactoryPattern.AbstractFactory#getWrongPinMsg()
	 */
	@Override
	public WrongPinMsg getWrongPinMsg() {
		// TODO Auto-generated method stub
		return new WrongPinMsg1();
	}

	/* (non-Javadoc)
	 * @see abstractFactoryPattern.AbstractFactory#getStorePin()
	 */
	@Override
	public StorePin getStorePin() {
		// TODO Auto-generated method stub
		return new StorePin1();
	}

	/* (non-Javadoc)
	 * @see abstractFactoryPattern.AbstractFactory#getEnterPinMsg()
	 */
	@Override
	public EnterPin getEnterPinMsg() {
		// TODO Auto-generated method stub
		return new EnterPin1();
	}

	/* (non-Javadoc)
	 * @see abstractFactoryPattern.AbstractFactory#getInitializeData()
	 */
	@Override
	public InitializeData getInitializeData() {
		// TODO Auto-generated method stub
		return new InitializeData1();
	}

	/* (non-Javadoc)
	 * @see abstractFactoryPattern.AbstractFactory#getPayMsg()
	 */
	@Override
	public PayMsg getPayMsg() {
		// TODO Auto-generated method stub
		return new PayMsg1();
	}

	/* (non-Javadoc)
	 * @see abstractFactoryPattern.AbstractFactory#getsetM()
	 */
	@Override
	public SET_M getsetM() {
		// TODO Auto-generated method stub
		return null;
	}

}

package dataStore;

public class DataStore1 extends DataStore{
	float a,b; double price,TempPrice; float Rprice,Dprice, TempRprice, TempDprice;
	String pin,TempPin; int G ; double total; double balance, AmountOfGas;
	
	/**
	 * Setting Initial Values for price and cash
	 */
	public void setInitializeData()
	{
		price = 0;
	}
	/**
	 * @return the tempPrice
	 */
	public double getTempPrice() {
		return TempPrice;
	}
	/**
	 * @param tempPrice the tempPrice to set
	 */
	public void setTempPrice(double tempPrice) {
		TempPrice = tempPrice;
	}
	/**
	 * Setting Initial Values for unit and total
	 * 
	 * 
	 */
	public void setInitialValues()
	{
		G =0 ;
		total =0;
	}
	public String getTempPin() {
		return TempPin;
	}
	/**
	 * @param tempPin the tempPin to set
	 */
	public void setTempPin(String tempPin) {
		TempPin = tempPin;
	}
	
	/**
	 * @return the amountOfGas
	 */
	public double getAmountOfGas() {
		return AmountOfGas;
	}

	/**
	 * @param amountOfGas the amountOfGas to set
	 */
	public void setAmountOfGas(double amountOfGas) {
		AmountOfGas = amountOfGas;
	}
	/**
	 * @return the tempRprice
	 */
	public float getTempRprice() {
		return TempRprice;
	}
	/**
	 * @param tempRprice the tempRprice to set
	 */
	public void setTempRprice(float tempRprice) {
		TempRprice = tempRprice;
	}


	/**
	 * @return the tempDprice
	 */
	public float getTempDprice() {
		return TempDprice;
	}


	/**
	 * @param tempDprice the tempDprice to set
	 */
	public void setTempDprice(float tempDprice) {
		TempDprice = tempDprice;
	}


	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}


	/**
	 * @param the price to set for billing
	 */
	public void setPrice(double price) {
		this.price = price;
	}


	/**
	 * @return the RegularPrice
	 */
	public float getRegularprice() {
		return Rprice;
	}


	/**
	 * @param the Regularprice to set for billing
	 */
	public void setRegularprice(float rprice) {
		Rprice = rprice;
	}


	/**
	 * @return the Dieselprice
	 */
	public float getDieselprice() {
		return Dprice;
	}


	/**
	 * @return the g
	 */
	public int getG() {
		return G;
	}


	/**
	 * @param g the g to set
	 */
	public void setG(int value) {
		G = value;
	}


	/**
	 * @param the Dieselprice to set for billing
	 */
	public void setDieselprice(float dprice) {
		Dprice = dprice;
	}


	/**
	 * @return the pin
	 */
	public String getPin() {
		return pin;
	}


	/**
	 * @param the pin to set for debit card
	 */
	public void setPin(String pin) {
		this.pin = pin;
	}


	/**
	 * @return the total
	 */
	public double getTotal() {
		return total;
	}


	/**
	 * @param the total to set for billing 
	 */
	public void setTotal(double val) {
		this.total = val;
	}


	/**
	 * @return the balance
	 */
	public double getBalance() {
		return balance;
	}


	/**
	 * @param the balance available to pump gas
	 */
	public void setBalance() {
		this.balance = this.total - this.price;
	}
	
	
 
}

/**
 * 
 */
package dataStore;

/**
 * @author ayshw
 *
 */
public abstract class DataStore {
	private static int GasPumpMachine=0;
	int G,L,SuperPrice,PremiumPrice,RegularGasPrice,TempSprice,TempPprice,TempRcost,M,tempPriceInt,priceInt,totalInt,AmountOfGasInt,tempPremium;
	/**
	 * @return the tempPremium
	 */
	public int getTempPremium() {
		return tempPremium;
	}
	/**
	 * @param tempPremium the tempPremium to set
	 */
	public void setTempPremium(int tempPremium) {
		this.tempPremium = tempPremium;
	}
	float RegularPrice,DieselPrice,cash,TempRprice, TempDprice ,TempCash;
	String pin, TempPin;
	double price, tempPrice, total, tempTotal, balance,AmoutOfGas;
	/**
	 * @return the tempPriceInt
	 */
	public int getTempPriceInt() {
		return tempPriceInt;
	}
	/**
	 * @param priceInt the priceInt to set
	 */
	public void setPriceInt(int priceInt) {
		this.priceInt = priceInt;
	}
	/**
	 * @param tempPriceInt the tempPriceInt to set
	 */
	public void setTempPriceInt(int tempPriceInt) {
		this.tempPriceInt = tempPriceInt;
	}
	/**
	 * @return the priceInt
	 */
	public int getPriceInt() {
		return priceInt;
	}
	
	/**
	 * @return the totalInt
	 */
	public int getTotalInt() {
		return totalInt;
	}
	/**
	 * @param totalInt the totalInt to set
	 */
	public void setTotalInt(int totalInt) {
		this.totalInt = totalInt;
	}
	
	public void setGasPump()
	{						
		
		
	}
	/**
	 * @return the amountOfGasInt
	 */
	public int getAmountOfGasInt() {
		return AmountOfGasInt;
	}
	/**
	 * @param amountOfGasInt the amountOfGasInt to set
	 */
	public void setAmountOfGasInt(int amountOfGasInt) {
		AmountOfGasInt = amountOfGasInt;
	}
	public void setGasPump(int value) 
	{ 
		GasPumpMachine = value; 				
	}
	public static int getGasPump() 
	{ 

		return GasPumpMachine; 
		}
	/**
	 * @return the tempPin
	 */
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
	 * @return the m
	 */
	public int getM() {
		return M;
	}
	/**
	 * @param m the m to set
	 */
	public void setM(int m) {
		M = m;
	}
	
	/**
	 * @return the amoutOfGas
	 */
	public double getAmoutOfGas() {
		return AmoutOfGas;
	}
	/**
	 * @param amoutOfGas the amoutOfGas to set
	 */
	public void setAmoutOfGas(double amoutOfGas) {
		AmoutOfGas = amoutOfGas;
	}
	/**
	 * @return the tempCash
	 */
	public float getTempCash() {
		return TempCash;
	}
	/**
	 * @param tempCash the tempCash to set
	 */
	public void setTempCash(float tempCash) {
		TempCash = tempCash;
	}
	
	/**
	 * @return the tempSprice
	 */
	public int getTempSprice() {
		return TempSprice;
	}
	/**
	 * @param tempSprice the tempSprice to set
	 */
	public void setTempSprice(int tempSprice) {
		TempSprice = tempSprice;
	}
	/**
	 * @return the tempPprice
	 */
	public int getTempPprice() {
		return TempPprice;
	}
	/**
	 * @param tempPprice the tempPprice to set
	 */
	public void setTempPprice(int tempPprice) {
		TempPprice = tempPprice;
	}
	/**
	 * @return the tempRcost
	 */
	public int getTempRcost() {
		return TempRcost;
	}
	/**
	 * @param tempRcost the tempRcost to set
	 */
	public void setTempRcost(int tempRcost) {
		TempRcost = tempRcost;
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
	 * @return the l
	 */
	public int getL() {
		return L;
	}
	/**
	 * @param l the l to set
	 */
	public void setL(int Value) {
		L = Value;
	}
	/**
	 * @return the pin
	 */
	public String getPin() {
		return pin;
	}
	/**
	 * @param pin the pin to set
	 */
	public void setPin(String pin) {
		this.pin = pin;
	}
	/**
	 * @return the regularPrice
	 */
	public float getRegularPrice() {
		return RegularPrice;
	}
	/**
	 * @param regularPrice the regularPrice to set
	 */
	public void setRegularPrice(float regularPrice) {
		RegularPrice = regularPrice;
	}
	/**
	 * @return the dieselPrice
	 */
	public float getDieselPrice() {
		return DieselPrice;
	}
	/**
	 * @param dieselPrice the dieselPrice to set
	 */
	public void setDieselPrice(float dieselPrice) {
		DieselPrice = dieselPrice;
	}
	/**
	 * @return the superPrice
	 */
	public int getSuperPrice() {
		return SuperPrice;
	}
	/**
	 * @param superPrice the superPrice to set
	 */
	public void setSuperPrice(int superPrice) {
		SuperPrice = superPrice;
	}
	/**
	 * @return the premiumPrice
	 */
	public int getPremiumPrice() {
		return PremiumPrice;
	}
	/**
	 * @param premiumPrice the premiumPrice to set
	 */
	public void setPremiumPrice(int premiumPrice) {
		PremiumPrice = premiumPrice;
	}
	
	public int getRegularGasPrice() {
		return RegularGasPrice;
	}
	/**
	 * @param premiumPrice the premiumPrice to set
	 */
	public void setRegularGasPrice(int regularGasPrice) {
		RegularGasPrice = regularGasPrice;
	}
	/**
	 * @return the cash
	 */
	public float getCash() {
		return cash;
	}
	/**
	 * @param cash the cash to set
	 */
	public void setCash(float cash) {
		this.cash = cash;
	}
	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	/**
	 * @return the tempPrice
	 */
	public double getTempPrice() {
		return tempPrice;
	}
	/**
	 * @param tempPrice the tempPrice to set
	 */
	public void setTempPrice(double tempPrice) {
		this.tempPrice = tempPrice;
	}
	/**
	 * @return the total
	 */
	public double getTotal() {
		return total;
	}
	/**
	 * @param total the total to set
	 */
	public void setTotal(double val) {
		this.total = val;
	}
	/**
	 * @return the tempTotal
	 */
	public double getTempTotal() {
		return tempTotal;
	}
	/**
	 * @param tempTotal the tempTotal to set
	 */
	public void setTempTotal(double tempTotal) {
		this.tempTotal = tempTotal;
	}
	/**
	 * @return the balance
	 */
	public double getBalance() {
		return balance;
	}
	/**
	 * @param balance the balance to set
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void setInitialValues() {} //Setting Initial Values for unit of Gas and total
	public void setInitializeData() {} //Setting Initial Values for price and cash
	
	
}

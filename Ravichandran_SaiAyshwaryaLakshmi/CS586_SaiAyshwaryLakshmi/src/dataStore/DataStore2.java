

package dataStore;

/**
 * @author Sai AyshwaryaLakshmi Ravichandran
 *
 */
public class DataStore2 extends DataStore{
	int a,b, c;
	float cash , TempCash; int M,L;
	int SuperPrice, RegularGasPrice, PremiumPrice, TempSprice, TempRcost, TempPprice,tempPriceInt,priceInt,totalInt,AmountOfGasInt,tempPremium;
	//double price, tempPrice;
	//double total, tempTotal; 
	double balance;// AmountOfGas;
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
	/**
	 * Setting Initial Values for price and cash
	 */
	public void setInitializeData()
	{
		price = 0;
		cash = 0;
	}
	/**
	 * @return the tempPriceInt
	 */
	public int getTempPriceInt() {
		return tempPriceInt;
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
	 * @param priceInt the priceInt to set
	 */
	public void setPriceInt(int priceInt) {
		this.priceInt = priceInt;
	}
	/**
	 * Setting Initial Values for unit and total
	 * 
	 * 
	 */
	public void setInitialValues()
	{
		L =0 ;
		totalInt =0;
	}
	/**
	 * @return the amountOfGas
	 */
	/*public double getAmountOfGas() {
		return AmountOfGas;
	}*/
	/**
	 * @param amountOfGas the amountOfGas to set
	 */
	/*public void setAmountOfGas(double amountOfGas) {
		AmountOfGas = amountOfGas;
	}*/
	/**
	 * @return the tempSprice
	 */
	public int getTempSprice() {
		return TempSprice;
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
	 * @param tempSprice the tempSprice to set
	 */
	public void setTempSprice(int tempSprice) {
		TempSprice = tempSprice;
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
	 * @return the tempPPrice
	 */
	public int getTempPPrice() {
		return TempPprice;
	}
	/**
	 * @param tempPPrice the tempPPrice to set
	 */
	public void setTempPprice(int tempPPrice) {
		TempPprice = tempPPrice;
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
	 * @return the sprice
	 */
	public int getSuperPrice() {
		return SuperPrice;
	}
	/**
	 * @param sprice the sprice to set
	 */
	public void setSuperPrice(int sprice) {
		SuperPrice = sprice;
	}
	/**
	 * @return the rprice
	 */
	public int getRegularGasPrice() {
		return RegularGasPrice;
	}
	/**
	 * @param rprice the rprice to set
	 */
	public void setRegularGasPrice(int rprice) {
		RegularGasPrice = rprice;
	}
	/**
	 * @return the pprice
	 */
	public int getPremiumPrice() {
		return PremiumPrice;
	}
	/**
	 * @param pprice the pprice to set
	 */
	public void setPremiumPrice(int pprice) {
		PremiumPrice = pprice;
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
	public void setPrice(int price) {
		this.price = price;
	}
	/**
	 * @return the tempPrice
	 */
/*	public double getTempPrice() {
		return tempPrice;
	}
	*//**
	 * @param tempPrice the tempPrice to set
	 *//*
	public void setTempPrice(double tempPrice) {
		this.tempPrice = tempPrice;
	}*/
	/**
	 * @return the total
	 */
	/*public double getTotal() {
		return total;
	}*/
	/**
	 * @param total the total to set
	 */
/*	public void setTotal(double val) {
		this.total = val;
	}
	*//**
	 * @return the tempTotal
	 *//*
	public double getTempTotal() {
		return tempTotal;
	}
	*//**
	 * @param tempTotal the tempTotal to set
	 *//*
	public void setTempTotal(double tempTotal) {
		this.tempTotal = tempTotal;
	}*/
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
	
	


}

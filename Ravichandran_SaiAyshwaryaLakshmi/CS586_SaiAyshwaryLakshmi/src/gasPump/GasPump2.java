package gasPump;

import abstractFactoryPattern.AbstractFactory;
import abstractFactoryPattern.ConcreteFactory1;
import abstractFactoryPattern.ConcreteFactory2;
import dataStore.DataStore;
import dataStore.DataStore1;
import dataStore.DataStore2;
import mdaEfsm.MDAEFSM;

public class GasPump2 {

	MDAEFSM md = new MDAEFSM();
	DataStore ds = new DataStore2();
	public GasPump2()
	{	
	}
	public void setGasPump2()
	{
		AbstractFactory af = new ConcreteFactory2();	
		af.setDataStore(ds);
		ds.setGasPump(2);
		}
	
	public void Activate (int a, int b, int c)
	{
		ds.setInitializeData();
		ds.setTempRcost(a);
		ds.setTempSprice(b);
		ds.setTempPremium(c);
		md.Activate();
		System.out.println("GasPump2-Activated");
	}

	public void PayCash(float c)
	{
		ds.setM(0);
		ds.setTempCash(c);
		md.PayType(2);
	}	
	public void PayCredit()
	{
		ds.setM(1);
		md.PayType(1);
	}
	public void Reject()
	{
	   md.Reject();
	}
	public void Cancel()
	{
		md.Cancel();		
	}	
	public void Approved()
	{
		md.Aprroved();
	}
	public void Super()
	{
		md.SelectGas(1);
		md.Continue();
	}
	public void Regular()
	{
		md.SelectGas(0);
		md.Continue();
	}
	public void Premium()
	{
		md.SelectGas(2);
		md.Continue();
	}
	public void StartPump()
	{
		md.StartPump();	
	}
	public void PumpLiter()
	{
		float cash = ds.getCash();
		int total = ds.getTotalInt();
		if((cash>0)&&(cash < total))
			md.StopPump();
		else
			md.Pump();
	}
	public void StopPump()
	{
		md.StopPump();
	}
	public void Receipt()
	{
		md.Receipt();
	}
	public void NoReceipt()
	{
		md.NoReceipt();
	}
}

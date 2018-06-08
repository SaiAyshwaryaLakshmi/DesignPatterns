package gasPump;

import abstractFactoryPattern.AbstractFactory;
import abstractFactoryPattern.ConcreteFactory1;
import dataStore.DataStore;
import dataStore.DataStore1;
import mdaEfsm.MDAEFSM;

public class GasPump1{
	
	MDAEFSM md = new MDAEFSM();
	DataStore ds = new DataStore1();
	public GasPump1()
	{	
		
	}
	public void setGasPump()
	{
		AbstractFactory af = new ConcreteFactory1();	
		af.setDataStore(ds);
		ds.setGasPump(1);
		}
	public void Activate (float a, float b)
	{
		ds.setInitializeData();
		ds.setTempRprice(a);
		ds.setTempDprice(b);
		md.Activate();
		System.out.println("GasPump1-Activated");
	}
	public void Start()
	{
	  md.Start();
	}	
	public void PayCredit()
	{
		ds.setM(0);
		md.PayType(1);
	}	
	public void Reject()
	{
	   md.Reject();
	}
	public void PayDebit(String p)
	{
		ds.setTempPin(p);
		md.PayType(3);
	}	
	public void Pin(String x)
	{
		ds.setM(0);
		ds.setPin(ds.getTempPin());
		if( ds.getPin().equals(x))
			md.CorrectPin();
		else
			md.IncorrectPin();
	}
	public void Cancel()
	{
		md.Cancel();		
	}	
	public void Approved()
	{
		md.Aprroved();
	}
	public void Diesel()
	{
		md.SelectGas(1);
	}
	public void Regular()
	{
		md.SelectGas(0);
	}
	public void StartPump()
	{
		md.Continue();
		md.StartPump();	
	}
	public void PumpGallon()
	{
		md.Pump();
	}
	public void StopPump()
	{
		md.StopPump();
		md.Receipt();
	}
	public void FullTank()
	{
		md.StopPump();
		md.Receipt();
	}
	
}

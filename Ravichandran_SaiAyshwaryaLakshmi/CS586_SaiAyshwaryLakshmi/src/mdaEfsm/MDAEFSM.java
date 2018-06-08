package mdaEfsm;
import statePattern.*;

public class MDAEFSM {

	static int currentState = 0;
	
	public MDAEFSM()
	{
		States start = new Start();
		States s0 = new S0();
		States s1 = new S1();
		States s2 = new S2();
		States s3 = new S3();
		States s4 = new S4();
		States s5 = new S5();
		States s6 = new S6();
		States s8 = new S8();		
	}
	
	public void Activate() 
	{		
		States start = new Start();		
		if (currentState == 0) 
		{
			start.Activate();
			currentState = 1;  
		}
		else
			System.out.println("Process has not begun");
	}
	public void Start() 
	{
		States s0 = new S0();		
		if (currentState == 1) 
		{
			s0.Start();
			currentState = 2;
		}
		else
			System.out.println("Remaining in the same State");		
	}
	public void PayType(int type) 
	{
		States s1 = new S1();		
		if (currentState == 2) 
			s1.PayType(type);
		if	(type == 1)
		{
			currentState = 3;	
		}
		else if(type == 2)
		{
			s1.PayType(type);
			currentState = 4;
		}
		else if(type == 3 )
		{
			currentState = 8;
		}

		else
			System.out.println("Remaining in the same State");	
	}
	public void Reject() 
	{
		States s2 = new S2();	
		if (currentState == 3) 
		{
			s2.Reject();
			currentState = 1;
		}
		else 
			System.out.println("Remaining in the same State");
	}

	public void Cancel() 
	{
		States s3 = new S3();	
		if (currentState == 4) 
		{
			s3.Cancel();
			currentState = 1;
		}
		else 
			System.out.println("Remaining in the same State");
	}
	public void Aprroved() 
	{
		States s2 = new S2();	
		if (currentState == 3) 
		{
			s2.Approved();
			currentState = 4;
		}
		else 
			System.out.println("Remaining in the same State");
		
	}
	public void SelectGas(int g) 
	{
		States s3 = new S3();	
		if (currentState == 4) 
		{
			s3.SelectGas(g);
			currentState = 4;
		}
		else 
			System.out.println("Remaining in the same State");		
	}
	public void Continue() 	
	{ 
		States s3 = new S3();
		if (currentState == 4) 
		{
			s3.Continue();
			currentState = 5;
		}
		else 
			System.out.println("Remaining in the same State");		
	}
	public void StartPump() 
	{
		States s4 = new S4();	
		if (currentState == 5) 
		{
			s4.StartPump();
			currentState = 6;
		}
		else 
			System.out.println("Remaining in the same State");	
	}
	public void Pump() 
	{
		States s5 = new S5();	
		if (currentState == 6) 
		{
			s5.Pump();
			currentState = 6;
		}
		else 
			System.out.println("Remaining in the same State");			
	}
	public void StopPump() 
	{
		States s5 = new S5();	
		if (currentState == 6) 
		{
			s5.StopPump();
			currentState = 7;
		}
		else 
			System.out.println("Remaining in the same State");	
		
	}
	public void Receipt() 
	{
		States s6 = new S6();	
		if (currentState == 7) 
		{
			s6.Receipt();
			currentState = 1;
		}
		else 
			System.out.println("Remaining in the same State");	
	}
	public void NoReceipt() 
	{
		States s6 = new S6();	
		if (currentState == 7) 
		{
			s6.NoReceipt();
			currentState = 1;
		}
		else 
			System.out.println("Remaining in the same State");	
	}
	public void CorrectPin() 
	{
		States s8 = new S8();	
		if (currentState == 8) 
		{
			s8.CorrectPin();
			currentState = 4;
		}
		else 
			System.out.println("Remaining in the same State");
	}
	public void IncorrectPin() 
	{
		States s8 = new S8();	
		if (currentState == 8) 
		{
			s8.IncorrectPin();
			currentState = 1;
		}
		else 
			System.out.println("Remaining in the same State");
		
	}
	
	
}

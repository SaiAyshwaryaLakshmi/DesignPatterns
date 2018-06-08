/**
 * 
 */
package DriverClass;

import java.util.Scanner;

import abstractFactoryPattern.AbstractFactory;
import abstractFactoryPattern.ConcreteFactory1;
import gasPump.*;
/**
 * @author ayshw
 *
 */
public class MainDriver 
{
	public static void main(String args[])
	{		

		System.out.println("Please Select the Gas Pump of your Choice: ");
		System.out.println("1. GasPump 1 \n2. GasPump 2 \n3. Exit");
		System.out.println("Enter you choice     : ");
		Scanner readerGasPump = new Scanner(System.in);
		int choicePump = readerGasPump.nextInt();
		Boolean IsActive = false;

		switch(choicePump)
		{
		case 1:
			GasPump1 gp1 = new GasPump1();
			gp1.setGasPump();
			float a1, b1;
			char ch;
			String p,x;
			//Menu
			System.out.println("\t\t\t\t\tGasPump-1");
			System.out.println("\t\tMENU of Operations");
			System.out.println("\t\t0. Activate(float, float)");
			System.out.println("\t\t1. Start()");
			System.out.println("\t\t2. PayCredit()");	
			System.out.println("\t\t3. Reject()");
			System.out.println("\t\t4. PayDebit(String)");
			System.out.println("\t\t5. Pin(String)");
			System.out.println("\t\t6. Cancel()");
			System.out.println("\t\t7. Approved()");
			System.out.println("\t\t8. Diesel()");
			System.out.println("\t\t9. Regular()");
			System.out.println("\t\ts. StartPump()");		
			System.out.println("\t\ta. PumpGallon()");
			System.out.println("\t\tb. StopPump()");
			System.out.println("\t\tc. FullTank()");
			System.out.println("\t\tq. Quit the program");
			System.out.println("\t\tPlease make a note of these operations");
			System.out.println("\t\tGasPump-1 Execution");
			Scanner reader1 = new Scanner(System.in);
			ch = '1';
			while (ch !='q') {
				System.out.println(" Select Operation: ");
				System.out.println("0-Activate,1-Start,2-PayCredit,3-Reject,4-PayDebit,5-Pin,6-Cancel,");
				System.out.println("7-Approved,8-Diesel,9-Regular,s-StartPump,a-PumpGallon,b-StopPump,c-FullTank,q-quit");
				System.out.println("enter your choice1");
				ch =(char) reader1.next().charAt(0);
				switch (ch) {
				case '0': { //Activate()
					System.out.println(" Operation: Activate()");
					System.out.println(" Enter value:");
					a1 = reader1.nextFloat();
					System.out.println(" Enter value");
					b1 = reader1.nextFloat();
					if(a1 > 0 && b1 >0)
					{gp1.Activate(a1, b1);
					IsActive = true;
					break;
					}
					else
					{
						System.out.println("Enter a Valid Input");
						break;
					}
				    }
				case '1': 
					if(IsActive){ //Start
						System.out.println(" Operation: Start()");
						gp1.Start();
						break;
					}
					else
						System.out.println("Please Activate Pump");
				case '2': if(IsActive){ //PayCredit
					System.out.println(" Operation: PayCredit()");
					gp1.PayCredit();
					break;
				}
				else
				{System.out.println("Please Activate Pump"); break;}
				case '3':if(IsActive) { 
					//Reject
					System.out.println(" Operation: Reject()");
					gp1.Reject();
					break;
				}
				case '4':if(IsActive) {
					//PayDebit()
					System.out.println(" Operation: PayDebit()");
					System.out.println("Enter Four digit pin");
					p = reader1.next();
					if(p != null)
					{gp1.PayDebit(p);
					break;}		
					else
					{System.out.println("please enter a valid pin"); break;}
				}
				else
				{System.out.println("Please Activate Pump");break;}
				case '5':if(IsActive) {//Pin
					System.out.println(" Operation: Pin()");
					System.out.println("Enter Four digit pin");
					x = reader1.next();
					if(x != "")
					{gp1.Pin(x);
					break;}
					else
					{System.out.println("please enter a valid pin"); break;}
				}
				else
				{System.out.println("Please Activate Pump");break;}
				case '6':if(IsActive) { //Cancel;
					System.out.println("Operation: Cancel()");
					gp1.Cancel();
					break;
				}
				else
				{System.out.println("Please Activate Pump");break;}
				case '7':if(IsActive) { 
					//Approved
					System.out.println(" Operation: Approved()");
					gp1.Approved();
					break;
				}
				else
				{System.out.println("Please Activate Pump");break;}
				case '8': if(IsActive){ //Diesel
					System.out.println("Operation: Diesel()");
					gp1.Diesel();
					break;
				}
				else
				{System.out.println("Please Activate Pump");break;}
				case '9':if(IsActive) {//Regular
					System.out.println(" Operation: Regular()");
					gp1.Regular();
					break;
				}
				else
				{System.out.println("Please Activate Pump");break;}
				case 's':if(IsActive){
					//StartPump	
					System.out.println(" Operation: StartPump()");
					gp1.StartPump();
					break;
				}
				else
				{System.out.println("Please Activate Pump");break;}
				case 'a': if(IsActive){
					//PumpGallon
					System.out.println(" Operation:PumpGallon()");
					gp1.PumpGallon();
					break;
				}
				else
				{System.out.println("Please Activate Pump");break;}
				case 'b': if(IsActive){ //Stop
					System.out.println(" Operation: Stop()");
					gp1.StopPump();
					break;
				}
				else
					{System.out.println("Please Activate Pump");break;}
				case 'c': if(IsActive){ //Receipt
					System.out.println(" Operation: FullTank()");
					gp1.FullTank();
					break;
				}
				else
				{System.out.println("Please Activate Pump");break;}
				case 'q':
				{break;}
			}
		}
				
				case 2:
					GasPump2 gp2 = new GasPump2();
					gp2.setGasPump2();
					int a, b, c;
					double c1; float cash;
					char character;
					//Menu
					System.out.println("\t\t\t\t\tGasPump-2");
					System.out.println("\t\tMENU of Operations");
					System.out.println("\t\t0. Activate(int,int,int)");
					System.out.println("\t\t1. PayCash(int)");
					System.out.println("\t\t2. PayCredit()");
					System.out.println("\t\t3. Approved()");
					System.out.println("\t\t4. Reject()");
					System.out.println("\t\t5. Cancel()");
					System.out.println("\t\t6. Premium()");
					System.out.println("\t\t7. Regular()");
					System.out.println("\t\t8. Super()");
					System.out.println("\t\t9. StartPump()");
					System.out.println("\t\ta. PumpLiter()");
					System.out.println("\t\tb. Stop()");
					System.out.println("\t\tc. Receipt()");
					System.out.println("\t\td. NoReceipt()");
					System.out.println("\t\tq. Quit the program");
					System.out.println("\t\tPlease make a note of these operations");
					System.out.println("\t\tGasPump-2 Execution");
					Scanner reader = new Scanner(System.in);
					character = '1';
					while (character !='q') {
						System.out.println(" Select Operation: ");
						System.out.println("0-Activate,1-PayCash,2-PayCredit,3-Approved,4-Reject,5-Cancel,6-Premium,");
						System.out.println("7-Regular,8-Super,9-StartPump,aPumpLiter,b-Stop,c-Receipt,d-NoReceipt,q-quit");
						System.out.println("enter your choice1");
						character =(char) reader.next().charAt(0);
						switch (character) {
						case '0': { //Activate()
							System.out.println(" Operation: Activate()");
							System.out.println(" Enter value:");
							a = reader.nextInt();
							System.out.println(" Enter value");
							b = reader.nextInt();
							System.out.println(" Enter value");
							c = reader.nextInt();
							if(a > 0 && b >0 && c>0) {
								gp2.Activate(a, b, c);
								IsActive = true;
								break;}
								else
								{System.out.println("Enter a Valid input");break;}
						}
						case '1':if(IsActive) { //PayCash
							System.out.println(" Operation: PayCash(int c)");
							System.out.println(" Enter value of the parameter c:");
							cash = reader.nextInt();
							gp2.PayCash(cash);
							break;
						}
						else
						{System.out.println("Please Activate Pump");break;}
						case '2': if(IsActive){ //PayCredit
							System.out.println(" Operation: PayCredit()");
							gp2.PayCredit();
							break;
						}
						else
						{System.out.println("Please Activate Pump");break;}
						case '3':if(IsActive) { //Approved
							System.out.println(" Operation: Approved()");
							gp2.Approved();
							break;
						}else
						{System.out.println("Please Activate Pump");break;}
						case '4': if(IsActive){//Reject
							System.out.println(" Operation: Reject()");
							gp2.Reject();
							break;
						}else
						{System.out.println("Please Activate Pump");break;}
						case '5': if(IsActive){//Cancel
							System.out.println("Operation: Cancel()");
							gp2.Cancel();
							break;
						}else
						{System.out.println("Please Activate Pump");break;}
						case '6':if(IsActive) {//Premium
							System.out.println(" Operation: Premium()");
							gp2.Premium();
							break;
						}else
						{System.out.println("Please Activate Pump");break;}
						case '7': if(IsActive){ //Regular
							System.out.println(" Operation: Regular()");
							gp2.Regular();
							break;
						}
						case '8': if(IsActive){ //Super
							System.out.println("Operation: Super()");
							gp2.Super();
							break;
						}else
						{System.out.println("Please Activate Pump");break;}
						case '9': if(IsActive){//StartPump
							System.out.println(" Operation: StartPump()");
							gp2.StartPump();
							break;
						}else
						{System.out.println("Please Activate Pump");break;}
						case 'a': if(IsActive){
							//PumpLiter
							System.out.println(" Operation:PumpLiter()");
							gp2.PumpLiter();
							break;
						}else
						{System.out.println("Please Activate Pump");break;}
						case 'b': if(IsActive){ //Stop
							System.out.println(" Operation: Stop()");
							gp2.StopPump();
							break;
						}else
						{System.out.println("Please Activate Pump");break;}
						case 'c': if(IsActive){ //Receipt
							System.out.println(" Operation: Receipt()");
							gp2.Receipt();;
							break;
						}else
						{System.out.println("Please Activate Pump");break;}
						case 'd':if(IsActive) 
						{ 
							//NoReceipt 
							System.out.println(" Operation: NoReceipt()");
							gp2.NoReceipt();
							break;
						}else
						{System.out.println("Please Activate Pump");break;}
						case 'q': 
							break;
						}
					}
			}
	}
}

import javax.swing.JOptionPane;

public class Project02 
{
	public static void main(String[] args)
	{
		int phoneCode = 5;
		int servicePlan = 6;
		int entService = 4;
		int nService = 0;
		
		double phoneCost = 0.0;
		String phoneName = " ";
		String planName = " ";
		double planCost = 0.0;
		
		String esName = " ";
		double esCost = 0.0;
		
		String firstName;
		String lastName;
		String address;
		String city;
		String state;
		short zipCode;
		
		double totalCost = 0.0;
		double discount = 0.0;
		double finalCost = 0.0;
		String input;
		
		//Smart Phones
		input = JOptionPane.showInputDialog(null,
		"			Please Select Your Smart Phone"  +"\n"+
		"			Price/Month for 24 Months"		 +"\n"+
		"____________________________________"+"\n"+
		"		1. Apple Iphone 14 pro		  $99.33" +"\n"+
		"		2. Samsung Galaxy S20 FE 5g UW  $83.55"+"\n"+
		"3. Google Pixel 6 pro		   $50.72"  +"\n"+
		"		4. Motorola Moto g pure		 $41.25"  +"\n"+
		"		5. No Service"+"\n"+
		"____________________________________",
		" Smart Phone", JOptionPane.QUESTION_MESSAGE);
		phoneCode = Integer.parseInt(input);
		
	//Switch function where you choose a smart phone
		switch(phoneCode)
		{
			case 1:
			{
				phoneName = "Apple Iphone 14 pro";
				phoneCost = 99.33;
				nService++;
				totalCost(phoneCost);
				break;
			}
			case 2:
			{
				phoneName = "Samsung Galaxy S20 FE 5g UW";
				phoneCost = 83.55;
				totalCost(phoneCost);
				nService++;
				break;
			}
			case 3:
			{
				phoneName = "Google Pixel 6 Pro";
				phoneCost = 50.72;
				totalCost(phoneCost);
				nService++;
				break;
			}
			case 4:
			{
				phoneName = "Motorola Moto g Pure";
				phoneCost = 41.25;
				totalCost(phoneCost);
				nService++;
				break;
			}
			case 5:
			{
				phoneName = "No Service";
				phoneCost = 0;
				totalCost(phoneCost);
				break;
			}
			default:
			{
				JOptionPane.showMessageDialog(null,"Made a Wrong Choice");
				
				break;
			}
		}
		
		//Choose Service Plan
		input = JOptionPane.showInputDialog(null,
				"			Please Select Your Service Plan"  +"\n"+
				"                     Monthly Cost"		 +"\n"+
				"____________________________________"+"\n"+
				"	Unlimited						 " +"\n"+
				"		1. Start $35.00				 "+"\n"+
				"2. Play More $55.00				 "  +"\n"+
				"		3. Get More $65.00			 "  +"\n"+
				"									 "+"\n"+
				"   Shared Data						 "+"\n"+
				"	4. S (5GB) 	$75.00				 "+"\n"+
				"	5. M(10GB)  $85.00				 "+"\n"+
				"	6. No Service					 "+"\n"+
				"____________________________________",
				 JOptionPane.QUESTION_MESSAGE);
		servicePlan = Integer.parseInt(input);
		switch(servicePlan)
		{
			case 1:
			{
				planName = "Start";
				planCost = 35.00;
				nService++;
				break;
			}
			case 2:
			{
				planName = "Play More";
				planCost = 55.00;
				nService++;
				break;
			}
			case 3:
			{
				planName = "Get More";
				planCost = 65.00;
				nService++;
				break;
			}
			case 4:
			{
				planName = "S(5GB)";
				planCost = 75.00;
				nService++;
				break;
			}
			case 5:
			{
				planName = "M(10GB)";
				planCost = 85.00;
				nService++;
				break;
			}
			case 6:
			{
				planName = "No Service";
				planCost = 0;
				break;
			}
			default:
			{
				JOptionPane.showMessageDialog(null,"Made a Wrong Choice");
				
				break;
			}
		}
		
		//Choose Entertainment Plan
		input = JOptionPane.showInputDialog(null,
				"			Please Select Your Entertainment Service"  +"\n"+
				"			Monthly Cost			 "+"\n"+
				"____________________________________"+"\n"+
				"		1. Disney  $5.99			 " +"\n"+
				"		2. Hulu 	$7.99			 "+"\n"+
				"3. Sports + Disney + Hulu  $10.99	 "  +"\n"+
				"		4. No Service				 "  +"\n"+
				"____________________________________", 
				JOptionPane.QUESTION_MESSAGE);
		entService = Integer.parseInt(input);
		switch(entService)
		{
			case 1:
			{
				esName = "Disney";
				esCost = 5.99;
				nService++;
				break;
			}
			case 2:
			{
				esName = "Hulu";
				esCost = 7.99;
				nService++;
				break;
			}
			case 3:
			{
				esName = "Sports + Disney + Hulu";
				esCost = 10.99;
				nService++;
				break;
			}
			case 4:
			{
				esName = "No Service";
				esCost = 0;
				break;
			}
			default:
			{
				JOptionPane.showMessageDialog(null,"Made a Wrong Choice");
				
				break;
			}
		}
		
		//Enter your credentials
		firstName = JOptionPane.showInputDialog(null,
				"Please enter your First Name:",
				"First Name",
				JOptionPane.QUESTION_MESSAGE);
		
		lastName = JOptionPane.showInputDialog(null,
				"Please enter your Last Name:",
				"Last Name",
				JOptionPane.QUESTION_MESSAGE);
		
		address = JOptionPane.showInputDialog(null,
				"Please enter your Address:",
				"Address",
				JOptionPane.QUESTION_MESSAGE);
		
		city = JOptionPane.showInputDialog(null,
				"Please enter your City:",
				"City",
				JOptionPane.QUESTION_MESSAGE);
		
		state = JOptionPane.showInputDialog(null,
				"Please enter your State:",
				"State",
				JOptionPane.QUESTION_MESSAGE);
		
		input = JOptionPane.showInputDialog(null,
				"Please enter your Zip Code:",
				"Zip Code",
				JOptionPane.QUESTION_MESSAGE);
		zipCode = Short.valueOf(input);
		
		//discount 
		if (nService == 3)
		{
			discount = .25;
			
		}
		else if (nService == 2)
		{
			discount = .2;
		}
				
		
		
		//calculate the total of everything
		totalCost = Math.floor(phoneCost+planCost+esCost);
		finalCost = (totalCost - (discount*totalCost));
			
		
		//Display information
		JOptionPane.showInternalMessageDialog(null,
				"				CSC 229 - Project 2		            "     +"\n"+
				"___________________________________________________"	   +"\n"+
				"	First Name : "+ firstName 					  	   +"\n"+
				"	Last Name  : "+ lastName						  	   +"\n"+
				"	Address	   : " + address + "\n" + city + "\n" + state + zipCode					  	   +"\n"+
				"___________________________________________________"	   +"\n"+
				"				Service List					    "	   +"\n"+
				"___________________________________________________"	   +"\n"+
				"	Phone	   			  : "+ phoneName + "---" + phoneCost   +"\n"+
				"	Service Plan		  : "+ planName + "---" + planCost 	   +"\n"+
				"   Entertainment Service : "+ esName + "---" + esCost   	   +"\n"+
				"___________________________________________________"	   +"\n"+
				"						Total Cost: "+ totalCost 	 +"\n"+
				"						Discount: "+ discount + "%"  +"\n"+
				"						Final Cost: "+ finalCost,
				"Final Cost of Services",
				 JOptionPane.INFORMATION_MESSAGE);
		}
		
	

	private static void totalCost(double phoneCost) {
		// TODO Auto-generated method stub
		
	} //Method Header

}//Class Header

package input.controller;

import input.view.PopupDisplay;
import input.model.Thingy;

public class PopupController
{
	
	private PopupDisplay myPopups;
	private Thingy myTestThing;
	
	public PopupController()
	{
		myPopups = new PopupDisplay();
	}
	
	public void start()
	{
		String myName = myPopups.grabAnswer("Type in your name.");
		myPopups.showResponse("You typed: " + myName);
		
		String tempAge = myPopups.grabAnswer("Type in your age.");
		int myAge;
		
		while(!isInteger(tempAge))
		{
			tempAge = myPopups.grabAnswer("Type in a positive integer for your age!!!");
		}
		
		if(isInteger(tempAge))
		{
			myAge = Integer.parseInt(tempAge);
		}
		else
		{
			myAge = -9999999;
		}
		
		myPopups.showResponse("You typed " + myAge);
		
		String tempWeight = myPopups.grabAnswer("Type in your weight.");
		double myWeight;
		
		while(!isDouble(tempWeight))
		{
			tempWeight = myPopups.grabAnswer("Type in a positive decimal number for your weight!!!");
		}
		
		if(isDouble(tempWeight))
		{
			myWeight = Double.parseDouble(tempWeight);
		}
		else
		{
			myWeight = 9999999.99;
		}
		
		myPopups.showResponse("You Typed " + myWeight);
		
		myTestThing = new Thingy(myName, myAge, myWeight);
	}
	
	private boolean isInteger(String input)
	{
		boolean isInt = false;
		
		try 
		{
			int tempAge = Integer.parseInt(input);
			isInt = true;
		}
		catch(NumberFormatException error)
		{
			myPopups.showResponse("Not an Int - Bad value will be used");
		}
		
		return isInt;
	}
	
	private boolean isDouble(String input)
	{
		boolean isDouble = false;
		
		try
		{
			double tempWeight = Double.parseDouble(input);
			isDouble = true;
		}
		catch(NumberFormatException error)
		{
			myPopups.showResponse("Not a Double - Bad value will be used");
		}
		
		
		
		return isDouble;
		
		
		
		
		
		
	}
}

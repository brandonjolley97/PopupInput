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
		
		String temp = myPopups.grabAnswer("Type in your age.");
		int myAge;
		
		if(isInteger(temp))
		{
			myAge = Integer.parseInt(temp);
		}
		else
		{
			myAge = -9999999;
		}
		
		
		String tempWeight = myPopups.grabAnswer("Type in your weight.");
		double myWeight;
		
		if(isDouble(tempWeight))
		{
			myWeight = Double.parseDouble(tempWeight);
		}
		else
		{
			myWeight = 9999999.99;
		}
		
		myTestThing = new Thingy(myName, myAge, myWeight);
	}
	
	private boolean isInteger(String input)
	{
		boolean isInt = false;
		
		try 
		{
			int temp = Integer.parseInt(input);
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
			double temp = Double.parseDouble(input);
			isDouble = true;
		}
		catch(NumberFormatException error)
		{
			myPopups.showResponse("Not a Double - Bad value will be used");
		}
		
		
		
		return isDouble;
		
		
		
		
		
		
	}
}

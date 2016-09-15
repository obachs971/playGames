//Sean Obach

import javax.swing.JOptionPane;
import java.util.*;
public class playGames 
{
	public static void main(String[] args)
	{
		callDiceGame();
	}//End of Main
	/**
	 * This method will proceed to ask the user for how many dice of each type, then will take the sum of all the dice, and ask the user to guess the sum. It will check if it is right or wrong, then will print out the actual sum of the dice.
	 */
	public static void callDiceGame()
	{
		String userInputString;
		int numDice4;
		int numDice6;
		int numDice8;
		int numDice10;
		int numDice12;
		int numDice20;
		int totalSumOfDice;
		int userNumGuess;
		
		userInputString = JOptionPane.showInputDialog("How many 4 sided dice do you want to play with?");
		numDice4 = Integer.parseInt(userInputString);
		userInputString = JOptionPane.showInputDialog("How many 6 sided dice do you want to play with?");
		numDice6 = Integer.parseInt(userInputString);
		userInputString = JOptionPane.showInputDialog("How many 8 sided dice do you want to play with?");
		numDice8 = Integer.parseInt(userInputString);
		userInputString = JOptionPane.showInputDialog("How many 10 sided dice do you want to play with?");
		numDice10 = Integer.parseInt(userInputString);
		userInputString = JOptionPane.showInputDialog("How many 12 sided dice do you want to play with?");
		numDice12 = Integer.parseInt(userInputString);
		userInputString = JOptionPane.showInputDialog("How many 20 sided dice do you want to play with?");
		numDice20 = Integer.parseInt(userInputString);
		
		totalSumOfDice = calcSumOfDice(numDice4, numDice6, numDice8, numDice10, numDice12, numDice20);
		
		userInputString = JOptionPane.showInputDialog("What do you think the sum of the dice is?");
		userNumGuess = Integer.parseInt(userInputString);
		
		if (userNumGuess == totalSumOfDice)
		{
			JOptionPane.showMessageDialog(null, "You are Correct! The sum of the dice is " + totalSumOfDice + ".");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "You are Incorrect! The real sum of the dice is " + totalSumOfDice + ".");
		}
		
	}
	public static int calcSumOfDice(int d4, int d6, int d8, int d10, int d12, int d20)
	{
		int sumOfDice = 0;
		for(int i = 0; i < d4; i++)
		{
			sumOfDice += getDieAmount4();
		}
		for(int i = 0; i < d6; i++)
		{
			sumOfDice += getDieAmount6();
		}
		for(int i = 0; i < d8; i++)
		{
			sumOfDice += getDieAmount8();
		}
		for(int i = 0; i < d10; i++)
		{
			sumOfDice += getDieAmount10();
		}
		for(int i = 0; i < d12; i++)
		{
			sumOfDice += getDieAmount12();
		}
		for(int i = 0; i < d20; i++)
		{
			sumOfDice += getDieAmount20();
		}
		
		return sumOfDice;
	}
	public static int getDieAmount4()
	{
		int randomDie4Number;
		Random rand = new Random ();
		
		randomDie4Number = rand.nextInt(4) + 1;
		
		return randomDie4Number;
	}
	public static int getDieAmount6()
	{
		int randomDie6Number;
		Random rand = new Random ();
		
		randomDie6Number = rand.nextInt(6) + 1;
		
		return randomDie6Number;
	}
	public static int getDieAmount8()
	{
		int randomDie8Number;
		Random rand = new Random ();
		
		randomDie8Number = rand.nextInt(8) + 1;
		
		return randomDie8Number;
	}
	public static int getDieAmount10()
	{
		int randomDie10Number;
		Random rand = new Random ();
		
		randomDie10Number = rand.nextInt(10) + 1;
		
		return randomDie10Number;
	}
	public static int getDieAmount12()
	{
		int randomDie12Number;
		Random rand = new Random ();
		
		randomDie12Number = rand.nextInt(12) + 1;
		
		return randomDie12Number;
	}
	public static int getDieAmount20()
	{
		int randomDie20Number;
		Random rand = new Random ();
		
		randomDie20Number = rand.nextInt(20) + 1;
		
		return randomDie20Number;
	}
}


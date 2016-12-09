package game.controller;

import java.util.Scanner;
import game.model.*;
import game.model.Character;
import game.controller.*;

public class GameController
{
	Scanner input = new Scanner(System.in);
	
	private String userName;
	private int userChoice;
	private boolean gameBeginningOn;
	private int gameStarted;
	
	private int startingLevel = 1;
	private int startingStr = 5;
	private int startingInt = 5;
	private int startingVit = 5;
	private int startingWis = 5;
	private int startingDex = 5;
	private int startingPhyDef = 5;
	private int startingMagDef = 5;
	private int startingGold = 10;
	private int startingExp = 0;
	
	Character player;
	
	public GameController()
	{
		beginGame();
	}
	
	public void beginGame()
	{
		//Starts game
		gameBeginningOn = true;
		gameStarted = 0;
				
		while (gameBeginningOn == true)
		{		
			switch(gameStarted)
			{
				case 0:
					System.out.println("Hello hero. What is your name?");
					userName = input.nextLine();
							
					System.out.println("Nice to meet you " + userName + ".\n");
					System.out.println("Shall we continue? (1)Yes, (2)Wait..., (3)Quit");
							
					userChoice = input.nextInt();
					gameStarted = 1;
					break;
							
				case 1:
				switch(userChoice)
				{
					//The player choose Continue
					case 1: 
						player = new Character(userName, startingLevel, startingStr, startingInt, startingVit, startingWis, startingDex, startingPhyDef, 
												startingMagDef, startingGold, startingExp);
						System.out.println("Game Continues...");
						gameBeginningOn = false;
						break;
					
					//The player choose Wait...
					case 2: 
						System.out.println("What is the problem? (1)Continue, (2)Change Name..., (3)Quit\n");
						userChoice = input.nextInt();
									
					if (userChoice == 2)
					{
						input.nextLine();
						System.out.println("What shall be your new name?");
						userName = input.nextLine();
						userChoice = 4;
						System.out.println(userName + " Is your new name.\n");
						break;
					}
					break;
							
					//The player choose Quit
					case 3:
						break;
									
					case 4: 
						System.out.println("Shall we continue? (1)Yes, (2)Wait..., (3)Quit");
						userChoice = input.nextInt();
					break;
									
					default:
						System.out.println("Invalid entry. (1)Continue, (2)Wait..., (3)Quit\n");
						userChoice = input.nextInt();
						break;
				}
				
			}
				
		}	
	}
	
	public void updateGame(){}
}

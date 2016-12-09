package game.main;
import game.controller.*;
import game.model.World;


public class MainClass
{
	

	public static void main(String[] args)
	{
		World theWorld = World.getWorld();
		String itemName;
		itemName = theWorld.getItem(1).getName();
		System.out.println(itemName);
		//GameController gameControl = new GameController();
	}

}

package game.model;
import java.util.ArrayList;

import game.model.*;

public class World
{
	
	private static World theWorld = new World();
	
	ArrayList<Item> items = new ArrayList<Item>();
	
	public final int ITEM_ID_HEALTH_POTION = 1;
	public final int ITEM_ID_MANA_POTION = 2;
	
	
	
	public World()
	{
		
		theWorld = this;
		populateItems();

	}
	
	public static World getWorld()
	{
		return theWorld;
	}
	
	public void populateItems()
	{
		Item healthPotion = new Item(ITEM_ID_HEALTH_POTION, "Health Potion", "Cures 10 points of health.", 10, true, 10, 0);
		Item manaPotion = new Item(ITEM_ID_MANA_POTION, "Mana Potion", "Cures 10 points of mana", 10, true, 0, 10);
		
		items.add(healthPotion);
		items.add(manaPotion);
	}
	
	public Item getItem(int itemID)
	{
		for (Item item : items)
		{
			if (item.getID() == itemID)
			{
				return item;
			}
			
		}
		return null;
	}
}

package game.model;

public class Item extends PhysicalObjects
{
	private int healthChange;
	private int manaChange;
	
	
	public Item(int ID, String name, String description, int value, boolean stackable, int healthChange, int manaChange)
	{
		super(ID, name, description, value, stackable);
		
		this.healthChange = healthChange;
		this.manaChange = manaChange;
	}
	
	public int getHealthChange()
	{
		return healthChange;
	}


	public int getManaChange()
	{
		return manaChange;
	}
}

package game.model;

public class Armor extends PhysicalObjects
{
	private int phyDefChange; 
	private int magDefChange;
	
	public Armor(int ID, String name, String description, int value, boolean stackable, int strengthChange, int intelligenceChange,
			int vitalityChange, int wisdomChange, int dexterityChange, int phyDefChange, int magDefChange)
	{
		super(ID, name, description, value, stackable, strengthChange, intelligenceChange, vitalityChange, wisdomChange, dexterityChange);
		
		this.phyDefChange = phyDefChange;
		this.magDefChange = magDefChange;
	}
	
	public int getPhyDefChange()
	{
		return phyDefChange;
	}

	public int getMagDefChange()
	{
		return magDefChange;
	}
	
}

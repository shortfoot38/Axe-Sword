package game.model;

public class PhysicalObjects
{
	private int ID;
	private String name;
	private String description;
	private int value;
	private boolean stackable;
	private int strengthChange; 
	private int intelligenceChange; 
	private int vitalityChange; 
	private int wisdomChange;
	private int dexterityChange;
	
	public PhysicalObjects(int ID, String name, String description, int value, boolean stackable)
	{
		this.ID = ID;
		this.name = name;
		this.description = description;
		this.value = value;
		this.stackable = stackable;
		
	}
	public PhysicalObjects(int ID, String name, String description, int value, boolean stackable, int strengthChange, int intelligenceChange,
							int vitalityChange, int wisdomChange, int dexterityChange)
	{
		this.ID = ID;
		this.name = name;
		this.description = description;
		this.value = value;
		this.stackable = stackable;
		this.strengthChange = strengthChange;
		this.intelligenceChange = intelligenceChange;
		this.vitalityChange = vitalityChange;
		this.wisdomChange = wisdomChange;
		this.dexterityChange = dexterityChange;
		
	}
	
	public int getID()
	{
		return ID;
	}
	
	public int getValue()
	{
		return value;
	}

	public void setValue(int value)
	{
		this.value = value;
	}

	public String getName()
	{
		return name;
	}

	public String getDescription()
	{
		return description;
	}

	public boolean isStackable()
	{
		return stackable;
	}
	
	public int getStrengthChange()
	{
		return strengthChange;
	}
	
	public int getIntelligenceChange()
	{
		return intelligenceChange;
	}
	
	public int getVitalityChange()
	{
		return vitalityChange;
	}
	
	public int getWisdomChange()
	{
		return wisdomChange;
	}
	
	public int getDexterityChange()
	{
		return dexterityChange;
	}

}

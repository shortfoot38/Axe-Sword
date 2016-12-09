package game.model;

public class Weapon extends PhysicalObjects
{
	public Weapon(int ID, String name, String description, int value, boolean stackable, int strengthChange, int intelligenceChange,
			int vitalityChange, int wisdomChange, int dexterityChange)
	{
		super(ID, name, description, value, stackable, strengthChange, intelligenceChange, vitalityChange, wisdomChange, dexterityChange);
	}
}

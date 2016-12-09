package game.model;

public class Character extends LivingCreatures
{	
	private int gold;
	private int exp;
	
	public Character(String name, int level, int strength, int intelligence, int vitality, int wisdom, int dexterity, 
			int phyDef, int magDef, int gold, int exp)
	{
		super(name, level, strength, intelligence, vitality, wisdom, dexterity, 
				phyDef, magDef);
		
		this.gold = gold;
		this.exp = exp;
	}
	
	
}

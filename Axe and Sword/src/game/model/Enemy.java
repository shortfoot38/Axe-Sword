package game.model;

public class Enemy extends LivingCreatures
{
	private String description;
	
	public Enemy(String name, int level, int strength, int intelligence, int vitality, int wisdom, int dexterity, 
			int phyDef, int magDef, String description)
	{
		super(name, level, strength, intelligence, vitality, wisdom, dexterity, 
				phyDef, magDef);
		
		this.description = description;
	}
}

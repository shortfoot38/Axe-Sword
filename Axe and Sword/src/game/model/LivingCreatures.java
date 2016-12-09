package game.model;

public class LivingCreatures
{
	int level;
	

	int health;
	int mana;
	int strength;
	int intelligence;
	int vitality;
	int wisdom;
	int dexterity;
	int phyDef;
	int magDef;
	
	String name;
	
	
	public LivingCreatures(String name, int level,int strength, int intelligence, int vitality, int wisdom, int dexterity, 
							int phyDef, int magDef)
	{
		this.name = name;
		this.level = level;
		this.strength = strength;
		this.intelligence = intelligence;
		this.vitality = vitality;
		this.wisdom = wisdom;
		this.dexterity = dexterity;
		this.phyDef = phyDef;
		this.magDef = magDef;
		
		
	}
	
	public int getLevel()
	{
		return level;
	}

	public void setLevel(int level)
	{
		this.level = level;
	}

	public int getHealth()
	{
		return health;
	}

	public void setHealth(int health)
	{
		this.health = health;
	}
	
	public void setHealth()
	{
		//Do formulas...
	}

	public int getMana()
	{
		return mana;
	}

	public void setMana(int mana)
	{
		this.mana = mana;
	}

	public int getStrength()
	{
		return strength;
	}

	public void setStrength(int strength)
	{
		this.strength = strength;
	}

	public int getIntelligence()
	{
		return intelligence;
	}

	public void setIntelligence(int intelligence)
	{
		this.intelligence = intelligence;
	}

	public int getVitality()
	{
		return vitality;
	}

	public void setVitality(int vitality)
	{
		this.vitality = vitality;
	}

	public int getWisdom()
	{
		return wisdom;
	}

	public void setWisdom(int wisdom)
	{
		this.wisdom = wisdom;
	}

	public int getDexterity()
	{
		return dexterity;
	}

	public void setDexterity(int dexterity)
	{
		this.dexterity = dexterity;
	}

	public int getPhyDef()
	{
		return phyDef;
	}

	public void setPhyDef(int phyDef)
	{
		this.phyDef = phyDef;
	}

	public int getMagDef()
	{
		return magDef;
	}

	public void setMagDef(int magDef)
	{
		this.magDef = magDef;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}
	
	
}

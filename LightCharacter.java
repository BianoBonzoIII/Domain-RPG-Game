
public class LightCharacter extends Character{
	public double lightHealth = 43.0;
	public double lightAttack = 2.5;
	public double lightDefense = 3.0;
	public double lightSpeed = 6.0;
	public String lightAllOut = "Holy Purge"; 	
	public double lightLevel = 1;
	public boolean isAlive() {
		return false;
	}
	
	public LightCharacter() 
	{
		
	}
	public LightCharacter(double attack, double defense, double health, double speed, int level){
        this();
        this.attack = 2.5;
        this.defense = 3.0;
        this.health = 43.0;
        this.speed = 6.0;
        this.level = 1;
	}
}

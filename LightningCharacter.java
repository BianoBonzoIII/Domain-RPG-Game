
public class LightningCharacter extends Character{
//	public double lightningHealth = 42;
//	public double lightningAttack = 3.5;
//	public double lightningDefense = 2.5;
//	public double lightningSpeed = 5.0;
//	public String lightningAllOut = "Denjin Blast";
//	public double shock = 0.8;
//	public double lightningLevel = 1;
	public boolean isAlive() {
		return true;
	}
	public LightningCharacter() {
	}
	public LightningCharacter(double attack, double defense, double health, double speed, int level){
        super();
        this.attack = 3.5;
        this.defense = 2.5;
        this.health = 42.0;
        this.speed = 5.0;
        this.level = 1;
	}	
}
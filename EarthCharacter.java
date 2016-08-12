
public class EarthCharacter extends Character {
	//	public double earthHealth = 55.0;
	//	public double earthAttack = 3.0;
	//	public double earthDefense = 3.5;
	//	public double earthSpeed = 2.0;
	//	public String earthAllOut = "Atlas Crush"; 
	//	public double StatDecrease = 0.5;
	//	public double earthLevel = 1;


	public boolean isAlive() {
		return true;
	}

	public EarthCharacter() {
	}
	public EarthCharacter(double attack, double defense, double health, double speed, int level){
		this();
		this.attack = 3.0;
		this.defense = 3.5;
		this.health = 55.0;
		this.speed = 2.0;
		this.level = 1;
	}
}

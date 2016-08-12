
public class WaterCharacter extends Character {
//	public double waterHealth = 38.0;
//	public double waterAttack = 2.5;
//	public double waterDefense = 3.5;
//	public double waterSpeed = 4.0;
//	public String waterAllOut = "Tsunami Trench"; 
//	public double wetSlow = 0.8;
//	public double waterLevel = 1;
	public boolean isAlive() {
		return false;
	}
	
	public WaterCharacter() {
	}
	public WaterCharacter(double attack, double defense, double health, double speed, int level){
        this();
        this.attack = 2.5;
        this.defense = 3.5;
        this.health = 38.0;
        this.speed = 4.0;
        this.level = 1;
         
	}
  }


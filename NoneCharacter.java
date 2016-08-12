
public class NoneCharacter extends Character {
//	public double noneHealth = 50.0;
//	public double noneAttack = 3.0;
//	public double noneDefense = 3.0;
//	public double noneSpeed = 3.5;
//	public String noneAllOut = "Burst Limit"; 
//	public double noneLevel = 1;
	public boolean isAlive() {
		return false;
	}
	public NoneCharacter() {
	}
	public NoneCharacter( double attack, double defense, double health, double speed, int level){
        super();
        this.attack = 3.0;
        this.defense = 3.0;
        this.health = 50.0;
        this.speed = 3.5;
        this.level = 1;
	}
}

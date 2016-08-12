
public class DarkCharacter extends Character{
	public double darkHealth = 48.0;
	public double darkAttack = 3.5;
	public double darkDefense = 3.0;
	public double darkSpeed = 2.5;
	public String darkAllOut = "Black Onslaught";
	public double darkLevel = 1;
	public boolean isAlive() {
		return false;
	}
	
	public DarkCharacter(){
	}
	public DarkCharacter(double attack, double defense, double health, double speed, int level){
        this();
        this.attack = 3.5;
        this.defense = 3.0;
        this.health = 48.0;
        this.speed = 2.5; 
        this.level = 1;
	}
}

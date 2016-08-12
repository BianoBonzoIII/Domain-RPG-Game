
public class LavaFrog extends Character {
	public double frogHealth = 7.0;
	public double frogAttack = 3.5;
	public double frogDefense = 0.5;
	public double frogSpeed = 2.0;
	public boolean isAlive() {
		return true;
	}
	public LavaFrog() {
	}
	public LavaFrog(double attack, double defense, double health, double speed, int level){
        this();
        this.attack = 0.5;
        this.defense = 0.5;
        this.health = 7.0;
        this.speed = 2.0;
        this.level = 1;
	}
}
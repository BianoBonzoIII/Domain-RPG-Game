
public class FireCharacter extends Character{
//	public double fireHealth = 45.0;
//	public double fireAttack = 3.0;
//	public double fireDefense = 2.5;
//	public double fireSpeed = 3.0;
//	public String fireAllOut = "Inferno Overdrive";  
//	public double burnDamage = 1.5;
//	public int fireLevel = 1;
	public boolean isAlive() {
		return true;
}

	
	public FireCharacter(){
	}
	public FireCharacter(double attack, double defense, double health, double speed, int level){
        super();
        this.attack = 3.0;
        this.defense = 2.5;
        this.health = 45.0;
        this.speed = 3.0;
        this.level = 1;
	}
}

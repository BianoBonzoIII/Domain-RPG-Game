
public class Character { 
    public String name;
    public double attack = 10.0;
    public double health = 20.0;
    public double defense = 5.0;
    public double speed = 5.0;
    public int level = 1;
    public boolean isAlive1() {
    	return false;
    }
    
	
    public Character(){
  // class constructor
    }
     
     
    public Character(double attack, double defense, double health, double speed, int level){
        this();
        this.attack = attack;
        this.defense = defense;
        this.health = health;
        this.speed = speed;
        this.level = level;
         
        }
     
    // The code to run when this character attacks
    public double attack(Character target){
     
        double damageDealt = this.attack;
        return target.takeDamage(damageDealt);
         
    }    // The code to run when this character takes some damage
    public double takeDamage(double damage){
         
        double damageTaken = damage - this.defense;
         
        this.health -= damageTaken;
         
        return (damageTaken);
    }
    public double getHealth(){
        return this.health;
    }
    public boolean isAlive(){
        return this.health > 0;
    }
     
}

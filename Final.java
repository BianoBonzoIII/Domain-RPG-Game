import java.util.Random;
import java.util.Scanner;

public class Final {
	
	public static Character player;
	public static Character frog;
	public static void main(String[] args) {
		// declares a character meant for polymorphism purposes
		double damage;
		
		
		frog = new LavaFrog(0.5,1.5,7.0,2.0,1);
		Scanner playerImport = new Scanner(System.in);
		
		System.out.println("Why Hello There! You must be new in town! My name is Farcius. What's yours?");
		String playerName = playerImport.nextLine();
		
		System.out.println("Fantastic! " + playerName + ". Tell me. What is your Domain?");
		
		System.out.println("\n1. Fire \n2. Water \n3. Lightning \n4. Earth \n5. Light \n6. Dark \n7. None");
		int playerChoice = playerImport.nextInt();
		switch (playerChoice) {
		
		case 1:
			player = new FireCharacter(3.0,2.5,45.0,3.0,1);
			System.out.println("\n Your Domain is Fire. \n You have the power to control fire at "
					+ "your will in exchange of you sweating really easily during combat. "
					+ "\n Your weaknesses are Water and Lightning obviously."
					+ "\n You do great against Earth. Your weapon is a katakana coated in flames. "
					+ "\n Your All-Out Attack is known as Inferno Overdrive.");
			
			System.out.println("\n Here are your stats: \n HP: 45.0 \n Attack: 3.0 \n Defense: 2.5 \n Speed: 3.0 ");
			break;
			
		case 2:
			player = new WaterCharacter(2.5,3.5,38.0,4.0,1);
			System.out.println("\n Your Domain is Water. \n You have the power to control water at "
					+ "your will in exchange of you constantly getting wet and having to go "
					+ "to the bathroom a lot. \n Your weaknesses are Lightning and Earth. "
					+ "Because photosynthesis. \n You do great against Fire. Your weapon "
					+ "is a staff that can also be a water gun if you squeeze the tip of it hard"
					+ "\n Your All-Out Attack is known as Tsunami Trench.");
			System.out.println("\n Here are your stats: \n HP: 38.0 \n Attack: 2.5 \n Defense: 3.5 \n Speed: 4.0 ");
			break;
			
		case 3:
			player = new LightningCharacter(3.5,2.5,42.0,5.0,1);
			System.out.println("Your Domain is Lightning. \n You have the power to control lightning "
					+ "at your will in exchange of you being shocked by things really easily. "
					+ "\n Your weaknesses are Dark and Earth. Earth can't conduct electricity. "
					+ "\n You do great against Fire and Water. \n Your weapon is a mace coated with spikes "
					+ "sharper than the spikes on Bowser's back. "
					+ "\n Your All-Out Attack is known as Denjin Blast.");
			System.out.println("\n Here are your stats: \n HP: 42.0 \n Attack: 3.5 \n Defense: 2.5 \n Speed: 5.0 ");
			break;
		case 4:
			player = new EarthCharacter(3.0,3.5,55.0,2.0,1);
			System.out.println("\n Your Domain is Earth. \n You have the power to control nature and "
					+ "parts of the Earth at your will in exchange of you being a jerk about "
					+ "global warming. \n Your weaknesses are Fire. Fire burns your plants makes you angry. "
					+ "\n You do great against Lightning and Light. "
					+ "\n Your weapon is a really, really thick tree branch that can be used as a spanking stick. "
					+ "back. \n Your All-Out Attack is known as Atlas Crush?");
			System.out.println("\n Here are your stats: \n HP: 55.0 \n Attack: 3.0 \n Defense: 3.5 \n Speed: 2.0 ");
			break;

		case 5:
			player = new LightCharacter(2.5,3.0,43.0,6.0,1);
			System.out.println("/n Your Domain is Light. You have the power to control light "
					+ "at your will in exchange of you being kind of blind and getting an ugly "
					+ "looking tan. \n You are faster than all other Domains "
					+ "\n Your weaknesses are Dark and Earth. You have Nyctophobia. "
					+ "\n You do great against Dark at the same time though. \n Your weapon "
					+ "is a lance that can give you radiation poisoning if you are not careful enough. "
					+ "\n Your All-Out Attack is known as Holy Purge");
			System.out.println("\n Here are your stats: \n HP: 43.0 \n Attack: 2.5 \n Defense: 3.0 \n Speed: 6.0 ");
			break;
		
		case 6:
			player = new DarkCharacter(3.5,3.0,48.0,2.5,1);
			System.out.println("\n Your Domain is Dark. \n You have the power to control darkness "
					+ "at your will in exchange of you being emo." 
					+ "/n Your weakness is Light. You have Heliophobia. "
					+ "/n You do great against Light at the same time though. \n Your weapon "
					+ "is a spear with purple and black ribbons taped all over it saying Twilight. "						
					+ "Your All-Out Attack is known as Black Onslaught");
			System.out.println("\n Here are your stats: \n HP: 48.0 \n Attack: 3.5 \n Defense: 3.0 \n Speed: 2.5 ");
			break;
		
		case 7:
			player = new NoneCharacter(3.0,3.0,50.0,3.5,1);
			System.out.println("/n Your Domain is None. You have the power to control... Wait "
					+ "nevermind. /n You control nothing in exchange for nothing. You know how to use Java though." 
					+ "/n Your weakness is when you see code with really bad spacing."						
					+ "/n You do great against no domain except ID Tech. /n Your weapon is a phone and your own fists "
					+ ". /n Your All-Out Attack is known as Burst Limit.");
			System.out.println("\n Here are your stats: \n HP: 50.0 \n Attack: 3.0 \n Defense: 3.0 \n Speed: 3.5 ");
			break;
		
		default:
			Random randomGenerator = new Random();
			int randomChoice = randomGenerator.nextInt(8);
			System.out.println("Uhh...I didn't quite hear what you said. I'm going to assume you said " + randomChoice + ".");
			break;
		}

			System.out.println("\n Spectacular! Now allow me to explain. "
							   + "\n You have a total of 3 moves you can perform: " + "\n" 
							   + "\n Normal Attack          All-Out Attack"
							   + "\n" + "\n The Normal Attack is if "
							   + "you want to attack your enemy with your weapon."
							   + "\n This can trigger your Ability if you are lucky" 
							   + "\n The All-Out Attack is an attack you can only use once during combat."
							   + "\n However, it is the strongest attack that you can do. Use it wisely. Understand?");
			String playerComment8 = playerImport.nextLine();
			System.out.println("\n Great! Now if you want to be known around town, I suggest you "
								+ "go to the Cave of Resistance behind me." + "\n You may be able"
								+ " to find the Chest of 100 Wonders in there." + "\n Welp, I have "
								+ "business to attend to. Don't die in there!");
			System.out.println("You are at the entrance of the Cave of Resistance " + playerName 
							   + ". Which direction would you like to go. \n1. West \n2. East"
							   + "\n3. I don't wanna go");
			
			
			int playerDirection = playerImport.nextInt();
			
			if (playerDirection == 1){
				while(player.isAlive() && frog.isAlive()) {
					int turns = 1;
					if (playerChoice == 1){
						System.out.println("A Lava Frog has appeared in your way. The intense heat intensifies.");
						System.out.println("Turn " + turns + "\n" + playerName + ": " + player.health + " HP | " );
					}
					else if (playerChoice == 2) {
						System.out.println("A Lava Frog has appeared in your way. The intense heat intensifies but water cools you down.");
						System.out.println("Turn " + turns + "\n " + playerName + ": " + player.health + " HP | ");
					}
					else if (playerChoice == 3){
						System.out.println("A Lava Frog has appeared in your way. The intense heat intensifies.");
						System.out.println("Turn " + turns + "\n " + playerName + ": " + player.health + " HP | ");
					}
					else if (playerChoice == 4) {
						System.out.println("A Lava Frog has appeared in your way. The intense heat intensifies. You grow weary of your plants.");
						System.out.println("Turn " + turns + "\n " + playerName + ": " + player.health + " HP | ");
					}
					else if (playerChoice == 5) {
						System.out.println("A Lava Frog has appeared in your way. The intense heat intensifies.");
						System.out.println("Turn " + turns + "\n " + playerName + ": " + player.health + " HP | ");
					}
					else if (playerChoice == 6) {
						System.out.println("A Lava Frog has appeared in your way. The intense heat intensifies.");
						System.out.println("Turn " + turns + "\n " + playerName + ": " + player.health + " HP | ");
					}
					else if (playerChoice == 7) {
						System.out.println("A Lava Frog has appeared in your way. The intense heat intensifies. Your neck is dripping with sweat.");
						System.out.println("Turn " + turns + "\n " + playerName + ": " + player.health + " HP | ");
					}
					while(player.health > 0 && frog.health > 0){
						damage = dealDamage(player.attack, frog.defense);
							for (int turn = 1; turn < 3; turn++);
							System.out.println("Your HP: " + player.health + " Enemy HP: " + frog.health);
							for (frog.health = 7.0; frog.health >= 0; frog.health -= (player.attack - frog.defense));
							double dealDamage = player.attack - frog.defense;

							System.out.println(playerName + " hits Lava Frog" + " for " + dealDamage + " damage.");
							
							damage = frog.attack - player.defense;
							for (player.health = player.health; player.health >= 0; player.health -= (frog.attack - player.defense));
							System.out.println("Lava Frog lunges his flaming tongue and hits " + playerName + " for " + damage + " damage.");
							
						}
					}
						 if(frog.health <= 0.0 && player.health > 0.0){
		            		player.level++;
							player.attack += 2.0;
							player.defense += 1.5;
							player.speed += 2.0;
			            System.out.println(playerName + " became victorious! You level up! All of your stats have increased!");
			            
		            	}
		            	else if (player.health <= 0){
			            System.out.println(playerName + " is dead! The Lava Frog is now going out for ramen instead of eating you.");
			       
						}
						else{
			            System.out.println("It's a draw! " + playerName + "and the Lava Frog quits there adventures and goes out for ramen. THE END.");
						}
			}
				else if (playerDirection == 2){
				int playerLevel = 99;
				System.out.println("You found a shiny golden treasure chest with gold inside. Everyone in town loves you now."
								    + "Because of this, your level in now " + playerLevel + ". THE END");
				}
				else if (playerDirection == 3){
				System.out.println("You were too much of a chicken to take on the Cave. Congratulations " + playerName + "."
								   + " Farcius is very sad :,,,( GAME OVER!");
				}
	}
	
	public static double dealDamage(double playerattack, double frogdefense) {
		double damage = frog.attack;
		double damageTaken = damage - player.defense;
		player.health -= damageTaken;
		return (damageTaken);
	}
	public double strength (Character target){
		double damageDealt = player.attack - frog.defense;
		return target.takeDamage(damageDealt);
	}
	
}
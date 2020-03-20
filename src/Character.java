import java.util.*
public class Character {
    public int Health(int previousHealth, String name){
        int health = previousHealth;
        Random random = new Random();
        int hit = random.nextInt(50);
        int currentHealth = health - hit;

        if (currentHealth <= 0 && name.equalsIgnoreCase("h")){
            System.out.println("You lose the Game");
        }
        if (currentHealth <= 0 && name.equalsIgnoreCase("g")){
            System.out.println("The Goblin has been defeated");
        }

        return currentHealth;


    }
}

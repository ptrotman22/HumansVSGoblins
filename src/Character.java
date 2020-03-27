import java.util.*;
public class Character {
    public int Health(int previousHealth, String name){
        int health = previousHealth;
        Random random = new Random();
        int hit = random.nextInt(50);
        int currentHealth = (int) (health - (hit*(1+Math.random())));

        System.out.println("");

        if (!name.equalsIgnoreCase("Goblin")) {
            System.out.println("You were attacked by the Goblin");
            System.out.println("You lost "+ (currentHealth - health)+ " health");
            System.out.println("You have "+ currentHealth + " health");
        }
        else{
            System.out.println("The Goblin was attacked by the you");
            System.out.println("The Goblin lost "+ (currentHealth - health)+ " health");
            System.out.println("The Goblin has "+ currentHealth + " health");
        }

        if (currentHealth <= 0 && name.equalsIgnoreCase("Human")) {
                System.out.println("You lose the Game");
                return currentHealth;
        }
        if (currentHealth <= 0 && name.equalsIgnoreCase("Goblin")) {
                System.out.println("The Goblin has been defeated");
                return currentHealth;
        }


        return currentHealth;


    }
}

import java.util.*
public class Character {
    public int Health(int previousHealth){
        int health = previousHealth;
        Random random = new Random();
        int hit = random.nextInt(50);
        int currentHealth = health - hit;

        if (currentHealth <= 0){
            
        }

        return currentHealth;


    }
}

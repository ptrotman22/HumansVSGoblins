import java.util.*;
public class HumanVGoblinsDriver {
    public static void main(String[] args) {
        Human human = new Human();
        Land grid = new Land();
        Goblin goblin = new Goblin();

        // Opening of the game
        int end = 0;// end game 1 = end, 0 = continue.
        int health = 250;
        int gHealth = 250;
        do {

            int[] currentLocation = {1, 1, 5, 5};
            String name = "h";
            System.out.println("Please move: 1 for North, 2 for South, 3 for West, 4 for East");
            int input = new Scanner(System.in).nextInt(); // clear buffer for scanner.
            int move = human.Move(input);
            currentLocation = Land.Grid(move, currentLocation, name);

            int battle = 0;
            // Repeating Game
            while (battle == 0) {
                System.out.println("Please move: 1 for North, 2 for South, 3 for West, 4 for East");
                input = new Scanner(System.in).nextInt(); // clear buffer for scanner.
                move = human.Move(input);
                currentLocation = Land.Grid(move, currentLocation, name);
                // Battle condition
                if (currentLocation[0]==currentLocation[2] && currentLocation[1]==currentLocation[3]){
                    while(battle == 0) {
                        health = human.Health(health, "Human");
                        if (health <= 0 || gHealth <= 0){
                            battle = 1;
                            end = 1;
                            System.out.println();
                            break;
                        }
                        gHealth = goblin.Health(gHealth, "Goblin");
                        if (health <= 0 || gHealth <= 0){
                            battle = 1;
                            end = 1;
                            System.out.println();
                            break;
                        }
                    }

                }
            }


        }while (end != 1);

        System.out.println("Thank you for playing");


    }
}

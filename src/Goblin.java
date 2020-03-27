import java.util.Random;
import java.util.Scanner;

public class Goblin extends Character{
    public int move;

    //Constructors
    // Setters & Getters
    public void setMove(int move){
        this.move = move;
    }
    public int getMove(){
        return move;
    }
    //
    public int Move(int move){
        this.move = move;
        Random random = new Random();
        move = random.nextInt(4)+1;

        return move;
    }
}

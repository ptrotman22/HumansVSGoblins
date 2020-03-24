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
        Scanner scanner = new Scanner(System.in);
        while (move < 1 || move > 4){
            System.out.println("Sorry, You must choose between 1 and 4. Please try again");
            int input = scanner.nextInt();
            move = input;
        }

        return move;
    }
}

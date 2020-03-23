public class HumanVGoblinsDriver {
    public static void main(String[] args) {
        Human human = new Human();
        Land grid = new Land();
        int[] currentLocation = {1, 1};
        String name = "h";


        int move = human.Move(4);
        currentLocation = Land.Grid(move, currentLocation, name);

    }
}

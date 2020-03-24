public class HumanVGoblinsDriver {
    public static void main(String[] args) {
        Human human = new Human();
        Land grid = new Land();
        int[] currentLocation = {0, 0};
        String name = "h";


        int move = human.Move(3);
        currentLocation = Land.Grid(move, currentLocation, name);

    }
}

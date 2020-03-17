/*
* Grid - 4 by 6 grid
* Random Treasure
* */

import java.util.*;
import java.util.ArrayList;

public class Land {
    int move = 0;


    public int Grid(int move, int x, int y){
        //Move direction
        this.move = move;
        Scanner input = new Scanner(System.in);
        //ArrayList<Integer> grid = new ArrayList<>();
        String [][] grid = new String[6][6];

        // For loops governing movement
        // Create border
        for (int i = 0; i < grid.length; i++){
            grid[i][i] = "| |"
            grid[0][i] = "---";
            grid[i][6] = "!";
            grid[i][0] = "!";
            grid[6][i] = "---";
        }

        


        return move;
    }
}

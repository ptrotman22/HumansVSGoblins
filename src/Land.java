/*
* Grid - 4 by 6 grid
* Random Treasure
* */

import java.util.*;

public class Land {
    int move = 0;


    public int[] Grid(int move, int[] currentLocation, String name){
        //Move direction
        // Direction
        this.move = move;
        Scanner input = new Scanner(System.in);
        //ArrayList<Integer> grid = new ArrayList<>();
        String [][] grid = new String[6][6];
        int [] location = new int[currentLocation.length];

        // For loops governing movement
        // Create border
        for (int i = 0; i < grid.length; i++){
            grid[i][i] = "| |";
            grid[0][i] = "---";
            grid[i][6] = "!";
            grid[i][0] = "!";
            grid[6][i] = "---";
        }

        // Choose direction
        if (move == 1){
            if (grid.equals("---") || grid.equals("!")){

            }
            location[0]-= 1;

        }

        // fill the character spot
        grid[location[0]][location[1]] = name;

        // Print Map
        for (int i = 0; i < grid.length; i++){
            System.out.print(grid[0][i]);
            System.out.println();
        }
        for (int i = 0; i < grid.length; i++){
            System.out.print(grid[1][i]);
            System.out.println();
        }
        for (int i = 0; i < grid.length; i++){
            System.out.print(grid[2][i]);
            System.out.println();
        }
        for (int i = 0; i < grid.length; i++){
            System.out.print(grid[3][i]);
            System.out.println();
        }
        for (int i = 0; i < grid.length; i++){
            System.out.print(grid[4][i]);
            System.out.println();
        }
        for (int i = 0; i < grid.length; i++){
            System.out.print(grid[5][i]);
            System.out.println();
        }
        for (int i = 0; i < grid.length; i++){
            System.out.print(grid[6][i]);
            System.out.println();
        }



        return location;
    }

}

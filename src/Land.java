/*
* Grid - 4 by 6 grid
* Random Treasure
* */

import java.util.*;

public class Land {
    int move = 0;


    public static int[] Grid(int moveDirection, int[] currentLocation, String name) {
        //Move direction
        // Direction
        int move = moveDirection;
        Scanner input = new Scanner(System.in);
        //ArrayList<Integer> grid = new ArrayList<>();
        String[][] grid = new String[6][6];
        int[][] numGrid = new int[6][6];
        int[] location = currentLocation.clone();


        // For loops governing movement
        // Fill Grid
        int count = 1;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++){
                grid[i][j] = "| |";
                numGrid[i][j] = count;
                count++;
            }
        }

        // Choose direction
        int step = 1;
        int end = 0;
        int mistake = 0;
        while (end == 0) {
            end = 0;
            mistake = 0;
            // North movement
            if (move == 1) {
                location[0] -= step;
                if (location[0] < 0 || location[0] > (grid.length-1)) {
                    location[0] += step;
                    mistake++;
                    while (mistake >= 1) {
                        System.out.println("Sorry you are out bounds! Please choose a different location");
                        int tryAgain = new Scanner(System.in).nextInt();
                        move = tryAgain;
                        break;
                    }
                }
                else {
                    end = 1;
                }
            }
            //South Movement
            if (move == 2) {
                location[0] += step;
                if (location[0] < 0 || location[0] > (grid.length-1)) {
                    location[0] -= step;
                    mistake++;
                    while (mistake >= 1) {
                        System.out.println("Sorry you are out bounds! Please choose a different location");
                        int tryAgain = new Scanner(System.in).nextInt();
                        move = tryAgain;
                        break;
                    }
                }
                else {
                    end = 1;
                }
            }
            // West Movement
            if (move == 3) {
                location[1] -= step;
                if (location[1] < 0 || location[1] > (grid.length-1)) {
                    location[1] += step;
                    mistake++;
                    while (mistake >= 1) {
                        System.out.println("Sorry you are out bounds! Please choose a different location");
                        int tryAgain = new Scanner(System.in).nextInt();
                        move = tryAgain;
                        break;
                    }
                }
                else {
                    end = 1;
                }
            }
            // East Movement
            if (move == 4) {
                location[1] += step;
                if (location[1] < 0 || location[1] > (grid.length-1)) {
                    location[1] -= step;
                    mistake++;
                    while (mistake >= 1) {
                        System.out.println("Sorry you are out bounds! Please choose a different location");
                        int tryAgain = new Scanner(System.in).nextInt();
                        move = tryAgain;
                        break;
                    }
                }
                else {
                    end = 1;
                }
            }
        }

        // fill the character spot
        grid[location[0]][location[1]] = "|"+ name + "|";

        // Print Map
        for (int i = 0; i < grid.length; i++) {
            System.out.print(grid[0][i]);
        }
        System.out.println();

        for (int i = 0; i < grid.length; i++) {
            System.out.print(grid[1][i]);
        }
        System.out.println();

        for (int i = 0; i < grid.length; i++) {
            System.out.print(grid[2][i]);
        }
        System.out.println();

        for (int i = 0; i < grid.length; i++) {
            System.out.print(grid[3][i]);
        }
        System.out.println();

        for (int i = 0; i < grid.length; i++) {
            System.out.print(grid[4][i]);
        }
        System.out.println();

        for (int i = 0; i < grid.length; i++) {
            System.out.print(grid[5][i]);
        }
        System.out.println();


        return location;
    }

    public void GridCheck(){

    }
}



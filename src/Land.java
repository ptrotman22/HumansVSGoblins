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
        int[] location = new int[2];

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
        int end = 0;
        int mistake = 0;
        while (end == 0) {
            end = 0;
            mistake = 0;
            // North movement
            if (move == 1) {
                location[0] -= 1;
                if (location[0] < 0 || location[0] > 6) {
                    location[0] += 1;
                    mistake++;
                    while (mistake >= 1) {
                        System.out.println("Sorry you are out bounds! Please choose a different location");
                        int tryAgain = new Scanner(System.in).nextInt();
                        move = tryAgain;
                        end = 1;
                        break;
                    }
                }
            }
            //South Movement
            if (move == 2) {
                location[0] += 1;
                if (location[0] < 0 || location[0] > 6) {
                    location[0] -= 1;
                    mistake++;
                    while (mistake >= 1) {
                        System.out.println("Sorry you are out bounds! Please choose a different location");
                        int tryAgain = new Scanner(System.in).nextInt();
                        move = tryAgain;
                        end = 1;
                        break;
                    }
                }

            }
            // West Movement
            if (move == 3) {
                location[1] -= 1;
                if (location[1] < 0 || location[1] > 6) {
                    location[1] += 1;
                    mistake++;
                    while (mistake >= 1) {
                        System.out.println("Sorry you are out bounds! Please choose a different location");
                        int tryAgain = new Scanner(System.in).nextInt();
                        move = tryAgain;
                        end = 1;
                        break;
                    }
                }

            }
            // East Movement
            if (move == 4) {
                location[1] += 1;
                if (location[1] < 0 || location[1] > 6) {
                    location[1] -= 1;
                    mistake++;
                    while (mistake >= 1) {
                        System.out.println("Sorry you are out bounds! Please choose a different location");
                        int tryAgain = new Scanner(System.in).nextInt();
                        move = tryAgain;
                        end = 1;
                        break;
                    }
                }

            }
        }

        // fill the character spot
        grid[location[0]][location[1]] = name;

        // Print Map
        for (int i = 0; i < grid.length; i++) {
            System.out.print(grid[0][i]);
            System.out.println();
        }
        for (int i = 0; i < grid.length; i++) {
            System.out.print(grid[1][i]);
            System.out.println();
        }
        for (int i = 0; i < grid.length; i++) {
            System.out.print(grid[2][i]);
            System.out.println();
        }
        for (int i = 0; i < grid.length; i++) {
            System.out.print(grid[3][i]);
            System.out.println();
        }
        for (int i = 0; i < grid.length; i++) {
            System.out.print(grid[4][i]);
            System.out.println();
        }
        for (int i = 0; i < grid.length; i++) {
            System.out.print(grid[5][i]);
            System.out.println();
        }
        for (int i = 0; i < grid.length; i++) {
            System.out.print(grid[6][i]);
            System.out.println();
        }


        return location;
    }

    public int GridCheck(){

    }
}



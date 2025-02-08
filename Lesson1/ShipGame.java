import java.util.Random;
import java.util.Scanner;

public class ShipGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

      
        char[][] grid = new char[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                grid[i][j] = '-';
            }
        }

   
        int targetRow = random.nextInt(5);
        int targetCol = random.nextInt(5);

        System.out.println("All set. Get ready to rumble!");

       
        while (true) {
            int row, col;
            
            while (true) {
                System.out.print("Enter the row (1-5): ");
                String input = scanner.nextLine();
                try {
                    row = Integer.parseInt(input) - 1;
                    if (row >= 0 && row < 5) break;
                    else System.out.println("Invalid row. Please enter a number between 1 and 5.");
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a valid number.");
                }
            }

            
            while (true) {
                System.out.print("Enter the column (1-5): ");
                String input = scanner.nextLine();
                try {
                    col = Integer.parseInt(input) - 1;
                    if (col >= 0 && col < 5) break;
                    else System.out.println("Invalid column. Please enter a number between 1 and 5.");
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a valid number.");
                }
            }

         
            if (row == targetRow && col == targetCol) {
                grid[row][col] = 'x';
                displayGrid(grid);
                System.out.println("You have won!");
                break;
            } else {
                if (grid[row][col] != '*') {
                    grid[row][col] = '*';
                }
                System.out.println("Missed! Try again.");
                displayGrid(grid);
            }
        }

        scanner.close();
    }

    public static void displayGrid(char[][] grid) {
        System.out.println("  0 | 1 | 2 | 3 | 4 | 5 |");
        for (int i = 0; i < grid.length; i++) {
            System.out.print((i + 1) + " | ");
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print(grid[i][j] + " | ");
            }
            System.out.println();
        }
    }
}

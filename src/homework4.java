import java.util.Scanner;

public class homework4 {
    public static void main(String[] args) {

//  1. Even or Odd Checker
//  Write a Java program that takes an integer as input. If the number is even, print "Even". If it's odd, print "Odd".

        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter an integer
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Check if the number is even or odd
        if (number % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

//  2. Month Name Finder
//  Write a program that asks the user to enter a number between 1 and 12. Print the name of the corresponding month or "Invalid Month" if out of range.

        System.out.print("Enter a number (1-12): ");
        int monthNumber = scanner.nextInt();

        String monthName;
        switch (monthNumber) {
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "June";
                break;
            case 7:
                monthName = "July";
                break;
            case 8:
                monthName = "August";
                break;
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "October";
                break;
            case 11:
                monthName = "November";
                break;
            case 12:
                monthName = "December";
                break;
            default:
                monthName = "Invalid Month";
                break;
        }

        System.out.println(monthName);


//  3. Counting Negative Numbers
//  Given an array of integers, write a program to count and print the number of negative integers in the array.

        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        int negativeCount = 0;
        for (int num : numbers) {
            if (num < 0) {
                negativeCount++;
            }
        }

        System.out.println("Number of negative integers: " + negativeCount);

//  4. String Reverser
//  Ask the user to enter a string. Print the reversed version of this string.

        scanner.nextLine(); // Consume leftover newline
        System.out.print("Enter a string to reverse: ");
        String inputString = scanner.nextLine();

        String reversed = "";
        for (int i = inputString.length() - 1; i >= 0; i--) {
            reversed += inputString.charAt(i);
        }

        System.out.println("Reversed string: " + reversed);

//  5. Fibonacci Series Generator
//  Write a program that generates and prints the first n numbers of the Fibonacci series, where n is provided by the user.

        System.out.print("Enter how many Fibonacci numbers to generate: ");
        int n = scanner.nextInt();

        int first = 0, second = 1;
        System.out.print("Fibonacci Series: ");

        for (int i = 0; i < n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }

        System.out.println(); // Final newline

        System.out.println(); // Separator

//  6. While Loop
//  Write a program that asks the user to enter numbers. The program should continue prompting the user until they enter -1. After they enter -1, print the sum of all numbers entered (excluding -1).

        // === Exercise 6: While Loop Summation ===
        int sum = 0;
        int input;

        System.out.println("Enter numbers to sum (enter -1 to stop):");

        while (true) {
            input = scanner.nextInt();
            if (input == -1) {
                break;
            }
            sum += input;
        }

        System.out.println("Sum of numbers (excluding -1): " + sum);

//  7. Do-While Loop
//  Create a program where the user is prompted to guess a predefined number. After each guess, the program should inform the user if the guess is too high or too low. The program should keep prompting the user until they guess correctly. Using a do-while loop, ensure the user is always asked at least once.

        int secretNumber = 42; // You can change this to any number
        int guess;

        System.out.println("Guess the secret number!");

        do {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();

            if (guess < secretNumber) {
                System.out.println("Too low!");
            } else if (guess > secretNumber) {
                System.out.println("Too high!");
            } else {
                System.out.println("Correct! You guessed it.");
            }
        } while (guess != secretNumber);

        System.out.println(); // Separator

//8. For Loop
//Write a program that prints the first 10 numbers in the Fibonacci series. Use a for loop to accomplish this.

        System.out.println("First 10 Fibonacci numbers using for loop:");

        int a = 0, b = 1;
        for (int i = 0; i < 10; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }

        System.out.println(); // Final newline

//  9. For-Each Loop
//  Given an array of integers, write a program that prints each number in the array followed by "Even" if the number is even, or "Odd" if the number is odd. Utilize a for-each loop for this task.

        System.out.println("Print array elements with Even or Odd:");

        for (int num : numbers) {
            if (num % 2 == 0) {
                System.out.println(num + " Even");
            } else {
                System.out.println(num + " Odd");
            }
        }

        System.out.println(); // Separator

//  10. Jump Statements
//  Create a menu-driven program where the user is presented with options:
//  Print "Hello World"
//  Print the user's name.
//  Exit.
//  Based on the user's input, perform the necessary action. Once an action is completed, show the menu again, unless the user chooses the Exit option. Use jump statements to control the flow of the program.

        scanner.nextLine(); // Consume newline before reading strings
        String userName = "";

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Print \"Hello World\"");
            System.out.println("2. Print your name");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.println("Hello World");
                    break;
                case 2:
                    if (userName.isEmpty()) {
                        System.out.print("Enter your name: ");
                        userName = scanner.nextLine();
                    }
                    System.out.println("Your name is: " + userName);
                    break;
                case 3:
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
                    continue;  // Skip the rest and show menu again
            }

            if (choice == 3) {
                break; // Exit the while loop and end the program
            }

            System.out.println(); // For spacing before showing menu again
        }

//  11. Break Statement
//  Write a program that prompts the user to enter numbers. Calculate the average of these numbers. If the user enters 0, break out of the input loop and then print the average of the numbers entered so far.

        int sum2 = 0;
        int count = 0;
        System.out.println("Enter numbers to calculate average (enter 0 to stop):");

        while (true) {
            int input2 = scanner.nextInt();

            if (input2 == 0) {
                break;
            }

            sum2 += input2;
            count++;
        }

        if (count > 0) {
            double average = (double) sum2 / count;
            System.out.println("Average of numbers entered: " + average);
        } else {
            System.out.println("No numbers entered.");
        }

        System.out.println(); // Separator

//  12. Continue Statement
//  Create a program that asks the user for 10 numbers. Print the sum of all numbers that are greater than 5. If the user enters a number less than or equal to 5, use the continue statement to skip the addition for that number.

        int sumGreaterThanFive = 0;
        System.out.println("Enter 10 numbers:");

        for (int i = 0; i < 10; i++) {
            int num = scanner.nextInt();

            if (num <= 5) {
                continue;  // Skip numbers less than or equal to 5
            }

            sumGreaterThanFive += num;
        }

        System.out.println("Sum of numbers greater than 5: " + sumGreaterThanFive);

//        scanner.close();

        System.out.println();

//  13. Pathfinding in a Maze
//  Consider a simple maze represented by a 2D grid. The maze consists of open cells, walls, a start, and an end. You have to find a path from the start to the end, moving only up, down, left, or right. You can't move diagonally. If a path exists, print it; otherwise, inform the user that there's no solution.
//
//  The maze will be represented by a 2D array where:
//  0 represents an open cell.
//  1 represents a wall.
//  S represents the start.
//  E represents the end.
//
//  Example:
//  S 1 0 1
//  0 1 0 1
//  0 1 0 1
//  1 0 0 E
//
//  Problem Tasks:
//  Read the maze layout from a file or hard-code it into your program.
//  Implement a pathfinding algorithm to navigate from the start to the end.
//  If a path is found, print the maze with the path. You can represent the path with a *.
//  If no path exists, print "No solution found."
//  Hints:
//  Consider using a Depth-First Search (DFS) or Breadth-First Search (BFS) algorithm for pathfinding.
//  You might want to represent the maze using a class with methods to detect neighbors, check for walls, etc.

    // Plan:
    // Represent the maze as a char[][] with S, E, 0, and 1.
    // Find start S.
    // Use DFS to search for a path to E.
    // Mark the path found with *.
    // Print the maze with the path or print "No solution found."

                char[][] maze = {
                        { 'S', '1', '0', '1' },
                        { '0', '1', '0', '1' },
                        { '0', '1', '0', '1' },
                        { '1', '0', '0', 'E' }
                };

                int startRow = -1, startCol = -1;

                // Find the start position 'S'
                outerLoop:
                for (int i = 0; i < maze.length; i++) {
                    for (int j = 0; j < maze[i].length; j++) {
                        if (maze[i][j] == 'S') {
                            startRow = i;
                            startCol = j;
                            break outerLoop;
                        }
                    }
                }

                if (startRow == -1 || startCol == -1) {
                    System.out.println("Start position not found.");
                    return;
                }

                boolean pathFound = findPath(maze, startRow, startCol);

                if (pathFound) {
                    System.out.println("Path found:");
                } else {
                    System.out.println("No solution found.");
                }

                printMaze(maze);
            }

            // DFS recursive method to find path
            public static boolean findPath(char[][] maze, int row, int col) {
                // Check boundaries
                if (row < 0 || row >= maze.length || col < 0 || col >= maze[0].length) {
                    return false;
                }

                // If it's the end, we're done
                if (maze[row][col] == 'E') {
                    return true;
                }

                // If it's not an open cell or the start, return false
                if (maze[row][col] != '0' && maze[row][col] != 'S') {
                    return false;
                }

                // Mark the cell as part of the path (avoid overwriting 'S')
                char original = maze[row][col];
                if (original != 'S') {
                    maze[row][col] = '*';
                }

                // Explore neighbors: down, right, up, left
                if (findPath(maze, row + 1, col) ||
                        findPath(maze, row, col + 1) ||
                        findPath(maze, row - 1, col) ||
                        findPath(maze, row, col - 1)) {
                    return true;
                }

                // Backtrack (unmark), but don't erase 'S'
                if (original != 'S') {
                    maze[row][col] = '0';
                }

                return false;
            }

            // Utility method to print the maze
            public static void printMaze(char[][] maze) {
                for (char[] row : maze) {
                    for (char cell : row) {
                        System.out.print(cell + " ");
                    }
                    System.out.println();
                }
            }
        }

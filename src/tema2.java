import java.util.Scanner;

public class tema2 {
    public static void main(String[] args) {

// 1. Create a program to illustrate the importance of using the equals method for string comparison instead of using the == operator. Show cases where == gives incorrect results due to String interning.
        // Case 1: String literals (interned by default)
        String str1 = "hello";
        String str2 = "hello";

        System.out.println("Case 1:");
        System.out.println("str1 == str2: " + (str1 == str2));       // true
        System.out.println("str1.equals(str2): " + str1.equals(str2)); // true

        // Case 2: String objects created with `new` keyword
        String str3 = new String("hello");
        String str4 = new String("hello");

        System.out.println("\nCase 2:");
        System.out.println("str3 == str4: " + (str3 == str4));       // false ❌
        System.out.println("str3.equals(str4): " + str3.equals(str4)); // true ✅

        // Case 3: Mixed case (literal vs. new String)
        String str5 = "hello";
        String str6 = new String("hello");

        System.out.println("\nCase 3:");
        System.out.println("str5 == str6: " + (str5 == str6));       // false ❌
        System.out.println("str5.equals(str6): " + str5.equals(str6)); // true ✅

        // Optional: Interning manually
        String str7 = new String("hello").intern();

        System.out.println("\nCase 4:");
        System.out.println("str1 == str7: " + (str1 == str7));       // true ✅ after interning

        // Case 1: Both str1 and str2 refer to the same interned literal in the string pool.
        // Case 2: new String("hello") creates new objects in memory, so == fails even if contents match.
        // Case 3: Again, different memory locations.
        // Case 4: Using .intern() forces str7 to refer to the pooled "hello" string.

// 2. Develop a program that uses equality operators inside conditional statements (like if-else) to branch the code based on the equality of variables. Use both primitive data types and objects in your examples.

        // Example 1: Primitive data types
        int x = 5;
        int y = 5;

        if (x == y) {
            System.out.println("x and y are equal (primitive comparison)");
        } else {
            System.out.println("x and y are not equal (primitive comparison)");
        }

        // Example 2: Strings (objects in Java)
        String str8 = "Hello";
        String str9 = "Hello";
        String str10 = new String("Hello");

        // == checks reference equality
        if (str8 == str9) {
            System.out.println("str8 and str9 are the same object (==)");
        } else {
            System.out.println("str8 and str9 are different objects (==)");
        }

        if (str1 == str10) {
            System.out.println("str8 and str10 are the same object (==)");
        } else {
            System.out.println("str8 and str10 are different objects (==)");
        }

        // .equals() checks content equality
        if (str1.equals(str10)) {
            System.out.println("str8 and str10 have the same content (.equals)");
        } else {
            System.out.println("str8 and str10 do not have the same content (.equals)");
        }

// 3. Create a program that demonstrates how to use equality operators in complex expressions, involving logical operators (&&, ||). Illustrate how to construct complex conditions using equality operators and logical operators.

        int age = 20;
        String city = "New York";
        String requiredCity = "New York";

    // Condition: age must be 18 or older AND city must be New York
        if (age >= 18 && city.equals(requiredCity)) {
        System.out.println("You are eligible and live in the required city.");
        }

    // Condition: age is under 18 OR city is NOT New York
        if (age < 18 || !city.equals(requiredCity)) {
        System.out.println("You are either too young OR not in the required city.");
        }

    // Condition: age is exactly 20 OR city is New York
        if (age == 20 || city.equals("New York")) {
        System.out.println("You are 20 years old OR in New York.");
        }

// 4. Create a simple program that takes a number as input and uses if-else statements to categorize the number as "positive," "negative," or "zero."

            Scanner scanner = new Scanner(System.in);

            // Ask the user to enter a number
            System.out.print("Enter a number: ");
            double number = scanner.nextDouble();

            // Use if-else to categorize the number
            if (number > 0) {
                System.out.println("The number is positive.");
            } else if (number < 0) {
                System.out.println("The number is negative.");
            } else {
                System.out.println("The number is zero.");
            }

//                scanner.close();

//// 5. Create a program that reads a character from the user and uses nested if statements to determine if the character is a lowercase letter, an uppercase letter, a digit, or a special character.

//            Scanner scanner = new Scanner(System.in);

            // Prompt the user to enter a single character
            System.out.print("Enter a character: ");
            char ch = scanner.next().charAt(0);  // Reads first character of input

            // Nested if structure to classify the character
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                if (ch >= 'a' && ch <= 'z') {
                    System.out.println("The character is a lowercase letter.");
                } else {
                    System.out.println("The character is an uppercase letter.");
                }
            } else {
                if (ch >= '0' && ch <= '9') {
                    System.out.println("The character is a digit.");
                } else {
                    System.out.println("The character is a special character.");
                }
            }

//            scanner.close();


// 6. Write a program that uses a for loop to print numbers from 1 to 10, each on a new line.

                // For loop to print numbers from 1 to 10
                for (int i = 1; i <= 10; i++) {
                    System.out.println(i);
                }

// 7. Create a program that uses an enhanced for loop to find and print the sum of all elements in an array.


        // Define an array of integers
        int[] numbers = {5, 10, 15, 20, 25};

        int sum = 0;

        // Enhanced for loop to iterate through the array
        for (int num : numbers) {
            sum += num;
        }

        // Print the total sum
        System.out.println("The sum of the array elements is: " + sum);

//// 8. Create a program that takes a number as input and uses the ternary operator to print whether the number is "positive" or "non-positive".


//                Scanner scanner = new Scanner(System.in);

                // Prompt the user to enter a number
                System.out.print("Enter a number: ");
                int number7 = scanner.nextInt();

                // Use ternary operator to determine the result
                String result = (number7 > 0) ? "positive" : "non-positive";

                // Print the result
                System.out.println("The number7 is " + result + ".");

//                scanner.close();

// 9. Enhance the program from problem 8 to also identify zero separately using nested ternary operators.

//                Scanner scanner = new Scanner(System.in);

                // Ask the user for a number
                System.out.print("Enter a number8: ");
                int number8 = scanner.nextInt();

                // Use nested ternary operators to classify the number8
                String resultfinal = (number8 > 0) ? "positive" :
                        (number8 == 0) ? "zero" : "negative";

                // Display the result
                System.out.println("The number8 is " + resultfinal + ".");

//                scanner.close();

// 10. Create a program that takes three numbers as input and uses the ternary operator to find and print the largest number among them.

//                Scanner scanner = new Scanner(System.in);

                // Input three numbers
                System.out.print("Enter the first number: ");
                int a = scanner.nextInt();

                System.out.print("Enter the second number: ");
                int b = scanner.nextInt();

                System.out.print("Enter the third number: ");
                int c = scanner.nextInt();

                // Use nested ternary operators to find the largest
                int largest = (a > b) ?
                        ((a > c) ? a : c) :
                        ((b > c) ? b : c);

                // Output the result
                System.out.println("The largest number is: " + largest);

//                scanner.close();

// 11. Develop a program that uses a for loop to count the number of even and odd numbers in a range from 1 to n, where n is input by the user. Print the counts.

//                Scanner scanner = new Scanner(System.in);

                // Input the upper limit n
                System.out.print("Enter the value of n: ");
                int n = scanner.nextInt();

                int evenCount = 0;
                int oddCount = 0;

                // Loop from 1 to n and count evens and odds
                for (int i = 1; i <= n; i++) {
                    if (i % 2 == 0) {
                        evenCount++;
                    } else {
                        oddCount++;
                    }
                }

                // Print the counts
                System.out.println("Number of even numbers: " + evenCount);
                System.out.println("Number of odd numbers: " + oddCount);

//                scanner.close();

// 12. Write a program that uses a for loop to find all the factors of a number n, where n is a user-input number. Print all factors in a single line separated by a space.


//                Scanner scanner = new Scanner(System.in);

                // Input the number n
                System.out.print("Enter a number: ");
                int z = scanner.nextInt();

                System.out.print("Factors of " + z + " are: ");

                // Loop from 1 to n to check for factors
                for (int i = 1; i <= z; i++) {
                    if (z % i == 0) {
                        System.out.print(i + " ");
                    }
                }

                System.out.println();  // Move to next line after printing factors

//                scanner.close();
    }
}

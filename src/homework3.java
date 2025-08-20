import java.util.ArrayList;
import java.util.Scanner;

public class homework3 {
    public static void main(String[] args) {

//    1. Write a Java program where you create two String objects named stringOne and stringTwo with the same value "OpenAI". Check and print whether they refer to the same object.

        String stringOne = "OpenAI";
        String stringTwo = "OpenAI";

        if (stringOne == stringTwo) {
            System.out.println("stringOne and stringTwo refer to the same object.");
        } else {
            System.out.println("stringOne and stringTwo do NOT refer to the same object.");
        }

//2.  Write a Java program to declare two integer variables firstNumber and secondNumber with any values. Use an equality operator to compare these two numbers and print the result. Do the same for two String objects firstString and secondString with the same value, but use the equals() method for comparison. Print the result.

        // Integer comparison
        int firstNumber = 10;
        int secondNumber = 20;

        if (firstNumber == secondNumber) {
            System.out.println("firstNumber and secondNumber are equal.");
        } else {
            System.out.println("firstNumber and secondNumber are NOT equal.");
        }

        // String comparison
        String firstString = new String("Hello");
        String secondString = new String("Hello");

        if (firstString.equals(secondString)) {
            System.out.println("firstString and secondString have the same value.");
        } else {
            System.out.println("firstString and secondString do NOT have the same value.");
        }

//3. Write a Java program that declares an integer variable age with a value of 20. Print a statement saying "I am adult" if age is 18 or more, else print "I am not an adult".

        int age = 20;

        if (age >= 18) {
            System.out.println("I am adult");
        } else {
            System.out.println("I am not an adult");
        }

//4. Write a Java program where you declare two integer variables heightOne and heightTwo with any values. Use a ternary operator to determine the greater height and assign it to a variable maximumHeight. Print the result.

        int heightOne = 170;
        int heightTwo = 185;

        int maximumHeight = (heightOne > heightTwo) ? heightOne : heightTwo;

        System.out.println("The greater height is: " + maximumHeight);

//5. Write a Java program to print the numbers from 1 to 10 using a for loop. As a next step, modify your program to print only the even numbers from 1 to 10.

        //Version 1: Print numbers from 1 to 10 using a for loop
        System.out.println("Numbers from 1 to 10:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        //Version 2: Print only even numbers from 1 to 10
        System.out.println("Even numbers from 1 to 10:");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        //Alternate Approach for Even Numbers
        System.out.println("Even numbers from 1 to 10:");
        for (int i = 2; i <= 10; i += 2) {
            System.out.println(i);
        }

//    6. Write a Java program where you declare an integer variable temperature. Assign a value to it and print "Hot" if the temperature is more than 30, "Warm" if the temperature is between 20 and 30, and "Cold" if it's less than 20.
        int temperature = 25; // You can change this value to test other cases

        if (temperature > 30) {
            System.out.println("Hot");
        } else if (temperature >= 20 && temperature <= 30) {
            System.out.println("Warm");
        } else {
            System.out.println("Cold");
        }

//7. Write a Java program that determines the type of a triangle based on its sides. Declare three variables sideOne, sideTwo and sideThree to represent the sides of the triangle. Use the ternary operator to determine and print whether the triangle is "Equilateral", "Isosceles", or "Scalene".
        int sideOne = 5;
        int sideTwo = 5;
        int sideThree = 8;

        String triangleType = (sideOne == sideTwo && sideTwo == sideThree) ? "Equilateral"
                : (sideOne == sideTwo || sideOne == sideThree || sideTwo == sideThree) ? "Isosceles"
                : "Scalene";

        System.out.println("The triangle is: " + triangleType);

        //Equilateral: All three sides are equal.
        //Isosceles: Any two sides are equal.
        //Scalene: All sides are different.

//8. Write a Java program to calculate the factorial of a number using a for loop. Declare an integer variable number and assign a value to it. Then calculate and print the factorial of number.

        int number = 5; // You can change this to any positive integer
        int factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        System.out.println("The factorial of " + number + " is: " + factorial);

        //Factorial of n (written as n!) is calculated as:
        //n! = n × (n-1) × (n-2) × ... × 1
        //The for loop multiplies factorial by every number from 1 to number.

//9. Write a Java program to create two String variables, countryOne with the value "USA" and countryTwo with the value "USA". Check if countryOne and countryTwo are equal using the equals() method and print the result. Then change the value of countryTwo to "UK" and check for equality again. Print the result.

        String countryOne = "USA";
        String countryTwo = "USA";

        // First comparison
        if (countryOne.equals(countryTwo)) {
            System.out.println("countryOne and countryTwo are equal.");
        } else {
            System.out.println("countryOne and countryTwo are NOT equal.");
        }

        // Change countryTwo to "UK"
        countryTwo = "UK";

        // Second comparison
        if (countryOne.equals(countryTwo)) {
            System.out.println("countryOne and countryTwo are equal.");
        } else {
            System.out.println("countryOne and countryTwo are NOT equal.");
        }

        //.equals() compares the contents of the strings, not their memory addresses.
        //Initially, both variables contain "USA", so they're equal.
        //After changing countryTwo to "UK", the contents no longer match, so the comparison returns false.

//10. Write a Java program that creates two distinct ArrayList objects, listOne and listTwo. Add some elements to listOne and assign listOne to listTwo. Now modify listOne by adding a new element. Print both lists and observe the output.

        // Create two distinct ArrayList objects
        ArrayList<String> listOne = new ArrayList<>();
        ArrayList<String> listTwo = new ArrayList<>();

        // Add elements to listOne
        listOne.add("Apple");
        listOne.add("Banana");
        listOne.add("Cherry");

        // Assign listOne to listTwo (both now refer to the same list)
        listTwo = listOne;

        // Modify listOne by adding a new element
        listOne.add("Date");

        // Print both lists
        System.out.println("listOne: " + listOne);
        System.out.println("listTwo: " + listTwo);

//    11. Write a Java program where you declare four integer variables: a, b, c, and d. Assign them values of 10, 20, 30, and 40 respectively. Create two more variables additionResult and multiplicationResult. Set additionResult to the sum of a and b and multiplicationResult to the product of c and d. Print the values of additionResult and multiplicationResult.

        // Declare and assign values
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;

        // Calculate addition and multiplication
        int additionResult = a + b;
        int multiplicationResult = c * d;

        // Print the results
        System.out.println("Addition Result (a + b): " + additionResult);
        System.out.println("Multiplication Result (c * d): " + multiplicationResult);

//12. Write a Java program where you declare an integer variable number with a value of 25. Use unary minus operator to change the sign of number and assign it to a variable negativeNumber. Print the values of number and negativeNumber.

        int number25 = 25;
        int negativeNumber = -number25;  // Change sign using unary minus

        System.out.println("Original number: " + number25);
        System.out.println("Negative number: " + negativeNumber);

//13. Write a Java program where you declare two boolean variables isRaining and isSunny with values of true and false, respectively. Use the logical complement operator to negate the values of both variables and print the new values.

        boolean isRaining = true;
        boolean isSunny = false;

        // Negate the boolean values
        boolean notRaining = !isRaining;
        boolean notSunny = !isSunny;

        System.out.println("Original isRaining: " + isRaining);
        System.out.println("Negated isRaining: " + notRaining);
        System.out.println("Original isSunny: " + isSunny);
        System.out.println("Negated isSunny: " + notSunny);


//14. Write a Java program where you declare an integer variable counter with a value of 0. Use the increment operator to increase the value of counter by 1 and then print the value. After that, use the decrement operator to decrease the value of counter by 1 and then print the value.
//
//15. Write a Java program where you declare an integer variable total with a value of 100. Use the compound assignment operator to decrease the total by 20 and then print the value. Next, use another compound assignment operator to multiply the total by 2 and then print the value.

        int counter = 0;

        // Increment the counter by 1
        counter++;
        System.out.println("After increment, counter = " + counter);

        // Decrement the counter by 1
        counter--;
        System.out.println("After decrement, counter = " + counter);

//16. Write a Java program where you use unary operators to perform a series of transformations on an integer variable number initialized to 50. First, negate number, then take the absolute value, and finally increment it by 1. Print the result at each step.

        int number50 = 50;
        System.out.println("Original number: " + number50);

        // Negate number using unary minus
        number50 = -number50;
        System.out.println("After negation: " + number50);

        // Take absolute value (using Math.abs)
        number50 = Math.abs(number50);
        System.out.println("After absolute value: " + number50);

        // Increment by 1
        number50++;
        System.out.println("After increment: " + number50);

//    17. Write a Java program that simulates a simple authentication system. Declare a boolean variable hasUsername and hasPassword. Set up a series of logical conditions using these two variables that will check the following conditions:
    //If both hasUsername and hasPassword are true, print "Authentication successful".
    //If either hasUsername or hasPassword is false, print "Authentication failed".
    //If hasUsername is true but hasPassword is false, print "Password is incorrect".

        boolean hasUsername = true;  // we can change these values to test different cases
        boolean hasPassword = false;

        if (hasUsername && hasPassword) {
            System.out.println("Authentication successful");
        } else if (hasUsername && !hasPassword) {
            System.out.println("Password is incorrect");
        } else {
            System.out.println("Authentication failed");
        }

//18. Write a Java program where you declare an integer array with 5 elements. Use a for loop to initialize the array such that each element is equal to its index incremented by 1. Then use another for loop to decrement each element by 1. Print the array before and after the decrement operation using a for-each loop.

        int[] numbers = new int[5];

        // Initialize the array elements to index + 1
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }

        // Print the array before decrement
        System.out.print("Array before decrement: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Decrement each element by 1
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] - 1;
        }

        // Print the array after decrement
        System.out.print("Array after decrement: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

//19. Write a Java program that takes an integer variable age as input. Use a ternary operator to classify the person into one of the following categories: "Child" (age < 12), "Teenager" (age between 12 and 17), "Adult" (age between 18 and 64), and "Senior" (age 65 and above). Print the resulting classification.

        int age2 = 20;  // We can change this value to test other ages

        String category = (age2 < 12) ? "Child"
                : (age2 >= 12 && age2 <= 17) ? "Teenager"
                : (age2 >= 18 && age2 <= 64) ? "Adult"
                : "Senior";

        System.out.println("Age: " + age2 + " - Category: " + category);

        //Scanner version
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age3 = scanner.nextInt();

        String categoryage = (age3 < 12) ? "Child"
                : (age3 >= 12 && age3 <= 17) ? "Teenager"
                : (age3 >= 18 && age3 <= 64) ? "Adult"
                : "Senior";

        System.out.println("Age: " + age3 + " - Category: " + categoryage);

//20. Write a Java program that takes three integer variables a, b, and c as input. Use nested ternary operators to find and print the largest number among the three.

        System.out.print("Enter number a: ");
        int a1 = scanner.nextInt();

        System.out.print("Enter number b: ");
        int b1 = scanner.nextInt();

        System.out.print("Enter number c: ");
        int c1 = scanner.nextInt();

        int largest = (a1 > b1) ? ( (a1 > c1) ? a1 : c1 ) : ( (b1 > c1) ? b1 : c1 );

        System.out.println("The largest number is: " + largest);

//    21. Write a Java program that takes a double variable score representing a student’s score on a test. Use a ternary operator to classify the score into letter grades A, B, C, D, or F according to the following scale:
    //A: 90-100
    //B: 80-89
    //C: 70-79
    //D: 60-69
    //F: 0-59
    //Print the resulting letter grade.

        System.out.print("Enter the test score: ");
        double score = scanner.nextDouble();

        String grade = (score >= 90 && score <= 100) ? "A"
                : (score >= 80 && score < 90) ? "B"
                : (score >= 70 && score < 80) ? "C"
                : (score >= 60 && score < 70) ? "D"
                : (score >= 0 && score < 60) ? "F"
                : "Invalid score";

        System.out.println("Grade: " + grade);
    }
}

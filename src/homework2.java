import java.util.Scanner;

public class homework2 {
    public static void main(String[] args) {
        // 1. Write a Java program to take two numbers as input and display the result of addition, subtraction, multiplication, division, and modulus.

        int a = 10;
        int b = 20;

        int c = a + b;
        int d = a - b;
        int e = a * b;
        int f = a / b;
        int g = a % b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        System.out.println("g = " + g);

        // 2. Create a Java program where you increment and decrement the same variable. Display the value of the variable after each operation.

        int h = 10;
        System.out.println("h= " + h);

        int i = ++h;
        System.out.println("Increment: i= " + i);

        int j = --h;
        System.out.println("Decrement: j= " + j);

        // 3. Write a program to check if a number is positive or negative using logical complement operator.

        int number = -1;
        int zero = 0;

        boolean isPositive = number > zero;

        System.out.println("The number: " + number + " is a " + isPositive + " statement.");

        //4. Write a Java program that uses both the increment (++) and decrement (--) operators in a loop to count up to 10 and then back down to 1.

        System.out.println("Increment:");
        for (int k = 1; k <= 10; k++) {
                    System.out.print(k + " ");
                }

                System.out.println();

        System.out.println("Decrement:");
                for (int k = 10; k >= 1; k--) {
                    System.out.print(k + " ");
                }
        System.out.println("");

        // 5. Create a Java program that demonstrates the use of each compound assignment operator with integers.

        int a1;
        int b1;
        int c1;
        int d1;
        int e1;
        int f1;
        int g1;
        int h1;
        int i1;
        int j1;
        int l1;

        // += operator
        a1 = 10;
        a1 += 5; // equivalent to a1 = a1 + 5
        System.out.println("a1 += 5 rezulta: " + a1);

        // -= operator
        b1 = 10;
        b1 -= 3; // equivalent to b1 = b1 - 3
        System.out.println("b1 -= 3 rezulta:  " + b1);

        // *= operator
        c1 = 10;
        c1 *= 2; // equivalent to c1 = c1 * 2
        System.out.println("c1 *= 2 rezulta:  " + c1);

        // /= operator
        d1 = 10;
        d1 /= 2; // equivalent to d1 = a1 / 2
        System.out.println("d1 /= 2 rezulta:  " + d1);

        // %= operator
        e1 = 10;
        e1 %= 3; // equivalent to e1 = a1 % 3
        System.out.println("e1 %= 3 rezulta: " + e1);

        // &= operator (bitwise AND)
        f1 = 10;       // 1010 in binary
        f1 &= 6;       // 0110 in binary, result is 0010 (2)
        System.out.println("f1 &= 6 rezulta " + f1);

        // |= operator (bitwise OR)
        g1 = 10;       // 1010 in binary
        g1 |= 3;       // 0011 in binary, result is 1011 (11)
        System.out.println("g1 |= 3 rezulta:  " + g1);

        // ^= operator (bitwise XOR)
        h1 = 10;       // 1010
        h1 ^= 7;       // 0111, result is 1101 (13)
        System.out.println("h1 ^= 7 rezulta " + h1);

        // <<= operator (left shift)
        g1 = 5;        // 0101
        g1 <<= 2;      // shifts left by 2 bits: 010100 (20)
        System.out.println("g1 <<= 2 rezulta: " + g1);

        // >>= operator (right shift)
        h1 = 20;       // 10100
        h1 >>= 2;      // shifts right by 2 bits: 00101 (5)
        System.out.println("h1 >>= 2 rezulta:  " + h1);

        // >>>= operator (unsigned right shift)
        l1 = -20;
        l1 >>>= 2;
        System.out.println("l1 >>>= 2 rezulta:  " + l1); // Shows large positive value due to unsigned shift

//        Compound assignment operators:
//        | Operator | Description                     | Equivalent To         |         |     |
//| -------- | ------------------------------- | --------------------- | ------- | --- |
//| `+=`     | Add and assign                  | `a = a + b`           |         |     |
//| `-=`     | Subtract and assign             | `a = a - b`           |         |     |
//| `*=`     | Multiply and assign             | `a = a * b`           |         |     |
//| `/=`     | Divide and assign               | `a = a / b`           |         |     |
//| `%=`     | Modulus and assign              | `a = a % b`           |         |     |
//| `&=`     | Bitwise AND and assign          | `a = a & b`           |         |     |
//| \`       | =\`                             | Bitwise OR and assign | \`a = a | b\` |
//| `^=`     | Bitwise XOR and assign          | `a = a ^ b`           |         |     |
//| `<<=`    | Left shift and assign           | `a = a << b`          |         |     |
//| `>>=`    | Right shift and assign          | `a = a >> b`          |         |     |
//| `>>>=`   | Unsigned right shift and assign | `a = a >>> b`         |         |     |

        // 6. Write a Java program that takes two numbers from the user and uses relational operators to display whether the first number is greater than, less than, or equal to the second number.

                Scanner scanner = new Scanner(System.in);

                // Input two numbers
                System.out.print("Enter the first number: ");
                int num1 = scanner.nextInt();

                System.out.print("Enter the second number: ");
                int num2 = scanner.nextInt();

                // Compare using relational operators
                if (num1 > num2) {
                    System.out.println("The first number is greater than the second number.");
                } else if (num1 < num2) {
                    System.out.println("The first number is less than the second number.");
                } else { // num1 == num2
                    System.out.println("The first number is equal to the second number.");
                }

//                scanner.close();

//        // 7. Write a program where you perform operations between an integer and a double. Display the result.

                int intNumber = 10;
                double doubleNumber = 4.5;

                //Addition
                double sum = intNumber + doubleNumber;
                System.out.println("Addition (int + double): " + sum);

                // Subtraction
                double difference = intNumber - doubleNumber;
                System.out.println("Subtraction (int - double): " + difference);

                // Multiplication
                double product = intNumber * doubleNumber;
                System.out.println("Multiplication (int * double): " + product);

                // Division
                double quotient = intNumber / doubleNumber;
                System.out.println("Division (int / double): " + quotient);

                // Modulus
                double remainder = intNumber % doubleNumber;
                System.out.println("Modulus (int % double): " + remainder);

        // 8. Create a program that takes two byte values, adds them together, and stores the result in a byte variable.

//                Scanner scanner = new Scanner(System.in);

                // Read two byte values from user
                System.out.print("Enter the first byte value: ");
                byte byte1 = scanner.nextByte();

                System.out.print("Enter the second byte value: ");
                byte byte2 = scanner.nextByte();

                // Add and cast the result back to byte
                byte result = (byte) (byte1 + byte2);

                // Display the result
                System.out.println("Sum of the two byte values: " + result);

//                scanner.close();

        // 9. Write a program that calculates the area of a rectangle. Take the length and breadth as inputs.

//                Scanner scanner = new Scanner(System.in);

                // Take length and breadth as input
                System.out.print("Enter the length of the rectangle: ");
                double length = scanner.nextDouble();

                System.out.print("Enter the breadth of the rectangle: ");
                double breadth = scanner.nextDouble();

                // Calculate area
                double area = length * breadth;

                // Display result
                System.out.println("The area of the rectangle is: " + area);

//                scanner.close();

        //10. Write a program that reverses the sign of an entered integer using unary minus operator.

//                Scanner scanner = new Scanner(System.in);

                // Take integer input
                System.out.print("Enter an integer: ");
                int numberx = scanner.nextInt();

                // Reverse the sign using unary minus operator
                int reversedSign = -numberx;

                // Display result
                System.out.println("The number with reversed sign is: " + reversedSign);

//                scanner.close();

        //11. Write a Java program that takes two boolean inputs from a user. Apply the logical negation operator (!) to each and print the result.

//                Scanner scanner = new Scanner(System.in);

                // Take two boolean inputs
                System.out.print("Enter the first boolean value (true/false): ");
                boolean bool1 = scanner.nextBoolean();

                System.out.print("Enter the second boolean value (true/false): ");
                boolean bool2 = scanner.nextBoolean();

                // Apply logical negation (!)
                boolean notBool1 = !bool1;
                boolean notBool2 = !bool2;

                // Display results
                System.out.println("Negation of first boolean: " + notBool1);
                System.out.println("Negation of second boolean: " + notBool2);

//                scanner.close();

        //12. Create a program that takes an integer as input and then increments and decrements it by 1, displaying the output at each stage.

//                Scanner scanner = new Scanner(System.in);

                // Take integer input
                System.out.print("Enter an integer: ");
                int numberz = scanner.nextInt();

                // Display original number
                System.out.println("Original number: " + numberz);

                // Increment the number
                numberz++; // same as number = number + 1
                System.out.println("After increment: " + numberz);

                // Decrement the number
                numberz--; // same as number = number - 1
                System.out.println("After decrement: " + numberz);

//                scanner.close();

        //13. Write a program to calculate the price after discount. Take the original price and discount percentage as input. Use compound assignment operator to perform the calculation.

//                Scanner scanner = new Scanner(System.in);

                // Take inputs
                System.out.print("Enter the original price: ");
                double price = scanner.nextDouble();

                System.out.print("Enter the discount percentage: ");
                double discountPercent = scanner.nextDouble();

                // Calculate discount amount
                double discountAmount = price * discountPercent / 100;

                // Use compound assignment to apply the discount
                price -= discountAmount;  // same as: price = price - discountAmount

                // Display final price
                System.out.println("Price after discount: " + price);

//                scanner.close();

        //14. Create a program that checks if a user entered number is within a specific range (e.g., 1-100). Use relational operators for the checks.

//                Scanner scanner = new Scanner(System.in);

                // Define the range
                int lowerBound = 1;
                int upperBound = 100;

                // Take number input
                System.out.print("Enter a number: ");
                int numberq = scanner.nextInt();

                // Check if number is within the range using relational operators
                if (numberq >= lowerBound && numberq <= upperBound) {
                    System.out.println("The numberq is within the range of " + lowerBound + " to " + upperBound + ".");
                } else {
                    System.out.println("The numberq is outside the range of " + lowerBound + " to " + upperBound + ".");
                }

//                scanner.close();

        // Challange: Binary Arithmetic Operators:
        // Write a Java program to take two numbers as input and display the result of addition, subtraction, multiplication, division, and modulus.

//        Scanner scanner = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter the first number: ");
        double num11 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num22 = scanner.nextDouble();

        // Perform operations
        double sumfinal = num11 + num22;
        double differencefinal = num11 - num22;
        double productfinal = num11 * num22;

        // Handle division and modulus safely
        if (num22 != 0) {
            double quotientfinal = num11 / num22;
            double remainderfinal = num11 % num22;

            // Display results
            System.out.println("Addition: " + sumfinal);
            System.out.println("Subtraction: " + differencefinal);
            System.out.println("Multiplication: " + productfinal);
            System.out.println("Division: " + quotientfinal);
            System.out.println("Modulus: " + remainderfinal);
        } else {
            System.out.println("Addition: " + sumfinal);
            System.out.println("Subtraction: " + differencefinal);
            System.out.println("Multiplication: " + productfinal);
            System.out.println("Division and modulus by zero are not allowed.");
        }

//        scanner.close();


        // Challange: Binary Arithmetic Operators:
        // Write a program that calculates the area of a rectangle. Take the length and breadth as inputs.

//        Scanner scanner = new Scanner(System.in);

        // Input length and breadth
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();

        System.out.print("Enter the breadth of the rectangle: ");
        double breadth = scanner.nextDouble();

        // Calculate area
        double area = length * breadth;

        // Display the result
        System.out.println("The area of the rectangle is: " + area);

//        scanner.close();


        // Challange: Unary Operators:
        // Create a Java program where you increment and decrement the same variable. Display the value of the variable after each operation.


        int numberk = 10;

        System.out.println("Initial value: " + numberk);

        // Increment the variable
        numberk++;
        System.out.println("After increment: " + numberk);

        // Decrement the variable
        numberk--;
        System.out.println("After decrement: " + numberk);


        // Challange: Unary Operators:
        // Write a program that reverses the sign of an entered integer using unary minus operator.

//        Scanner scanner = new Scanner(System.in);

        // Input an integer
        System.out.print("Enter an integer: ");
        int numberIII = scanner.nextInt();

        // Reverse the sign using unary minus
        int reversed = -numberIII;

        // Display the result
        System.out.println("The numberIII with reversed sign is: " + reversed);

//        scanner.close();


        // Challange: Logical Complement and Negation Operators:
        // Write a program to check if a number is positive or negative using logical complement operator.

//    Scanner scanner = new Scanner(System.in);

    // Input a number
        System.out.print("Enter a number: ");
    int numberIV = scanner.nextInt();

    // Use logical complement to check if the number is negative
    boolean isNegative = numberIV < 0;

    // Using ! to check if the number is NOT negative (i.e., positive or zero)
        if (!isNegative) {
        if (numberIV == 0) {
            System.out.println("The numberIv is zero.");
        } else {
            System.out.println("The numberIV is positive.");
        }
    } else {
        System.out.println("The numberIV is negative.");
    }

//        scanner.close();

        // Challange: Logical Complement and Negation Operators:
        // Write a Java program that takes two boolean inputs from a user. Apply the logical negation operator (!) to each and print the result.

//    Scanner scanner = new Scanner(System.in);

    // Input two boolean values
        System.out.print("Enter the first boolean value (true/false): ");
    boolean bool11 = scanner.nextBoolean();

        System.out.print("Enter the second boolean value (true/false): ");
    boolean bool22 = scanner.nextBoolean();

    // Apply logical negation
    boolean notBool11 = !bool11;
    boolean notBool22 = !bool22;

    // Print results
        System.out.println("Negation of first boolean: " + notBool11);
        System.out.println("Negation of second boolean: " + notBool22);

//        scanner.close();
//}

        // Challange: Increment and Decrement Operators:
        // Write a Java program that uses both the increment (++) and decrement (--) operators in a loop to count up to 10 and then back down to 1.

        System.out.println("Counting up:");
        for (int n = 1; n <= 10; n++) {
            System.out.println(n);
        }

        // Count down from 9 to 1 using --
        // (start at 9 to avoid repeating 10)
        System.out.println("Counting down:");
        for (int n = 9; n >= 1; n--) {
            System.out.println(n);
        }

        // Challange: Increment and Decrement Operators:
        // Create a program that takes an integer as input and then increments and decrements it by 1, displaying the output at each stage.

//    Scanner scanner = new Scanner(System.in);

    // Input an integer
        System.out.print("Enter an integer: ");
    int numbert = scanner.nextInt();

    // Display original value
        System.out.println("Original value: " + numbert);

    // Increment
    number++;
        System.out.println("After incrementing by 1: " + numbert);

    // Decrement
    number--;
        System.out.println("After decrementing by 1: " + numbert);

//        scanner.close();

        // Challenge: Assignment and Compound Assignment Operators:
        // Create a Java program that demonstrates the use of each compound assignment operator with integers.

    int z = 10;

        System.out.println("Initial value of z: " + z);

    // += operator
    z += 5;  // z = z + 5
        System.out.println("After z += 5: " + z);

    // -= operator
    z -= 3;  // z = z - 3
        System.out.println("After z -= 3: " + z);

    // *= operator
    z *= 2;  // z = z * 2
        System.out.println("After z *= 2: " + z);

    // /= operator
    z /= 4;  // z = z / 4
        System.out.println("After z /= 4: " + z);

    // %= operator
    z %= 3;  // z = z % 3
        System.out.println("After z %= 3: " + z);

        // Challenge: Assignment and Compound Assignment Operators:
        // Write a program to calculate the price after discount. Take the original price and discount percentage as input. Use compound assignment operator to perform the calculation.

//    Scanner scanner = new Scanner(System.in);

    // Input original price and discount percentage
        System.out.print("Enter the original price2: ");
    double price2 = scanner.nextDouble();

        System.out.print("Enter the discount percentage: ");
    double discount = scanner.nextDouble();

    // Calculate discount amount
    double discountAmount2 = price2 * discount / 100;

    // Apply discount using compound assignment operator
    price -= discountAmount2;  // same as: price2 = price2 - discountAmount2

    // Display the final price
        System.out.println("Price2 after discount2: " + price2);

//        scanner.close();

        // Challenge: Relational Operators:
        // Write a Java program that takes two numbers from the user and uses relational operators to display whether the first number is greater than, less than, or equal to the second number.

//    Scanner scanner = new Scanner(System.in);

    // Input two numbers
        System.out.print("Enter the first number: ");
    double num111 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
    double num222 = scanner.nextDouble();

    // Compare using relational operators
        if (num111 > num222) {
        System.out.println("The first number is greater than the second number.");
    } else if (num111 < num222) {
        System.out.println("The first number is less than the second number.");
    } else {
        System.out.println("Both numbers are equal.");
    }
//        scanner.close();

        // Challenge: Relational Operators:
        // Create a program that checks if a user entered number is within a specific range (e.g., 1-100). Use relational operators for the checks.

//    Scanner scanner = new Scanner(System.in);

    // Define the range
    int lowerLimit = 1;
    int upperLimit = 100;

    // Input a number
        System.out.print("Enter a number: ");
    int numberII = scanner.nextInt();

    // Check if the number is within the range using relational operators
        if (numberII >= lowerLimit && numberII <= upperLimit) {
        System.out.println("The numberd is within the range " + lowerLimit + " to " + upperLimit + ".");
    } else {
        System.out.println("The numberd is outside the range " + lowerLimit + " to " + upperLimit + ".");
    }

//        scanner.close();

        // Challenge - Numeric Promotion:
        //Write a program where you perform operations between an integer and a double. Display the result and discuss why it is in that format (due to Numeric Promotion).


        int intValue = 10;
        double doubleValue = 3.5;

        // Arithmetic operation
        double resultfinal = intValue + doubleValue;

        // Output the result
        System.out.println("int + double = " + resultfinal);

        //Create a program that takes two byte values, adds them together, and stores the result in a byte variable. Explain why the result is or is not what you'd expect, based on the rules of numeric promotion.

//                Scanner scanner = new Scanner(System.in);

                // Read two byte values
                System.out.print("Enter first byte value: ");
                byte byte10 = scanner.nextByte();

                System.out.print("Enter second byte value: ");
                byte byte20 = scanner.nextByte();

                // Add and cast result back to byte
                byte sumfinal1 = (byte) (byte10 + byte20);  // Explicit cast required!

                System.out.println("Sum (as byte): " + sumfinal1);

//                scanner.close();
    }
}

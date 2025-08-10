import java.sql.SQLOutput;
import java.util.Scanner;

public class homework1 {

    public static void main(String[] args) {
        // 1. Simple Output Program: Write a program that prints your name, age, and favorite color on three separate lines.

       // println
        String name = "Oana";
        int age = 40;
        String colour = "green";

        System.out.println("My name is: " + name);
        System.out.println("My age is: " + age);
        System.out.println("My favourite colour is: " + colour);

        //printf
        System.out.printf("My name is: %s%nMy age is: %d%nMy favorite colour is: %s%n", name, age, colour );

        // 2. Using Variables: Write a program that defines four different variables (an integer, a double, a character, and a string), assigns them values, and then prints them out.
        int age2 = 40;
        double weight = 60.5d;
        char sex ='F';
        String name2 = "Oana";

        System.out.println("I am " + age2 + " years old, I have " + weight +"kilograms, my sex is " + sex + " ,and my name is " + name2 + "." );

        // 3. Operations: Write a program that performs various operations (addition, subtraction, multiplication, division, and modulus) on two numbers. The numbers can be hard-coded into the program. Print the result of each operation.

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

        //Go the extra mile
        //4. Simple Input/Output: Write a program that asks the user to enter two numbers, performs addition on those numbers, and prints out the result.

        int num1 = 1;
        int num2 = 2;
        int sum = num1 + num2;
        System.out.println("The sum is:" + sum);

        //Question: how to write the program to allow the user to enter numbers?
        //Chatgpt results:
//        Scanner scanner = new Scanner(System.in);
//
//        // Ask user for two numbers
//        System.out.print("Enter the first number: ");
//        double number1 = scanner.nextDouble();
//
//        System.out.print("Enter the second number: ");
//        double number2 = scanner.nextDouble();
//
//        // Add the numbers
//        double sum2 = number1 + number2;
//
//        // Print the result
//        System.out.println("The sum of the two numbers is: " + sum2);
//
//        scanner.close();
        //Question: how/where to enter the numbers?

    }
    }

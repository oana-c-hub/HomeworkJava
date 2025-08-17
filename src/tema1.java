public class tema1 {
    public static void main(String[] args) {
//    1. Binary Arithmetic Operators:
//    Objective: Get acquainted with addition, subtraction, multiplication, division, and remainder operations in Java.

        int a = 10, b = 20;
        System.out.println(a + b); // What will this print? - 30
        System.out.println(b - a); // And this? - 10
        System.out.println(a * b); // This?  - 200
        System.out.println(b / a); // How about this? - 2
        System.out.println(b % a); // And finally, this? - 0

//2. Binary Arithmetic Operators:
//    Objective: Practice operations with different number types.

        double c = 10.5, d = 4.5;
        System.out.println(c + d); // Predict the result. -15.0
        System.out.println(c * d); // Multiply and print. - 47.25
        System.out.println(c / d); // What's the result of this division? -2.3333333333333335

//3. Unary Operators:
//    Objective: Understand the unary minus and unary plus operators.

        int e = +10; // Unary plus
        int f = -20; // Unary minus

        System.out.println(e); // What does this print? - 10
        System.out.println(f); // And this? - -20

//4. Unary Operators:
//    Objective: Deepen the understanding of unary operations.

        int num = -25;
        System.out.println(+num);  // What will this output? - -25
        System.out.println(-num);  // And this? - 25

//5. Logical Complement & Negation Operators:
//    Objective: Practice with multiple boolean variables.

        boolean isFirstTime = true;
        boolean isRegistered = false;

        System.out.println(!isFirstTime); // Predict the output. - false
        System.out.println(!isRegistered); // And this? - true

//6. Logical Complement & Negation Operators:
//    Objective: Explore the logical NOT (!) operator.

        boolean flag = false;
        System.out.println(!flag); // What will this print? - true

//7. Increment & Decrement Operators:
//    Objective: Understand the difference between post-increment/decrement and pre-increment/decrement.

        int g = 5, j = 5;

        System.out.println(g++); // What is the result? - 5
        System.out.println(++j); // How does this differ from the previous line? - 6

//8. Increment & Decrement Operators:
//    Objective: Experience the difference in nested operations.

        int x = 10, y = 10;
        int result1 = x++ * 5;
        int result2 = ++y * 5;
        System.out.println(result1); // What is the result? - 50
        System.out.println(result2); // How does this differ? - 55


//9. Assignment & Compound Assignment Operators:
//    Objective: Experiment with different compound assignments.

        int value = 20;
        value *= 3; // Multiply and assign

        System.out.println(value); // What's the result? - 60

        value %= 50; // Use modulus and assign

        System.out.println(value); // Now what's the value? - 10

//10. Assignment & Compound Assignment Operators:
//    Objective: Familiarize with assignment and compound assignment.

        int k = 10;
        k += 5; // Compound addition. Equivalent to: k = a + 5;
        System.out.println(k); // What will this print? - 15

//        11. Relational Operators:
//        Objective: Understand how to compare two values.

        int l = 10, m = 20;

        System.out.println(l == m);  // What will this print? - false
        System.out.println(l != m);  // And this? - true
        System.out.println(l > m);   // This? - false
        System.out.println(l < m);   // How about this? - true
        System.out.println(l >= m);  // This? - false
        System.out.println(l <= m);  // And finally, this? - true

//        12. Relational Operators:
//        Objective: Understand comparison with different number types.

        double n = 15.5;
        int o = 15;

        System.out.println(n > o);  // Predict the outcome. - true
        System.out.println(n <= o); // And this? - false

//        13. Numeric Promotion:
//        Objective: Experience automatic and explicit promotion.

        short p = 10;
        int q = p + 5; // What happens here? - int + int = 15

        long r = 100L;
        int s = (int) r; // Why is casting required here? Predict the outcome. - 100L
        // g is a long, and we are trying to store it in an int
        // This is a narrowing conversion, and it requires explicit casting.
        // No data is lost here because 100L fits into an int.

//        14. Numeric Promotion:
//        Objective: Understand how Java promotes numbers of smaller data types.

        byte t = 10;
        int u = t;  // What happens here? Why doesn't this cause an error?
        // byte → int: This is automatic widening conversion. No cast is needed.

        double v = 5.5;
        float w = (float) v;  // Why do we need to cast here?
        // double → float: This is narrowing, since float has less precision than double.
        // We must cast explicitly to avoid possible precision loss.

//        15. Variables:
//        Objective: Understand variable declaration, initialization, and usage.

        int age;       // Declaration
        age = 25;      // Initialization

        System.out.println("I am " + age + " years old."); // What will this print? - I am 25 years old.

//        16. Variables:
//        Objective: Experiment with variable scopes.

        int outerVar = 100;

        if (outerVar > 50) {
            int innerVar = 200;
            System.out.println(innerVar + outerVar); // Predict the output. - 300
            //outerVar = 100
            //innerVar = 200

        }

    // System.out.println(innerVar); // Uncommenting this line would cause an error. Why?

    // Because innerVar is declared inside the if block, and in Java, variable scope is limited to the block ({}) where it's defined.
    //This means:   innerVar exists only inside the if (outerVar > 50) { ... } block.
    //Outside that block, innerVar is undefined, so the compiler will throw an "cannot find symbol" error.

    }
}

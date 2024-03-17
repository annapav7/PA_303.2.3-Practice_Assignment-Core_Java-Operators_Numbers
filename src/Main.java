//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

/*
Assignment Name: PA 303.2.3 - Practice Assignment - Core Java - Operators and Numbers
Author: Pavlenko Anna
Data: March_15_2024
 */

public class Main {
    public static void main(String[] args) {

        // Tasks:
        System.out.println("/ Tasks 1: ");
        /* 1. Write a program that declares an integer a variable x,
            assigns the value 2 to it, and prints out the binary string
            version of the number ( Integer.toBinaryString(x) ). Now, use
            the left shift operator (<<) to shift by 1 and assign
            the result to x. Before printing the results, write a comment
            with the predicted decimal value and binary string. Now, print
            out x in decimal form and in binary notation.
            Perform the preceding exercise with the following values:
                - a. 9
                - b. 17
                - c. 88
         */
        System.out.println("--------------x = 2------------------");
        int x = 2;
        System.out.println("A value of variable x: " + x);
        System.out.println("The binary string version of x: " + Integer.toBinaryString(x));
        // the left shift operator (<<) to shift by 1:
        System.out.println();
        System.out.println("The left shift operator (<<) to shift by 1:");
        x = x << 1;
        System.out.println("A value of variable x: " + x);  // multiplication by 2
        System.out.println("The binary string version of x: " + Integer.toBinaryString(x));

        System.out.println();
        float y = x;
        System.out.println("A decimal value of variable y: " + y);
        //System.out.println("The binary string version of decimal x -> y: " + Integer.toBinaryString(y));

        System.out.println("--------------a = 9------------------");
        int a = 9;
        System.out.println("A value of variable a: " + a);
        System.out.println("The binary string version of a: " + Integer.toBinaryString(a));
        // the left shift operator (<<) to shift by 1:
        System.out.println();
        System.out.println("The left shift operator (<<) to shift by 1:");
        a = a << 1;
        System.out.println("A value of variable a: " + a);  // multiplication by 2
        System.out.println("The binary string version of a: " + Integer.toBinaryString(a));

        System.out.println();
        float a1= a;
        System.out.println("A decimal value of variable a: " + a1);

        System.out.println("--------------b = 17------------------");
        int b = 17;
        System.out.println("A value of variable b: " + b);
        System.out.println("The binary string version of b: " + Integer.toBinaryString(b));
        // the left shift operator (<<) to shift by 1:
        System.out.println();
        System.out.println("The left shift operator (<<) to shift by 1:");
        b = b << 1;
        System.out.println("A value of variable b: " + b);  // multiplication by 2
        System.out.println("The binary string version of b: " + Integer.toBinaryString(b));

        System.out.println();
        float b1= b;
        System.out.println("A decimal value of variable b: " + b1);


        System.out.println("--------------c = 88------------------");
        int c = 88;
        System.out.println("A value of variable c: " + c);
        System.out.println("The binary string version of c: " + Integer.toBinaryString(c));
        // the left shift operator (<<) to shift by 1:
        System.out.println();
        System.out.println("The left shift operator (<<) to shift by 1:");
        c = c << 1;
        System.out.println("A value of variable c: " + c);  // multiplication by 2
        System.out.println("The binary string version of c: " + Integer.toBinaryString(c));

        System.out.println();
        float c1= c;
        System.out.println("A decimal value of variable a: " + c1);


        /* 2. Write a program that declares a variable x, and assigns 150 to it,
        and prints out the binary string version of the number. Now use the right s
        hift operator (>>) to shift by 2 and assign the result to x. Write a comment
        indicating what you anticipate the decimal and binary values to be.
        Now print the value of x and the binary string.
        Perform the preceding exercise with the following values:
             - a. 225
             - b. 1555
             - c. 32456
         */
        System.out.println("/ Tasks 2: ");

        // the right shift operator (>>) to shift by 2 and assign the result to x / by 2

        System.out.println("--------------x = 150------------------");
        int x1 = 150;
        System.out.println("A value of variable x1: " + x1);
        System.out.println("The binary string version of x1: " + Integer.toBinaryString(x1));
        // the right shift operator (>>) to shift by 1:
        System.out.println();
        System.out.println("The rigth shift operator (>>) to shift by 2:");
        x1 = x1 >> 2;
        System.out.println("A value of variable x1: " + x1);  // multiplication by 2
        System.out.println("The binary string version of x1: " + Integer.toBinaryString(x1));

        System.out.println();
        float x11= x1;
        System.out.println("A decimal value of variable a: " + x11);

        /* 3. Write a program that declares three int variables: x, y, and z.
            Assign 7 to x and 17 to y. Write a comment that indicates what you predict
            will be the result of the bitwise and operation on x and y. Now use the bitwise
            AND (&) operator to derive the decimal and binary values, and assign the result
            to z.
         */

        /* 4. Now, with the preceding values, use the bitwise and operator to calculate
            the “or” value between x and y. As before, write a comment that indicates
            what you predict the values to be before printing them out.
         */

        /* 5. Write a program that declares an integer variable, assigns a number,
            and uses a postfix increment operator to increase the value.
            Print the value before and after the increment operator.
         */

        /* 6. Write a program that declares an integer variable, assigns a number,
            and uses a postfix increment operator to increase the value. Print the value
            before and after the increment operator.
         */

        /* 7. Write a program that declares two integer variables: x, and y, and
            then assigns 5 to x and 8 to y. Create another variable sum and assign
            the value of ++x added to y, and print the result. Notice the value
            of the sum (should be 14). Now change the increment operator to postfix (x++)
            and re-run the program. Notice what the value of the sum is. The first
            configuration incremented x, and then calculated the sum, while the second
            configuration calculated the sum, and then incremented x.
         */




    }
}

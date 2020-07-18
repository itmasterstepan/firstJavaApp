package com.calculator;
import java.util.Scanner;

public class Calculator {

    public static void main (String[] args) {

        int firstNum = 0;
        int secondNum = 0;
        int result = 0;
        char operator = 0;

        boolean firstNumHasBeenSet = false;
        boolean secondNumHasBeenSet = false;
        boolean operatorHasBeenSet = false;

        Scanner scannerObj = new Scanner (System.in);


        //Check type of first element on int.
        while (!firstNumHasBeenSet) {
            // 1. redundant do | 2. what if user enters -2

            System.out.println ("Please enter first number");

            if (scannerObj.hasNextInt ()){
                firstNum = scannerObj.nextInt ();
                firstNumHasBeenSet = true;
            }else{
                System.out.println ("That not a number!");
                System.out.println ("You must input a number value like( ...,-2,-1,0,1,2,.... )");
                scannerObj.next ();
            }

        }


        //Check type of second element on int.

        while (!secondNumHasBeenSet) { // 1. redundant do | 2. what if user enters -2
            System.out.println ("Please enter second number");

            if(scannerObj.hasNextInt ()){
                secondNum = scannerObj.nextInt ();
                secondNumHasBeenSet = true;

            }else{
                System.out.println ("That not a number!");
                System.out.println ("You must input a number value like( ...,-2,-1,0,1,2,.... )");
                scannerObj.next ();
            }


        }

        //Check operator code
        while (!operatorHasBeenSet){ // redundant do
            System.out.println ("Select, what operation I must to do? (available only +, -, *, /)");

            operator = scannerObj.next ().charAt (0);

            switch (operator){   // switch without default case
                case '+':
                    result = firstNum + secondNum;
                    operatorHasBeenSet = true;
                    break;

                case '-':
                    result = firstNum - secondNum;
                    operatorHasBeenSet = true;
                    break;

                case '*':
                    result = firstNum * secondNum;
                    operatorHasBeenSet = true;
                    break;

                case '/':
                    result = firstNum / secondNum;
                    operatorHasBeenSet = true;
                    break;

                default:
                    System.out.println ("You entered an incorrect value");
                    System.out.println ("List of available values (+, -, *, /).");
            }
        }
        // what if result of the operation is 0 or less (example [1 - 2])

        //  - do not forget to close resources that do in-memory buffering
        scannerObj.close ();

        System.out.println ( "Our result" + " [ ("+ firstNum +") "+ operator +" ("+ secondNum +") ] = " + result );

    }



    // 1. spaces before bracket

    /*
    2. inaccuracy in user interface

    output:
    Please enter first number
    -1
    Please enter first number
    -1
    Please enter first number
    -1
    Please enter first number

    not clear for user what is wrong and also (important) why is it wrong??

     */

    // 3. overall over complication

    // 4. push with redundant files (.idea/, .iml)

    // 5. class name not related to the app work (minor thing)
}

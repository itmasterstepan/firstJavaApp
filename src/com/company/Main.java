package com.company;

import java.lang.String; // no need to add java.lang.* imports explicitly. java.lang classes are always implicitly imported
import java.util.Scanner;

public class Main {
    public /* final */ static String [] msgArr = {   // it shouldn't be public. Also better use local variables in functions for now.
            "Please enter first number",
            "Please enter second number",
            "Select, what operation I must to do? (available only +, -, *, /)",
            "Our result"
    };
    public /* final */ static String [] msgErrorArr = {  // it shouldn't be public. Also better use local variables in functions for now.
            "That not a number!",
            "You must input a number value like( 10, 20, 30 )",
    };

    public static void main(String[] args) {

        Scanner scannerObj = new Scanner(System.in);

        int firstNum = 0;
        int secondNum = 0;
        int result = 0;
        char operator;

        //Check type of first element on int.
        while (firstNum <= 0) {  // 1. redundant do | 2. what if user enters -2
            printMsgInNewLine(0);
            while (!scannerObj.hasNextInt()) {
                printErrorMsgInNewLine(0);
                printErrorMsgInNewLine(1);
                scannerObj.next();
            }
            firstNum = scannerObj.nextInt();
        }

        int[] arr;

        //Check operator code
        do { // redundant do
            printMsgInNewLine(2);
            operator = scannerObj.next().charAt(0);
            switch (operator){   // switch without default case
                case '+': result = firstNum + secondNum; break;  // one operation - one line
                case '-': result = firstNum - secondNum; break;  // one operation - one line
                case '*': result = firstNum * secondNum; break;  // one operation - one line
                case '/': result = firstNum / secondNum; break;  // one operation - one line
            }
        } while (result <= 0); // what if result of the operation is 0 or less (example [1 - 2])

        // scannerObj.close() - do not forget to close resources that do in-memory buffering

        printMsgInNewLineWithResult(new int[]{firstNum, secondNum}, operator, result);

    }

    public static void printErrorMsgInNewLine (int msgNumber){
        System.out.println( msgErrorArr[msgNumber] );
    }

    public static void printMsgInNewLine (int msgNumber){
        System.out.println( msgArr[msgNumber] );
    }

    public static void printMsgInNewLineWithResult(int[] arr, char operator, int result){
        System.out.println( msgArr[3] + " [ "+ arr[0] +""+ operator +""+ arr[1] +" ] = " + result );
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

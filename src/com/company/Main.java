package com.company;
import java.lang.String;
import java.util.Scanner;

public class Main {
    public static String [] msgArr = {
            "Please enter first number",
            "Please enter second number",
            "Select, what operation I must to do? (available only +, -, *, /)",
            "Our result"
    };
    public static String [] msgErrorArr = {
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
        do {
            printMsgInNewLine(0);
            while (!scannerObj.hasNextInt()) {
                printErrorMsgInNewLine(0);
                printErrorMsgInNewLine(1);
                scannerObj.next();
            }
            firstNum = scannerObj.nextInt();
        } while (firstNum <= 0);


        //Check type of second element on int.
        do {
            printMsgInNewLine(1);
            while (!scannerObj.hasNextInt()) {
                printErrorMsgInNewLine(0);
                printErrorMsgInNewLine(1);
                scannerObj.next();
            }
            secondNum = scannerObj.nextInt();
        } while (secondNum <= 0);



        //Check operator code
        do {
            printMsgInNewLine(2);
            operator = scannerObj.next().charAt(0);
            switch (operator){
                case '+': result = firstNum + secondNum; break;
                case '-': result = firstNum - secondNum; break;
                case '*': result = firstNum * secondNum; break;
                case '/': result = firstNum / secondNum; break;
            }
        } while (result <= 0);


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
}

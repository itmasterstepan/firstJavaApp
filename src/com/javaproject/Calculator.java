package com.javaproject;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Calculator {

    private int firstNum;
    private int secondNum;
    private char operator;
    private int result;
    private Scanner scanner;
    private Collections ArrayUtils;

    public static void main (String[] args) {

        Calculator self = new Calculator ();

        self.scanner = new Scanner (System.in);

        self.CalculateWithRepeatNumber (1);
        self.reverseArray();
        self.occurrencesOfTheRequiredNumberInArray();


        self.scanner.close ();

    }


    /**
     * CalculateWithRepeatNumber
     * @param maxIterations
     */
    private void CalculateWithRepeatNumber (int maxIterations){

        for (int i=1; i <= maxIterations; i++) {
            getFirstNumber();
            getSecondNumber();
            getOperator();
            getOurResult();
        }

        scanner.close ();
    }


    /**
     * getFirstNumber
     */
    private void getFirstNumber (){

        System.out.println ("Please enter first number");

        while ( !scanner.hasNextInt () ) {
            System.out.println (
                    "Invalid first number. Try again:"+ scanner.next ()
            );
        }

        firstNum = scanner.nextInt ();
    }

    /**
     * getSecondNumber
     */
    private void getSecondNumber (){

        System.out.println ("Please enter second number");

        while (!scanner.hasNextInt ()) {
            System.out.println (
                    "Invalid second number. Try again:" + scanner.next ()
            );
        }

        secondNum = scanner.nextInt ();
    }

    /**
     * getOperator
     */
    private void getOperator (){

        System.out.println ("Select action (available only [+], [-], [*], [/])");

        while (!scanner.hasNext( "[+\\-*/]") ) {
            System.out.println (
                    "Invalid action. (available only [+], [-], [*], [/]). /n Try again:" + scanner.next ()
            );
        }

        operator = scanner.next ().charAt (0);

        switch (operator) {
            case '+': result = firstNum + secondNum;

            case '-': result = firstNum - secondNum;

            case '*': result = firstNum * secondNum;

            case '/': result = firstNum / secondNum;

            default:  result = 0;
        }

    }


    /**
     * getOurResult
     */
    private void getOurResult (){
        System.out.println ( "Our result" + " [ ("+ firstNum +") "+ operator +" ("+ secondNum +") ] = " + result );
        System.out.println ( "___________________________________________________________________________________");
    }


    // Array section

    private void reverseArray(){
        System.out.println ("Select action (available only [+], [-], [*], [/])");

        while (!scanner.hasNext ( "[0-9,]+$") ) {
            System.out.println (
                "Invalid array. (need to add array like this [11,34,3,45,23,5,67]). /n Try again:" + scanner.next ()
            );
        }


        String str = scanner.next ();
        int[] numArr = Arrays.stream(str.split(",")).mapToInt(
                Integer::parseInt
        ).toArray();

        System.out.println("Our array before reverse: " + Arrays.toString(numArr) );

        for(int i=0; i< numArr.length/2; i++){
            int temp = numArr[i];
            numArr[i] = numArr[numArr.length -i -1];
            numArr[numArr.length -i -1] = temp;
        }

        System.out.println("Our array after reverse: " + Arrays.toString(numArr) );

    }

    private void occurrencesOfTheRequiredNumberInArray(){
        //System.out.println ("empty");
    }
}

package com.calculator;
import java.util.Scanner;

public class Calculator {

    private static int firstNum;
    private static int secondNum;
    private static int operator;
    private static int result;

    public static void main (String[] args) {
        int repeatNumber = 10;
        CalculateWithRepeatNumber(repeatNumber);
    }

    private static void CalculateWithRepeatNumber(int maxIterations){
        Scanner reader = new Scanner (System.in);

        for (int i=1; i <= maxIterations; i++){
            getFirstNumber(reader);
            getSecondNumber(reader);
            getOperator(reader);
            getOurResult(reader);
        }

        reader.close ();

    }


    private static void getFirstNumber(Scanner reader){

        boolean firstNumHasBeenSet = false;

        while (!firstNumHasBeenSet) {
            // 1. redundant do | 2. what if user enters -2

            System.out.println ("Please enter first number");

            if (reader.hasNextInt ()){
                firstNum = reader.nextInt ();
                firstNumHasBeenSet = true;

            }else{
                System.out.println ("That not a number!");
                System.out.println ("You must input a number value like( ...,-2,-1,0,1,2,.... )");
                reader.next ();
            }

        }
    }

    private static void getSecondNumber(Scanner reader){
        boolean secondNumHasBeenSet = false;

        while (!secondNumHasBeenSet) { // 1. redundant do | 2. what if user enters -2
            System.out.println ("Please enter second number");

            if(reader.hasNextInt ()){
                secondNum = reader.nextInt ();
                secondNumHasBeenSet = true;

            }else{
                System.out.println ("That not a number!");
                System.out.println ("You must input a number value like( ...,-2,-1,0,1,2,.... )");
                reader.next ();
            }


        }
    }

    private static void getOperator(Scanner reader){
        boolean operatorHasBeenSet = false;

        while (!operatorHasBeenSet){ // redundant do
            System.out.println ("Select, what operation I must to do? (available only +, -, *, /)");

            operator = reader.next().charAt(0);

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
    }

    private static void getOurResult(Scanner reader){
        System.out.println ( "Our result" + " [ ("+ firstNum +") "+ operator +" ("+ secondNum +") ] = " + result );
        System.out.println ( "___________________________________________________________________________________");
    }
}

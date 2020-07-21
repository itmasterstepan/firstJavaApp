package com.javaproject;

public class Calculator extends Main {

    private static int firstNum;
    private static int secondNum;
    private static char operator;
    private static int result;

    public static void run () {

        int repeatNumber = 10;
        CalculateWithRepeatNumber (repeatNumber);

    }

    private static void CalculateWithRepeatNumber (int maxIterations){

        for (int i=1; i <= maxIterations; i++){
            getFirstNumber();
            getSecondNumber();
            getOperator();
            getOurResult();
        }

        reader.close ();
    }


    private static void getFirstNumber (){

        boolean firstNumHasBeenSet = false;

        while (!firstNumHasBeenSet) {

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

    private static void getSecondNumber (){
        boolean secondNumHasBeenSet = false;

        while (!secondNumHasBeenSet) {
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

    private static void getOperator (){
        boolean operatorHasBeenSet = false;

        while (!operatorHasBeenSet){
            System.out.println ("Select, what operation I must to do? (available only +, -, *, /)");

            operator = reader.next().charAt(0);

            System.out.println (operator);

            switch (operator){
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

    private static void getOurResult (){
        System.out.println ( "Our result" + " [ ("+ firstNum +") "+ operator +" ("+ secondNum +") ] = " + result );
        System.out.println ( "___________________________________________________________________________________");
    }
}

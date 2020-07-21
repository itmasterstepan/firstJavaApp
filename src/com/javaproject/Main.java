package com.javaproject;
import java.util.Scanner;
import com.javaproject.Calculator;
import com.javaproject.ArrayTransformer;


public class Main {

    protected static Scanner reader;

    public static void main (String[] args) {
        reader = new Scanner (System.in);

        actionSelector();

        reader.close ();
    }


    private static void actionSelector(){
        boolean actionWordHasBeenSet = true;
        char actionWord;

        while (actionWordHasBeenSet){
            System.out.println ("Select action!");
            System.out.println ("Press 'c' - will start Calculator (for calculate variables)");
            System.out.println ("Press 'a' - will start arrayTransformer (for working with arrays)");

            actionWord = reader.next().charAt(0);

            switch (actionWord){
                case 'c':
                    runCalculator();
                    actionWordHasBeenSet = false;
                    break;

                case 'a':
                    runArrayTransformer();
                    actionWordHasBeenSet = false;
                    break;

                default:
                    System.out.println ("Invalid input parameter.");
            }
        }
    }



    private static void runCalculator(){
        Calculator.run();
    }


    private static void runArrayTransformer(){
        ArrayTransformer.run();
    }

}

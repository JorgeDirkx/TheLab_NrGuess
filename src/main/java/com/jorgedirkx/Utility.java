package com.jorgedirkx;

import java.util.Scanner;

public class Utility {

    public static int getRandomNumber(int minValue, int maxValue){
        return (int) (Math.random()*(maxValue-minValue+1) + minValue);
    }

    public static int readInt(){
        Scanner keyboard = new Scanner(System.in);
        int input;
        while (true) {
            if(keyboard.hasNextInt()){
                input = keyboard.nextInt();
                break;
            } else {
                System.out.println("Wrong input - enter number again");
                keyboard.next();
            }
        }
        return input;
    }
}


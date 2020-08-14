package com.jorgedirkx;

import java.util.Random;
import java.util.Scanner;

public class Numbers {

    public static void main(String[] args) {


        int[] userGuesses = new int[5];
        int[] computerNumbers = new int[5];
        int i = 0;
        int correctGuesses = 0;


        while(i<5){
            computerNumbers[i] = Utility.getRandomNumber(1,10);
            System.out.println("User: please enter your " + (i+1) + " guess");
            userGuesses[i] = Utility.readInt();
            if(computerNumbers[i] == userGuesses[i]){
                correctGuesses++;
            }
            i++;
        }

        System.out.println("User guesses : " + userGuesses[0] + " "+ userGuesses[1] + " "+ userGuesses[2] + " "+ userGuesses[3] + " "+ userGuesses[4]);
        System.out.println("Computer guesses : "+ computerNumbers[0] + " "+ computerNumbers[1] + " "+ computerNumbers[2] + " "+ computerNumbers[3] + " "+ computerNumbers[4]);
        System.out.println("*****************************************");
        System.out.println("number of correct guesses: " + correctGuesses);

    }

    }


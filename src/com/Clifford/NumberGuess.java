package com.Clifford;

import java.util.Scanner;
import java.util.Random;
public class NumberGuess {

    public static void numberGuess() {


        int randomNum,userGuess;
Scanner scanner=new Scanner(System.in);
Random rand=new Random();
randomNum=rand.nextInt(5);




        System.out.println("Guess a u number from 0 to 4: ");
        userGuess=scanner.nextInt();
        if (randomNum == userGuess)
            System.out.println("Congratulations🤩, You won!");
        else if (randomNum > userGuess)
            System.out.println(" You lost, number too high!");
    }
}

package com.Clifford;

import java.util.Scanner;
import java.util.Random;
public class NumberGuess {

    public static void numberGuess() {
        Scanner scanner=new Scanner(System.in);
        Random rand=new Random();

        int randomNum,userGuess;
        randomNum=rand.nextInt(5);




    do{
    System.out.println("Guess a  number from 0 to 4: ");
    userGuess=scanner.nextInt();

    if (userGuess>4 ||userGuess<0)
            System.out.println("Invalid input! Enter a number from 0 to 4");
    }while(userGuess>4 ||userGuess<0);



        if (randomNum == userGuess)
            System.out.println("Congratulations🤩, You won!");
        else if (randomNum < userGuess)
            System.out.println("You lost😢, number too high!");
         else
            System.out.println("You lost😢, number too low!");

        System.out.println("The correct number was "+randomNum);
        scanner.close();
    }
}

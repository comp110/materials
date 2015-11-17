package com.comp110.lecture25;
import java.util.Scanner;

public class NumberGame {

  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    
    System.out.println("What is the maximum number you want me to use?");
    final double MAX = keyboard.nextDouble();
  
    System.out.println("I'm thinking of a number between 0 and " + MAX + ". What is it?");
    double randomNumber  = Math.round(Math.random() * MAX);
    
    int guesses = 0;
    
    while(true) {
      double guess = keyboard.nextDouble();
      guesses = guesses + 1;
      
      if(guess == randomNumber) {
        System.out.println("Bingo!!!!!!");
        break;
      } else if(guess < randomNumber) {
        System.out.println("Higher!");
      } else if(guess > randomNumber) {
        System.out.println("Lower!");
      }
    }
    
    System.out.println("Game over in " + guesses + " guesses!");
  }

}

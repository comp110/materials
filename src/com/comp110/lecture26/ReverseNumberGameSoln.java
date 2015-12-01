package com.comp110.lecture26;

import java.util.Scanner;

public class ReverseNumberGameSoln {
  
  static Scanner keyboard = new Scanner(System.in);

  public static void main(String[] args) {
    
    intro();
    
    int min = 1, max = 1024;
    boolean nailedIt = false;
    
    int guessCount = 0;
    while(nailedIt == false) {
      
      // How should we guess here?
      int guess = (max - min) / 2 + min;
      
      int response = submitGuess(guess);
      
      // How should we change min/max depending on response?
      if(response < 0) {
        max = guess;
      } else if(response > 0) {
        min = guess;
      } else {
        nailedIt = true;
      }
      
      guessCount++;
    }
    
    System.out.println("Boom. Nailed it. It only took " + guessCount + " guess(es).");
  }
  
  private static void intro() {
    System.out.println("HEY YOU! Think of a number between 1 and 1024");
    System.out.println("Write it down...");
    System.out.println("Press a number and then enter to confirm.");
    keyboard.nextInt();
    System.out.println("REALLY, though, did you write it down?");
    System.out.println("PRESS NUMBER THEN ENTER TO CONFIRM");
    keyboard.nextInt();
  }
  
  private static int submitGuess(int guess) {
    System.out.println("Is it " + guess + "?");
    System.out.println("  -1 for smaller");
    System.out.println("  0  for nailed it");
    System.out.println("  1  for bigger");
    return keyboard.nextInt();
  }

}

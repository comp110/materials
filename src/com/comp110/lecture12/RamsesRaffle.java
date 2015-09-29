package com.comp110.lecture12;

import java.util.Scanner;

public class RamsesRaffle {

  public static void main(String[] args) throws InterruptedException {
    Scanner keyboard = new Scanner(System.in);

    boolean isPlaying = true;
    
    while(isPlaying) {
      System.out.println("RAMSES' RAFFLE\nWhat is up for grabs?");
      String raffle = keyboard.next();
      
      // Todo: Change to an Array
      String person0 = "[NAME]";
      String person1 = "[NAME]";
      String person2 = "[NAME]";
      
      // Select winner at random
      int winningNumber = (int)(Math.random() * 3.0);
      String winner;
      if(winningNumber == 0) {
        winner = person0;
      } else if(winningNumber == 1) {
        winner = person1;
      } else {
        winner = person2;
      }
      System.out.println("RAMSES DECIDES...");
      Thread.sleep(1000); // "Sleep" for 1000 milliseconds...
      // The suspense builds...
      
      System.out.println(winner + " IS CHOSEN FOR " + raffle + "!");
      
      System.out.println("Keep playing? Press 1 to continue, 0 to quit.");
      isPlaying = keyboard.nextInt() != 0;
    }
    System.out.println("The end");
    
  }

}

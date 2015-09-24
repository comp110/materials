package com.comp110.lecture11;

import java.util.Scanner;

public class RamsesRaffle {

  public static void main(String[] args) throws InterruptedException {
    Scanner keyboard = new Scanner(System.in);

    System.out.println("RAMSES' RAFFLE\nWhat is up for grabs?");
    String raffle = keyboard.nextLine();
    
    String person0 = "[YOUR NAME HERE]";
    String person1 = "[FRIEND NAME HERE]";
    String person2 = "Kris";
    
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
    
    
  }

}

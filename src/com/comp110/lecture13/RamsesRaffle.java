package com.comp110.lecture13;

import java.util.Scanner;

public class RamsesRaffle {

  public static void main(String[] args) throws InterruptedException {
    Scanner keyboard = new Scanner(System.in);

    System.out.println("RAMSES' RAFFLE\n" +
                       "What is up for grabs?");
    String raffle = keyboard.next();

    System.out.println("How many players?");
    System.out.println("Three. But v2.0 is coming out today...");
    
    String[] players = { "Ramses", "Fedora", "Holt" };
    
    int winningNumber = (int)(Math.random() * 3);
    String winner = ""; // TODO Part A

    System.out.println("RAMSES DECIDES...");
    Thread.sleep(1000); // The suspense builds...
    System.out.println(winner + " IS CHOSEN FOR " + raffle + "!");
  }

}
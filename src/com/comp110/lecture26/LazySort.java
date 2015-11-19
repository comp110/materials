package com.comp110.lecture26;

import java.util.Arrays;

public class LazySort {

  public static void main(String[] args) {
    
    Player[] players = Player.getRoster();
    
    System.out.println("Players");
    print(players);
    
    // TODO: Sort players...
    
    System.out.println("Players sorted by height...");
    print(players);

  }
  
  public static void print(Player[] input) {
    for(int i = 0; i < input.length; i++) {
      System.out.println(input[i]);
    }
    System.out.println("\n");
  }

}

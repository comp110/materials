package com.comp110.lecture26;

public class InsertionSort {

  public static void main(String[] args) {
    
    Player[] team = Player.getRoster();
    
    System.out.println("Roster:");
    print(team);
    
    Player temp;
    for(int start = 1; start < team.length; start++) {
      // TODO
    }
    
    System.out.println("Roster by Height:");
    print(team);
  }
  
  public static void print(Player[] input) {
    System.out.println("\n");
    for(int i = 0; i < input.length; i++) {
      System.out.println(input[i]);
    }
    System.out.println("\n");
  }
  
}
package com.comp110.lecture25;

public class SelectionSort {

  public static void main(String[] args) {
    
    Player[] team = Player.getRoster();
    
    swap(team, 0, 1);
    
    System.out.println("Team:");
    print(team);
    
    /* TODO:
    sort(team);
    System.out.println("Team by Height:");
    print(team);
    */
  }
  
  public static void sort(Player[] players) {
    // TODO
  }
  
  public static void print(Player[] input) {
    for(int i = 0; i < input.length; i++) {
      System.out.println(input[i]);
    }
    System.out.println("\n");
  }
  
}
package com.comp110.lecture26;

public class SelectionSort {

  public static void main(String[] args) {
    
    Player[] team = Player.getRoster();
    
    System.out.println("Team:");
    print(team);
    
    selectionSort(team);
    
    System.out.println("Team by Height:");
    print(team);
  }
  
  public static void selectionSort(Player[] players) {
    int start, cursor, smallest;
    for(start = 0; start < players.length; start++) {
      smallest = start;
      for(cursor = start; cursor < players.length; cursor++) {
        if(players[cursor].getHeight() <= players[smallest].getHeight()) {
          smallest = cursor;
        }
      }
      swap(players, start, smallest);
    }
  }
  
  public static void swap(Player[] players, int i, int j) {
    Player temp = players[i];
    players[i] = players[j];
    players[j] = temp;
  }
  
  public static void print(Player[] input) {
    for(int i = 0; i < input.length; i++) {
      System.out.println(input[i]);
    }
    System.out.println("\n");
  }
  
}

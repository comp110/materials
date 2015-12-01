package com.comp110.lecture26;

public class InsertionSortSoln {

  public static void main(String[] args) {
    
    Player[] team = Player.getRoster();
    
    System.out.println("Roster:");
    print(team);
    
    Player temp;
    for(int start = 1; start < team.length; start++) {
      temp = team[start];
      int cursor = start - 1;
      while(cursor >= 0 && team[cursor].getHeight() > temp.getHeight()) {
        team[cursor + 1] = team[cursor];
        cursor--;
      }
      team[cursor+1] = temp;
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
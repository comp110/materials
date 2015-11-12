package com.comp110.lecture24;

public class FindTheCash {

  public static void main(String[] args) {
    
    Room startRoom = Room.constructMap();
    System.out.println("You win $" + startRoom.searchForCash() + "!!!");

  }

}

package com.comp110.lecture18;

import java.util.Scanner;

public class MakeItRain {
  
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    
    System.out.println("How many rows of seats?");
    int rows = keyboard.nextInt();
    
    System.out.println("Which row are you sitting in? 0 indexed!");
    int myRow = keyboard.nextInt();
    
    String[] actions = {
        "Rub Your Hands Together",
        "Snap Your Fingers",
        "Slap Your Theighs",
        "Stomp the Ground and Keep Slapping Those Theighs!"
    };
    
    System.out.println("NOW WAIT! Type in a number but DON'T press enter!");
    keyboard.nextInt();
    
    System.out.println("When an instruction is printed out, do it!");
    pauseProgram(1);
    
    for(int i = 0; i < actions.length; i++) {
      String action = actions[i];
      for(int j = 0; j < rows; j++) {
        if(j == myRow) {
          perform(action);
        }
        pauseProgram(1);
      }
    }
    
    for(int i = actions.length - 2; i >= 0; i--) {
      String action = actions[i];
      for(int j = 0; j < rows; j++) {
        if(j == myRow) {
          perform(action);
        }
        pauseProgram(1);
      }
    }
    
    System.out.println("Isn't Fall the best?");
    
  }
  
  static void perform(String action) {
    System.out.println("OK now... " + action);
  }
  
  static void pauseProgram(double seconds) {
    try {
      Thread.sleep((long)(seconds * 1000));
    } catch (InterruptedException e) {}
  }

}

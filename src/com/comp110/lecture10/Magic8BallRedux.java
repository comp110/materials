/**
 * Let's make our magic 8 ball game work repeatedly!
 * Maybe we'll even allow exiting...
 */
package com.comp110.lecture10;

import java.util.Scanner;

public class Magic8BallRedux {

  public static void main(String[] args) {
    
    System.out.println("Ask me a yes/no question...");
    Scanner keyboard = new Scanner(System.in);
    keyboard.nextLine(); // We don't care what the user asks...

    // Generate a random response value
    double randomNumber = Math.random() * 3.0;
    int response = (int)randomNumber;
    
    // Depending on the generated value, pick a response
    if (response == 0) {
      System.out.println("Definitely. Yes.");
    } else if (response == 1) {
      System.out.println("Eh, maybe...");
    } else {
      System.out.println("Nope, no way.");
    }

  }

}

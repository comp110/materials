package com.comp110.lecture22;

import java.util.Scanner;

class Console {
  
  static Scanner keyboard = new Scanner(System.in);
  
  /**
   * Ask the user to enter a double value within some specified
   * range.
   * @param prompt  The prompt to ask the user.
   * @param min     The minimum allowed value.
   * @param max     The maximum allowed value.
   * @return        The user's input.
   */
  static double ask(String prompt, double min, double max) {
    double input = -1.0;
    while(input < min || input > max) {
      println(prompt);
      print("[Enter between "+min+"-"+max+"]: ");
      input = keyboard.nextDouble();
    }
    return input;
  }
  
  static void print(String s) {
    System.out.print(s);
  }
  
  static void println(String s) {
    System.out.println(s);
  }
  
  static void println(double d) {
    System.out.println(d);
  }  
  
}
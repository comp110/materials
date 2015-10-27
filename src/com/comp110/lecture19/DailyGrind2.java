package com.comp110.lecture19;

public class DailyGrind2 {

  public static void main(String[] args) {
    
    double  dollars = 20.0;

    System.out.println("Going to the caffeine store...");
    boolean isCaffeinated = buyCoffee(dollars);
    
    if(isCaffeinated) {
      System.out.print(":) ");
    } else {
      System.out.print(":( ");
    }
    System.out.println("Dollars left: " + dollars);
  
  }
  
  static boolean buyCoffee(double dollars) {
    if(dollars >= 2.50) {
      dollars = dollars - 2.50;
      return true;
    }
    return false;
  }

}

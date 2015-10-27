package com.comp110.lecture19;

public class DailyGrind {

  public static void main(String[] args) {
    
    double  dollars = 20.0;

    System.out.println("Going to the caffeine store...");
    boolean isCaffeinated;
    
    if(dollars >= 2.50) {
      dollars = dollars - 2.50;
      isCaffeinated = true;
    } else {
      isCaffeinated = false;
    }
    
    if(isCaffeinated) {
      System.out.print(":) ");
    } else {
      System.out.print(":( ");
    }
    System.out.println("Dollars left: " + dollars);
  
  }

}
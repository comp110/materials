package com.comp110.lecture19;

public class DailyGrind3 {

  public static void main(String[] args) {

    // Your Code Here 
    
    System.out.println("Going to the caffeine store...");
    person.isCaffeinated = buyCoffee(person);
    
    if(person.isCaffeinated) {
      System.out.print(":) ");
    } else {
      System.out.print(":( ");
    }
    System.out.println("Dollars left: " + person.dollars);
    
  }
  
  static boolean buyCoffee(Person person) {
    if(person.dollars >= 2.50) {
      person.dollars = person.dollars - 2.50;
      return true;
    }
    return false;
  }

}

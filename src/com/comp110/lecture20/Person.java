package com.comp110.lecture20;

class Person {
  
  String costume;
  int age;
  double bac;
  
  boolean canLegallyDrink() {
    return this.age >= 21;
  }
  
  void says(String message) {
    System.out.println(this.costume + " says to everyone on Franklin St: " + message);
  }

}
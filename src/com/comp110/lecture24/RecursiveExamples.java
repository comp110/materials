package com.comp110.lecture24;

public class RecursiveExamples {

  public static void main(String[] args) {
  
  }

  public static int factorialLoop(int n) {
    int factorial = 1;
    while(n > 1) {
      factorial = factorial * n;
      n--;
    }
    return factorial;
  }
  
}

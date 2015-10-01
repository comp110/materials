package com.comp110.support;

public abstract class Helpers {

  public static void output(String s) {
    System.out.println(s);
  }
  
  public static void output(int number) {
    output(new int[]{number});
  }
  
  public static void output(int[] numbers) {
    for(int i = 0; i < numbers.length; i++) {
      if(i > 0) {
        System.out.print(", ");
      }
      System.out.print(numbers[i]);
    }
    System.out.print("\n");
  }
  
  public static int powerOf(int base, int exponent) {
    return (int)Math.pow(base, exponent);
  }
  
}

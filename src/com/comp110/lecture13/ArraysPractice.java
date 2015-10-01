package com.comp110.lecture13;

import com.comp110.support.Helpers;

public class ArraysPractice extends Helpers {

  public static void main(String[] args) {
    
    // Declare a new integer array named `bits` and
    // initialize it with a new array with 8 elements.
    int[] bits = new int[8];
    output(bits);
 
    // Part A
    bits[7] = powerOf(2, 0); // 2^0 = 1
    bits[6] = powerOf(2, 1); // 2^1 = 2
    bits[5] = powerOf(2, 2); // 2^2 = 4
    bits[4] = powerOf(2, 3); // 2^3 = 8
    bits[3] = powerOf(2, 4); // 2^4 = ...
    bits[2] = powerOf(2, 5); // 2^5 = ...
    bits[1] = powerOf(2, 6); // 2^6 = ...
    bits[0] = powerOf(2, 7); // 2^7 = ...
    output(bits);
    
    // Part B
    int sum = 0;
    sum = sum + bits[0];
    sum = sum + bits[1];
    sum = sum + bits[2];
    sum = sum + bits[3];
    sum = sum + bits[4];
    sum = sum + bits[5];
    sum = sum + bits[6];
    sum = sum + bits[7];
    output(sum);
    
  }

  
  
   /*
}
   */
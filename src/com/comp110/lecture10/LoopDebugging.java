/**
 * We'll use the Eclipse debugger to figure out why
 * we have an infinite loop here.
 * 
 * Our goal: Print EVEN numbers between 
 *           0 through 8, inclusive.
 */
package com.comp110.lecture10;

public class LoopDebugging {

  public static void main(String[] args) {
    
    // Remember, for loop control flow works like:
    // 1. Initialize counter variable
    // 2. Evaluate Boolean Expression
    //   true  - go to step 3
    //   false - skip past for loop
    // 3. Execute loop body
    // 4. Modify counter variable, go to step 2
    
    //      1.       2.        4.
    for(int i = 0; i != 9; i = i + 2) {
      //      3.
      System.out.println(i);
    }

  }

}

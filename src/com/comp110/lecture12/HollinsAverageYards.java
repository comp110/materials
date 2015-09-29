// Average Yards for #13
// 2014: { 40.0, 110.0, 92.0, 35.0, 28.0, 84.0, 46.0, 120.0, 11.0, 39.0, 1.0, 5.0, 2.0 }

package com.comp110.lecture12;

public class HollinsAverageYards {

  public static void main(String[] args) {
    
    double[] yards = new double[4]; // 2015 Games
    yards[0] = 6.0;  // vs. Fake Carolina
    yards[1] = 26.0; // vs. NCAT
    yards[2] = 0.0;  // vs. Illinois
    yards[3] = 100.0;// vs. Delaware

    // TODO: Calculate sum and average
    double sum = 0.0;
    double average = 0.0;
    
    System.out.println("In " + yards.length + " games...");
    System.out.println("Mack ran " + sum +" yards, averaging " + average + " yards per game");
    
    
    
  }

}

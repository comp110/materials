package com.comp110.lecture18;

public class MultiplicationTable {

  public static void main(String[] args) {
    int size = 8;
    printHeader("Multiplication Table up to " + size);
    
    int[][] table = new int[size][size+2];
    
    for(int i = 0; i < table.length; i++) {
      for(int j = 0; j < table[i].length; j++) {
        table[i][j] = (i + 1) * (j + 1);
      }
    }
    printTable(table);
    
    // TODO: implement a method that sums a row and call it
    
  }
  
  static int sumRow(int[][] table, int rowNumber) {
    return 0; // This should return the sum of a row
  }
  
  // === Support Code Below ===
  
  static void printTable(int[][] table) {
    for(int i = 0; i < table.length; i++) {
      for(int j = 0; j < table[i].length; j++) {
        printCell(table[i][j]);
      }
      System.out.print("\n");
    }
  }
  
  // The following method prints a header message
  // by adding some padding to both sides of the message
  // and underlining the message with a line of dashes.
  static void printHeader(String message) {
    String titleLine = "    " + message + "    ";

    System.out.println("");
    System.out.println(titleLine);
    for(int i = 0; i < titleLine.length(); i++) {
      System.out.print("-");
    }
    System.out.println("");
  }
  
  // The following message prints a cell with padded spaces
  // when the number has fewer than 3 digits. It also prints
  // a space after the number.
  static void printCell(int number) {
    // String.format is a powerful utility for formatting strings.
    // Its usage is cryptic, though, so when in need refer to the
    // Java documentation about it.
    System.out.print(String.format("%1$3s", number) + " ");
  }
  
  static void println(String s) {
    System.out.println(s);
  }

}

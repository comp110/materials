package com.comp110.lecture17;

public class MultiplicationTable {

  public static void main(String[] args) {
    int size = 8;
    printHeader("Multiplication Table up to " + size);
    
    // TODO Declare and construct a 2D int array
    //         of `size` by `size`.
    
    // TODO Assign values that array with multiplication
    //         table of row * column.
    
    
  }
  
  // TODO: Write a printTable method
  
  // === Support Code Below ===
  
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

}

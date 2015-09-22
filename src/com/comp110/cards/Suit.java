/**
 * This enum represents suits contained in playing cards.
 * 
 * Author: Kris Jordan
 * License: MIT
 * Copyright 2015
 */
package com.comp110.cards;

public enum Suit {
  
  HEART(  "HEART"),
  DIAMOND("DIAMOND"),
  SPADE(  "SPADE"),
  CLUB(   "CLUB");
  
  private final String symbol;
  
  Suit(String symbol) {
    this.symbol = symbol;
  }

  public String getSymbol() {
    return symbol;
  }
  
}

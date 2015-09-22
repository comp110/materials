/**
 * This enum represents ranks in playing cards.
 * 
 * Author: Kris Jordan
 * License: MIT
 * Copyright 2015
 */
package com.comp110.cards;

public enum Rank {
  KING(  "K", 13),
  QUEEN( "Q", 12),
  JACK(  "J", 11),
  TEN(  "10", 10),
  NINE(  "9",  9),
  EIGHT( "8",  8),
  SEVEN( "7",  7),
  SIX(   "6",  6),
  FIVE(  "5",  5),
  FOUR(  "4",  4),
  THREE( "3",  3),
  TWO(   "2",  2),
  ACE(   "A",  1);
  
  private final String symbol;
  private final int value;
  
  Rank(String symbol, int value) {
    this.symbol = symbol;
    this.value = value;
  }
  
  String getSymbol() {
    return symbol;
  }
  
  boolean isAce() {
    return equals(ACE);
  }
  
  boolean hasFace() {
    return value > 10;
  }

  public int getValue() {
    return value;
  }
  
  public int toInteger() {
    return value;
  }
}

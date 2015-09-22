/**
 * This class represents a simple playing card.
 * 
 * Author: Kris Jordan
 * License: MIT
 * Copyright 2015
 */
package com.comp110.cards;

public class Card {

  protected final Suit suit;
  protected final Rank rank;
  
  public Card(Suit suit, Rank rank) {
    this.suit = suit;
    this.rank = rank;
  }

  public Suit getSuit() {
    return suit;
  }

  public Rank getFace() {
    return rank;
  }

  public boolean isAce() {
    return rank.isAce();
  }
  
  public boolean isFaceCard() {
    return rank.hasFace();
  }
  
  public String toString() {
    return rank.getSymbol() + suit.getSymbol();
  }
  
  public int getOrdinal() {
    return rank.getValue();
  }

}
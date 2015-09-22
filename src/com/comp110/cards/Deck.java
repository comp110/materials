/**
 * This class represents a deck of playing cards. It defaults to
 * a single, full 52 card deck. You can shuffle the deck and draw
 * cards from it.
 * 
 * Author: Kris Jordan
 * License: MIT
 * Copyright 2015
 */
package com.comp110.cards;

import java.util.ArrayList;

public class Deck {
  
  public final int STANDARD_SIZE = 52;
  
  protected ArrayList<Card> cards;

  public Deck() {
    cards = new ArrayList<Card>(STANDARD_SIZE);
    for(Suit suit : Suit.values()) {
      for(Rank rank : Rank.values()) {
        cards.add(new Card(suit, rank));
      }
    }
  }
  
  public Card draw() {
    if(cards.size() > 0) {
      return cards.remove(0);
    } else {
      return null;
    }
  }
  
  public void shuffle() {
    ArrayList<Card> shuffled = new ArrayList<Card>(STANDARD_SIZE);
    while(cards.size() > 0) {
      int index = (int)(Math.random() * (double)cards.size());
      shuffled.add(cards.remove(index));
    }
    cards = shuffled;
  }

  public int size() {
    return cards.size();
  }
}
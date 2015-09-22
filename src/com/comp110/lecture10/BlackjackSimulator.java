/*
 * Blackjack Simulator calculates the odds of drawing blackjack
 * from a fair deck of 52 shuffled cards by simulating trials.
 */
package com.comp110.lecture10; // A "package" is a grouping of functionality

import com.comp110.cards.Deck; // We're importing some functionality from
import com.comp110.cards.Card; // another package written for this class.

class BlackjackSimulator {

  public static void main(String[] args) {
 
      Deck deck = new Deck(); // Initialize a new Deck variable
      
      Card card1, card2;      // Declare 2 card variables
      card1 = deck.draw();    // Draw cards from deck
      card2 = deck.draw();
      
      System.out.println("You drew: " + card1 + " " + card2);
      
  }

}
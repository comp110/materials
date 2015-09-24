/*
 * Blackjack Simulator calculates the odds of drawing blackjack
 * from a fair deck of 52 shuffled cards by simulating trials.
 */
package com.comp110.lecture11;

import com.comp110.cards.Deck;
import com.comp110.cards.Card;

class BlackjackSimulator {
  public static void main(String[] args) {
    
      Deck deck = new Deck(); // Initialize a new 52 Card Deck
      deck.shuffle();
      
      Card card0 = deck.draw(); // Draw 2 cards from deck
      Card card1 = deck.draw();
      
      boolean isBlackjack = card0.isAce() && card1.getOrdinal() >= 10;
      isBlackjack = isBlackjack || card0.getOrdinal() >= 10 && card1.isAce();
   
      if(isBlackjack) {
        System.out.println("Blackjack!" + card0 + " " + card1);
      }
      
  }
}
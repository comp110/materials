package com.comp110.lecture27;

public class Coin {

  private double value;
  private int yearMinted;
  private boolean headsUp;
  
  // Is this a method or a constructor?
  public Coin(double value, int yearMinted) {
    this.value = value;
    this.yearMinted = yearMinted;
    this.headsUp = false;
  }
  
  public void flip() {
    if(Math.random() >= 0.99) {
      this.headsUp = true;
    } else {
      this.headsUp = false;
    }
    
    // Better version:
    // this.headsUp = Math.random() >= 0.5;
  }
  
  public boolean isHeads() {
    return this.headsUp;
  }
  
  public boolean isTails() {
    return this.headsUp == false;
  }
  
  public int compareTo(Coin otherCoin) {
    if(this.value > otherCoin.value) {
      return 1;
    } else if(this.value == otherCoin.value) {
      return 0;
    } else {
      return -1;
    }
  }
  
  public String toString() {
    String direction;
    if(this.headsUp) {
      direction = "heads";
    } else {
      direction = "tails";
    }
    return "$"+this.value+ " facing " + direction;
  }

}
package com.comp110.lecture21;

public class Game {

  Player[] players = new Player[10];
  int playerCount  = 0;
  
  Product    expensive;
  Product    cheap;
  
  double   answer;
  
  Player play() {
    this.printWelcomeMessage();
    this.askPlayersToGuess();
    // this.revealCorrectAnswer();
    return this.decideWinner();
  }
  
  Player decideWinner() {
    Player[] players = this.players;
    Player closest = null;
    
    // TODO
    
    return closest;
  }

  // Provided Code Follows

  void askPlayersToGuess() {
    Player[] players = this.players;
    for(int i = 0; i < playerCount; i++) {
      players[i].guess = Console.ask(players[i].name + " what is your guess?", 0, 100);
    }
  }
  
  void setProducts(Product productA, Product productB) {
    if(productA.unitsPerDollar() < productB.unitsPerDollar()) {
      this.expensive   = productA;
      this.cheap       = productB;
    } else {
      this.expensive   = productB;
      this.cheap       = productA;
    }
    
    // Unit Price Ratio
    this.answer = this.expensive.unitsPerDollar() / this.cheap.unitsPerDollar();
    // Savings
    this.answer = (1.0 - this.answer);
    // Change to percent
    this.answer = this.answer * 100.0;
  }

  void addPlayer(Player player) {
    if(this.playerCount < this.players.length) {
      this.players[playerCount] = player;
      this.playerCount++;
    } else {
      Console.println("10 player limit! Sorry " + player.name);
    }
  }
  
  void printWelcomeMessage() {
    Console.println("Welcome to The Unit Price is Right!");
    Console.println("");
    Console.println(this.cheap.brand + " " + this.cheap.units + " " + this.cheap.unitName);
    Console.println("  ...versus...   ");
    Console.println(this.expensive.brand + " " + this.expensive.units + " " + this.expensive.unitName);
    Console.println("");
    Console.println("What percent cheaper per unit is " + this.cheap.brand + " compared to " + this.expensive.brand);
    Console.println("");
  }
  
  void revealCorrectAnswer() {
    Console.println("");
    Console.println(this.cheap.brand + " is " + this.answer + "% cheaper/unit than " + this.expensive.brand);
    Console.println("");
  }
  

}
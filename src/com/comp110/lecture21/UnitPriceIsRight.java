package com.comp110.lecture21;

public class UnitPriceIsRight {

  public static void main(String[] args) {

    Game game = new Game();

    initializeProducts(game);
    initializePlayers(game);
    displayWinner(game.play());

  }
  
  static void initializeProducts(Game game) {
    Product productA = new Product();
    productA.brand = "Equate";
    productA.price = 12.97;
    productA.unitName = "200mg tablets";
    productA.units = 1000;
    
    Product productB = new Product();
    productB.brand = "Advil";
    productB.price = 3.48;
    productB.unitName = "200mb tablets";
    productB.units = 24;
    
    game.setProducts(productA, productB);
  }
  
  static void initializePlayers(Game game) {
    String[] names = { "Your Name", "Friend Name" };
    for(int i = 0; i < names.length; i++) {
      Player player = new Player();
      player.name = names[i];
      game.addPlayer(player);
    }
  }
  
  static void displayWinner(Player winner) {
    if(winner == null) {
      Console.println("Nobody won :(");
    } else {
      Console.println(winner.name + " $aves dat money!");
    }
  }

}
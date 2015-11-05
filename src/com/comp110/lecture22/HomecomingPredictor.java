package com.comp110.lecture22;

public class HomecomingPredictor {

  public static void main(String[] args) {
    
    Magic8Ball ball = new Magic8Ball();
    System.out.println("Will I be cheering 'UNC' in binary Saturday, rain or shine?");
    ball.shake();
    System.out.println(ball.getAnswer());

    // Question: What does our heap look like when we do something like this...
    // Magic8Ball[] lotsOf8Balls = new Magic8Ball[10000];
    // for(int i = 0; i < lotsOf8Balls.length; i++) {
    //   lotsOf8Balls[i] = new Magic8Ball();
    //   lotsOf8Balls[i].shake();
    // }

  }

}
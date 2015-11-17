package com.comp110.lecture25;

public class Player {

  private String name;
  private int number;
  private double height;
  
  public Player(String name, int number, double feet, double inches) {
    this.name = name;
    this.number = number;
    this.height = feet + inches / 12.0;
  }
  
  public String getName() {
    return this.name;
  }
  
  public int getNumber() {
    return this.number;
  }
  
  public double getHeight() {
    return this.height;
  }
  
  public String toString() {
    int feet = (int)this.height;
    int inches = (int)((this.height - feet) * 12.0);
    return "#"+this.number+" "+this.name+" at "+feet+"'"+inches+"\"";
  }
  
  public static Player[] getRoster() {
    Player[] team = {
        new Player("Nate Britt",       0, 6.0, 1.0),
        new Player("Theo Pinson",      1, 6.0, 6.0),
        new Player("Joel Berry II",    2, 6.0, 0.0),
        new Player("Kennedy Meeks",    3, 6.0, 11.0),
        new Player("Isaiah Hicks",     4, 6.0, 9.0),
        new Player("Marcus Paige",     5, 6.0, 2.0),
        new Player("Brice Johnson",   11, 6.0, 10.0),
        new Player("Kanler Coker",    13, 6.0, 4.0),
        new Player("Kenny Williams",  24, 6.0, 4.0),
        new Player("Stillman White",  30, 6.0, 1.0),
        new Player("Justin Coleman",  31, 6.0, 1.0),
        new Player("Luke Maye",       32, 6.0, 8.0),
        new Player("Toby Egbuna",     34, 6.0, 4.0),
        new Player("Joel James",      42, 6.0, 11.0),
        new Player("Spenser Dalton",  43, 6.0, 3.0),
        new Player("Justin Jackson",  44, 6.0, 8.0)
    };
    return team;
  }
  
}

package com.comp110.lecture24;

public class Room {

  // Instance Variables
  private String name;
  private double cash;
  private Room leftDoorRoom;
  private Room rightDoorRoom;
  
  // Constructor
  public Room(String name, double cash) {
    this.name = name;
    this.cash = cash;
  }
  
  // Instance Methods
  public boolean hasLeftDoor() {
    return this.leftDoorRoom != null;
  }
  
  public boolean hasRightDoor() {
    return this.rightDoorRoom != null;
  }
  
  public double searchForCash() {
    System.out.println("Room " + this.name + " has " + this.cash + " dollars.");
    double cashFound = this.cash;
    
    // How will you search for cash in the rooms
    // behind each door of this room? Experiment here...

    return cashFound;
  }
  
  // Static Methods
  public static Room constructMap() {
    Room a = new Room("A", 0.0);
    Room b = new Room("B", 0.0);
    Room c = new Room("C", 20.0);
    Room d = new Room("D", 50.0);
    Room e = new Room("E", 0);
    Room f = new Room("F", 1.0);
    Room g = new Room("G", 0);
    Room h = new Room("H", 0);
    Room i = new Room("I", 100.0);
    Room j = new Room("J", 0);
    Room k = new Room("K", 0);
    Room l = new Room("L", 0);
    Room m = new Room("M", 0);
    Room n = new Room("N", 100000.0);
    Room o = new Room("O", 0);
    
    a.leftDoorRoom = b;
    a.rightDoorRoom = c;
    
    b.leftDoorRoom = d;
    b.rightDoorRoom = e;
    
    c.leftDoorRoom = f;
    c.rightDoorRoom = g;
    
    d.leftDoorRoom = h;
    d.rightDoorRoom = i;
    
    e.leftDoorRoom = j;
    e.rightDoorRoom = k;
    
    f.leftDoorRoom = l;
    f.rightDoorRoom = m;
    
    g.leftDoorRoom = n;
    g.rightDoorRoom = o;
    
    return a;
  }
  
}

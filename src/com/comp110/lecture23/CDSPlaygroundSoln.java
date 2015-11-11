package com.comp110.lecture23;

public class CDSPlaygroundSoln {

  public static void main(String[] args) {
    
    Food[] menu = Food.readFoodsFromCSV("data/rams-2015-11-10.csv");
    
    for(int i = 0; i < menu.length; i++) {
      Food food = menu[i];
      if(food.getSeating().equals("Dinner")) {
        if(food.isHighProteinAndOrganic()) {
          System.out.println(food.getSeating() + " - " + food);
        }
      }
    }
  }

}

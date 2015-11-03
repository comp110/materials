package com.comp110.lecture21;

class Product {
  
  String brand;
  
  double units;
  String unitName;

  double price;
  
  double unitsPerDollar() {
    return this.units / this.price;
  }
  
}
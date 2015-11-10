package com.comp110.lecture23;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Food {

  private String seating;
  private String name;
  private double calories;
  private double protein;
  private double fat;
  private double carbohydrates;
  private boolean isOranic;
  private boolean isVegetarian;
  private boolean isGlutenFree;
  private boolean isVegan;
  
  /* Constructors */
  
  public Food(String seating, String name) {
    this.setSeating(seating);
    this.setName(name);
  }
  
  /* Start: Our work space. */
  
  
  
  
  
  
  /* End: Our work space. */
  
  /* Getters and Setters */
  public String getSeating() {
    return seating;
  }

  public void setSeating(String seating) {
    this.seating = seating;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getCalories() {
    return calories;
  }

  public void setCalories(double calories) {
    this.calories = calories;
  }

  public double getProtein() {
    return protein;
  }

  public void setProtein(double protein) {
    this.protein = protein;
  }

  public double getFat() {
    return fat;
  }

  public void setFat(double fat) {
    this.fat = fat;
  }

  public double getCarbohydrates() {
    return carbohydrates;
  }

  public void setCarbohydrates(double carbohydrates) {
    this.carbohydrates = carbohydrates;
  }

  public boolean isOranic() {
    return isOranic;
  }

  public void setOranic(boolean isOranic) {
    this.isOranic = isOranic;
  }

  public boolean isVegetarian() {
    return isVegetarian;
  }

  public void setVegetarian(boolean isVegetarian) {
    this.isVegetarian = isVegetarian;
  }

  public boolean isGlutenFree() {
    return isGlutenFree;
  }

  public void setGlutenFree(boolean isGlutenFree) {
    this.isGlutenFree = isGlutenFree;
  }

  public boolean isVegan() {
    return isVegan;
  }

  public void setVegan(boolean isVegan) {
    this.isVegan = isVegan;
  }
  
  /* Static Methods */
  public static Food[] readFoodsFromCSV(String csvFilePath) {
    Scanner lineReader, lineCounter;
    File csv = new File(csvFilePath);
    try {
      lineCounter = new Scanner(csv);
      lineReader = new Scanner(csv);
    } catch (FileNotFoundException e) {
      // If the CSV file does not exist, we'll exit the program
      System.out.println(e.getMessage());
      System.exit(1);
      return null;
    }
    
    // First we'll see how many lines there are
    int foodsInFile = 0;
    while(lineCounter.hasNextLine()) {
      foodsInFile++;
      lineCounter.nextLine();
    }
    lineCounter.close();
    
    // Then we'll build our array
    Food[] menu = new Food[foodsInFile];
    int index = 0;
    while(lineReader.hasNextLine()) {
      String nextLine = lineReader.nextLine();
      Scanner columnReader = new Scanner(nextLine);
      columnReader.useDelimiter(","); // Since we're scanning a CSV
      Food food = new Food(
          columnReader.next(), // Seating
          columnReader.next()  // Name
      );
      food.setCalories(columnReader.nextDouble());
      food.setProtein(columnReader.nextDouble());
      food.setFat(columnReader.nextDouble());
      food.setCarbohydrates(columnReader.nextDouble());
      food.setOranic(columnReader.nextBoolean());
      food.setVegetarian(columnReader.nextBoolean());
      food.setGlutenFree(columnReader.nextBoolean());
      food.setVegan(columnReader.nextBoolean());
      menu[index++] = food;
    }
    lineReader.close();
    
    return menu;
  }
  
}
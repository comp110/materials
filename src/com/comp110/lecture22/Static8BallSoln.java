package com.comp110.lecture22;

class Static8Ball {

  static String[] answers = { "Yes","Maybe","No" };
  
  int answerIndex;

  void shake() {
    System.out.println("... shaking the 8 ball ...");
    this.answerIndex = (int)(Math.random() * Static8Ball.answers.length);
  }
  
  String getAnswer() {
    return Static8Ball.answers[this.answerIndex];
  }
  
}
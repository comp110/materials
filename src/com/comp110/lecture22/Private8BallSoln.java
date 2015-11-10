package com.comp110.lecture22;

class Private8Ball {

  private static String[] answers = { "Yes","Maybe","No", "Definitely" };
  
  private int answerIndex;

  Private8Ball() {
    this.shake();
  }
  
  public void shake() {
    System.out.println("... shaking the 8 ball ...");
    this.answerIndex = (int)(Math.random() * Private8Ball.answers.length);
  }
  
  public String getAnswer() {
    return Private8Ball.answers[this.answerIndex];
  }
  
  public static String[] getAnswers() {
    return Private8Ball.answers;
  }
  
}
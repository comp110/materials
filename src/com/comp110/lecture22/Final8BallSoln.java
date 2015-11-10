package com.comp110.lecture22;

public class Final8Ball {

  private static String[] answers = {
      "It is certain",
      "It is decidedly so",
      "Without a doubt",
      "Yes, definitely",
      "You may rely on it",
      "As I see it, yes",
      "Most likely",
      "Outlook good",
      "Yes",
      "Signs point to yes",
      "Reply hazy try again",
      "Ask again later",
      "Better not tell you now",
      "Cannot predict now",
      "Concentrate and ask again",
      "Don't count on it",
      "My reply is no",
      "My sources say no",
      "Outlook not so good",
      "Very doubtful"
  };
  
  private int answerIndex;
  
  public Final8Ball() {
    this.shake();
  }

  public void shake() {
    System.out.println("... shaking the 8 ball ...");
    this.answerIndex = (int)(Math.random() * Final8Ball.answers.length);
  }
  
  public String getAnswer() {
    return Final8Ball.answers[this.answerIndex];
  }
  
  public String toString() {
    return this.getAnswer();
  }
  
}
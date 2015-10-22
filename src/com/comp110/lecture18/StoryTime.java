package com.comp110.lecture18;

public class StoryTime {

  public static void main(String[] args) {
    heBeAllLike("METHODS ARE AWESOME!!! [heart-eyes-emoji]");
    awesomeHeSays();
    iConcur("Dayum. Methods really are awesome...");
  }
  
  static void awesomeHeSays() {
    iWasStraightUp("Zzzz... wait wtf. How'd we get here?!? I'm think I'm lost.");
    
    heSaid("We called the `awesome` method from `main` and the program jumped " +
           "to the `awesome` method's definition.");
    
    iSaid("Ooohhhh... up there on line 7! So we're in the definition now?");
    
    heSaid("Yes, but not for long! We need to talk about two kinds of methods.");
    
    theFirstKindOfMethodIsVoid();
    
    heSaid("Ah, yes, the second kind of method is way more fun!");
    String phoneNumber = theSecondKindOfMethodReturnsAValue();
    
    iAsked("That's pretty cool, but what good is that number up here?");
    
    heSaid("Not much, but we can use it to demo passing an argument, I guess");
    call(phoneNumber);
    
    heSaid("We can reuse methods with different arguments to generalize our code and make it reusable!");
    call("828-429-9500");
    
    iAsked("Haven't we been doing that this whole time with methods like `iAsked`");
    
    heBeAllLike("Yep. You're exactly right!");
  }
  
  static void theFirstKindOfMethodIsVoid() {
    heSaid("Still with me? Great!");
    heSaid("See the `void` keyword in front of the identifier up there?");
    heSaid("That means once the method is done running it won't return anything.");
    
    iAsked("Kinda like that time I met dream bae and didn't get their number?");
    
    heBeAllLike("YES. EXACTLY. Let me tell you a story...");
    storyAboutMeetingDreamBae();
    heSaid("So, as you can see, I didn't get her number. Nada. Void.");
    heSaid("Where were we?");
  }
  
  static void storyAboutMeetingDreamBae() {
    heDronedOn("blah blah blah");
    iThought("Can we get back to talking about methods old man?");
    heDronedOn("blah blah blah");
  }
  
  static String theSecondKindOfMethodReturnsAValue() {
    heSaid("See that `String` keyword? That means this method must return an `String` value!");
    
    heSaid("Let me use a hypothetical to demonstrate. So you're on Franklin for Halloween...");
    String number = askUniformedBaeForNumber();
    heSaid("They said: " + number);
    heSaid("Whoops. Be careful out there.");
    
    heSaid("Look, we can keep returning that number up the method call stack!");
    return number;
  }
  
  static String askUniformedBaeForNumber() {
    heSaid("Heeeeyyyyy, officer costume. Whatsss your nuuumberr?");
    return "911";
  }
  
  static void call(String digits) {
    heSaid("The argument we called this method with is assigned to the digits variable. See:");
    
    System.out.println("Calling " + digits);
    if(digits.equals("911")) {
      System.out.println("What's your emergency?");
    } else {
      heBeAllLike("I never pickup. Leave a message at the beep if my voicemail isn't full.");
      heBeAllLike("You know what... just e-mail me.");
    }
  }
  
  // Helper Methods Follow -- You can fairly safely ignore.
  
  static void heBeAllLike(String s) {
    System.out.println("Kris: " + s);
  }
  
  static void heSaid(String s) {
    heBeAllLike(s);
  }
  
  static void heDronedOn(String s){
    heSaid(s);
  }
  
  static void iWasStraightUp(String s) {
    System.out.println("Me: " + s);
  }
  
  static void iSaid(String s) {
    iWasStraightUp(s);
  }
  
  static void iAsked(String s) {
    iSaid(s);
  }
  
  static void iThought(String s) {
    iWasStraightUp(s);
  }
  
  static void iConcur(String s) {
    iThought(s);
  }
  
}
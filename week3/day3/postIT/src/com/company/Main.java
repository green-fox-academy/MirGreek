package com.company;

public class Main{


  public static void main(String[] args) {
    PostItClass postit1 = new PostItClass();
    postit1.backgroundColor = "Orange";
    postit1.text = "idea1";
    postit1.textColor = "blue";
    System.out.println(postit1.backgroundColor);

    PostItClass postit2 = new PostItClass();
    postit1.backgroundColor = "Pink";
    postit1.text = "Awesome";
    postit1.textColor = "back";

    PostItClass postit3 = new PostItClass();
    postit1.backgroundColor = "yellow";
    postit1.text = "Superb";
    postit1.textColor = "green";
  }

}
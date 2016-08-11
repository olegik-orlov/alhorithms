package com.olegorlov.java.algorithm;

public class Multiply {

  public static void main(String[] args) {

    final int a = 34;
    final int b = 378;
    
    final int resultCheck = a * b; 
    System.out.println("resultCheck = " + resultCheck + ";");

    final int resultLoop = multiplyLoop(a, b);
    System.out.println("resultLoop = " + resultLoop + ";");

    final int resultRecursion = multiplyRecursion(a, b);
    System.out.println("resultRecursion = " + resultRecursion + ";");
    
  }

  private static int multiplyRecursion(final int a, final int b) {
    if (b == 0) {
      return 0;
    } else if (b == 1) {
      return a;
    }
    return multiplyRecursion(a, b - 1) + a;
  }

  private static int multiplyLoop(final int a, final int b) {
    int c = 0;
    for (int i = 1; i <= b; i++) {
      c += a;
    }
    return c;
  }

}

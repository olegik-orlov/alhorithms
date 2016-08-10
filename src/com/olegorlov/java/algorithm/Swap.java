package com.olegorlov.java.algorithm;

public class Swap {

  public static void main(String[] args) {

    int a = 45;
    int b = 12;
/*    
    final int c;
    
    System.out.println("A = " + a + ";");
    System.out.println("B = " + b + ";");
    
    c = a;
    a = b;
    b = c;
*/
    System.out.println("A = " + a + ";");
    System.out.println("B = " + b + ";");
    
    a = a - b; // asum = a + b;
    b = a + b; // b = asum - b = a
    a = b - a; // a = asum - a
    
    System.out.println("A = " + a + ";");
    System.out.println("B = " + b + ";");
    
  }

}

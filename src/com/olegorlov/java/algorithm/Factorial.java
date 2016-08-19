package com.olegorlov.java.algorithm;

public class Factorial {

  public static void main(String[] args) {

    final int n = 10;
    
    final long factorialLoop = factorialLoop(n);
    System.out.println(n + "! = " + factorialLoop + " // by loop");
    
    final long factorialRecursion = factorialRecursion(n);
    System.out.println(n + "! = " + factorialRecursion + " // by recursion");
    
  }

  private static long factorialRecursion(int n) {
    if (n == 0) {
      return 1;
    }
    return factorialRecursion(n - 1) * n;
  }

  private static long factorialLoop(int n) {
    long result = 1;
    for (int i = 1; i <= n; i++) {
      result *= i;
    }
    return result;
  }

}

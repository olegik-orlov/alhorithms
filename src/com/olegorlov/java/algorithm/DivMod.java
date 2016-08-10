package com.olegorlov.java.algorithm;

public class DivMod {

  public static void main(String[] args) {

    final int a = 35;
    final int d = 5;

    int q = 0;
    int r = a;

    for (; r >= d; q++) {
      r -= d;
    }

    final int div = a / d;
    final int mod = a % d;

    System.out.println("DIV(частное) = " + div + ";");
    System.out.println("Q(частное) = " + q + ";");

    System.out.println("MOD(остаток) = " + mod + ";");
    System.out.println("R(остаток) = " + r + ";");
  }

}

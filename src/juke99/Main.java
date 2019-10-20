package juke99;

import juke99.JAscii;

public class Main {
  public static void main(String[] args) {
    JAscii ascii = new JAscii();
    
    System.out.println(ascii.equalsIgnoreCase("hello", "umei"));
    System.out.println(ascii.equalsIgnoreCase("uma", "uma"));
  }
}
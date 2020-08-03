package com.java8.tutorials;

import java.util.Arrays;

public class CheckPermutation {
  public static void main(String[] args) {
    //check if two string are permutation.
    //Mehthod 1 - sort them , compare the length.

    String str1 = "abcd";
    String str2 = "cdbes";

    String str1Sorted = sort(str1);
    String str2Sorted = sort(str2);

    boolean isPermutated = checkPermutation(str1Sorted,str2Sorted);
    System.out.println(isPermutated);

  }

  static String sort(String str){
    char[] chars = str.toCharArray();
    Arrays.sort(chars);
    return  new String(chars);

  }

  static  boolean checkPermutation(String str1Sorted,String str2Sorted){
    return  ((str1Sorted.length() == str2Sorted.length()) && (str1Sorted.equals(str2Sorted)));
  }

}

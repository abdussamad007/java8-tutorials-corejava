package com.java8.tutorials;

public class StringUniqueChar {
  public static void main(String[] args) {
      String str= "abccd";
      boolean isUnique = checkUnique(str);
      System.out.println(isUnique);
  }

  public static  boolean checkUnique(String  str){
    if (str.length() > 128)
      return false;
    boolean[] char_set = new boolean[128];
    for (char c:str.toCharArray()) {
       if(char_set[c])
         return  false;
       char_set[c] = true;
    }

  return true;

  }
}

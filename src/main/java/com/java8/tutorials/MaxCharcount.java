package com.java8.tutorials;

public class MaxCharcount {

  public static void main(String[] args) {

    String S = "aaaadddddddddff11111111111gghhhjtredccbbnnaaa";
    char[] array = S.toCharArray();
    int count = 1;
    int max = 0;
    char maxChar = '0';
    for (int i = 0; i < S.length()-1; i++)
    {
      String stringleft =S.replaceAll(Character.toString(array[i]),"");
      System.out.println(stringleft + "--" + stringleft.length());
      int countleft = S.length() - stringleft.length();
      count = countleft;
      if (count > max)
      {  // Record current run length, is it the maximum?
        max = count;
        maxChar = array[i];
      }
    }

    System.out.println("Longest run: "+max+", for the character "+maxChar);



    /*
    String s = "aaaaddddffgghhhjtredccbbnnaaa";
    int count =1;
    int max = 1;
    char maxChar = s.charAt(1);
    for (int i=1;i<s.length();i++){
      count = (s.charAt(i)==s.charAt(i-1))?(count+1):1;
      if (count>max){
        max=count;
        maxChar = s.charAt(i);
      }
    }

    System.out.println("Longest run: "+max+", for the character "+maxChar);
*/
  }
}

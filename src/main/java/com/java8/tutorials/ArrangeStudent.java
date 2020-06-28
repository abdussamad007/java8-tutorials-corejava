package com.java8.tutorials;

public class ArrangeStudent {
  public static void main(String[] args) {

    int[] a = {1,2};
    int[] b = {3,4};
    int[] c = new int[a.length+b.length];
    int j=0;
    for (int i=0;i<a.length;i++){
      if (b[0]>=a[0]){
          c[j++]=a[i];
          c[j++]=b[i];
      }else {
        c[j++]=b[i];
        c[j++]=a[i];

    }
  }
    boolean isAscending = true;
    for(int x=0;x<c.length-1;x++){
      if(!(c[x]<=c[x+1])){
        isAscending = false;
        break;
      }
    }
    if(isAscending)
      System.out.print("YES");
    else
      System.out.print("YES");

  }
}

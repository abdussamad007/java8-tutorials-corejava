package com.java8.tutorials;

import java.io.Serializable;

public class SeralizatioExample {
  public static void main(String[] args) {

   int[] a = {1,3,4};
   int[] b = {2,3,5};
   int[] c = new int[a.length+b.length];
   int j=0;
   int y=0;
   for (int i=0;i<a.length;i++){
     if (b[i]>=a[i]){
       if(y<=a[i]){
         c[j++]=a[i];
         c[j++]=b[i];
       }

     }

   }
   for(int x=0;x<c.length;x++)
   System.out.println(c[x]);

  }
}


class  Demo implements Serializable{

  public int a;
  public String b;

  public Demo() {
  }

  public Demo(int a, String b) {
    this.a = a;
    this.b = b;
  }




}

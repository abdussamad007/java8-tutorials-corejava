package com.java8.tutorials;

public class LabmdaExpressionFundamental {
  public static void main(String[] args) {
    Dog boi = new Dog("boi",30,6);
    Dog clover = new Dog("clover",35,12);

    //classic way to write
    /*Dog.Dogqueries dq = new Dog.Dogqueries() {
      @Override
      public boolean test(Dog d) {
        return d.getAge() > 9;
      }
    };*/

    // System.out.println("Boi " + dq.test(boi));

    //using Lambda
    Dog.Dogqueries dq1 = d -> d.getAge() > 9;


    System.out.println("Clover " + dq1.test(clover));

  }
}

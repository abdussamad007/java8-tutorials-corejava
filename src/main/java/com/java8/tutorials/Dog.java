package com.java8.tutorials;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Dog {

  String name;
  int weight;
  int age;

  interface  Dogqueries{
    public boolean test(Dog d);
  }

}

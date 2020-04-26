package com.java8.tutorials;

import java.util.function.Predicate;

/**
 * Simple Predicate Example.
 * Predicate<T> is a functional Interface in Java 1.8, It improves manageability of code.
 * Some example: https://www.geeksforgeeks.org/java-8-predicate-with-examples/
 * API : https://docs.oracle.com/javase/8/docs/api/index.html?java/util/function/Predicate.html
 */
public class PredicateExample {
  public static void main(String[] args) {
    // Creating predicate
    Predicate<Integer> lesserthan = i -> (i < 18);

    // Calling Predicate method
    System.out.println(lesserthan.test(10));
  }
}

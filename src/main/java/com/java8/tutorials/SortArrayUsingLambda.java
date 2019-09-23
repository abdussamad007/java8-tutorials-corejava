package com.java8.tutorials;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Hello world!
 *
 */
public class SortArrayUsingLambda 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
    	String[] arrStr= {"Ram","Shyam","Jodhu","Modhu","Rahim","Anitha","Bhabesh"};
    	
		// Style -1  Using comparator
    	/* 
		  Arrays.sort(arrStr, new Comparator<String>() { public int compare(String
		  s1,String s2) { return s1.compareTo(s2); } });
		  
		  System.out.println(Arrays.toString(arrStr));
		 */
    	
    	// Style -2 - Using Lambdaexpression 1
    	/*
		  Comparator<String> empNameComparator = (String s1, String s2) -> { return
		  (s1.compareTo(s2)); };
		 */
    	
    	// Style -2  - Using Lambdaexpression 2
    	    Comparator<String> empNameComparator = (s1, s2) -> {
      	      return (s1.compareTo(s2));
      	    };
      	    
    	    
    	    Arrays.sort(arrStr, empNameComparator);
    	    System.out.println(Arrays.toString(arrStr));
    	    //employeeList.forEach(System.out::println);
    	
    }
}

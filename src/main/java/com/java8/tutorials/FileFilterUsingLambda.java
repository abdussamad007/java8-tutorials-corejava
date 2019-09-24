package com.java8.tutorials;

import java.io.File;
import java.io.FileFilter;

/**
 * This Class is used to implement the filefilter using Lambda and Functional Interfaces. 
 * @author abdus
 *
 */
public class FileFilterUsingLambda {
  public static void main(String[] args) {
	File dir = new File("/home/abdus/election");
	File[] subDir = dir.listFiles(new FileFilter() {
		
		@Override
		public boolean accept(File pathname) {
			// TODO Auto-generated method stub
			return pathname.isDirectory();
		}
	});
	
	System.out.println("-------------Using anonymous class------------");
	for (File file : subDir) {
		System.out.println("'"+file.getName()+"'" + " is a dirctory");
	}
	
	System.out.println("-------------Using Lambda Expression------------");
	File[] subDirUsingLambda = dir.listFiles(f -> {return f.isDirectory();});
	
	for (File file : subDirUsingLambda) {
		System.out.println("'"+file.getName()+"'" + " is a dirctory");
	}
	
	System.out.println("-------------Using Lambda Expression , Filter files based on Filename------------");
	
	File[] listFiles = dir.listFiles(f->{return f.getName().endsWith(".json");});
	
	for (File file : listFiles) {
		System.out.println("'"+file.getName()+"'" + " is a file");
	}
	
	
}
}

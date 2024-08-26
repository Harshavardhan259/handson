package com.demo.utils;

public class StringDemo2 {

	public static void main(String[] args) {
		String sample="this is a basic java class as we are advised to learn java in our class";
		//1
		System.out.println("lenght of sample:"+sample.length());
		
		//3
		System.out.println(" "+sample.substring(sample.indexOf("class"), sample.lastIndexOf("java")));
		//4
		System.out.println("lenght of sample:"+sample.toLowerCase());
		
		//6
        char[] ch = new char[sample.length()];
  
        for (int i = 0; i < sample.length(); i++) {
            ch[i] = sample.charAt(i);
            
        }
        for (int i = 0; i < sample.length(); i++) {
            
        	System.out.println(ch[i]);
        }
        
        //5
        String[] splitString = sample.split( " " );

        for ( String s : splitString ) 
        {
            System.out.println( s );
        }
        
        
  
        System.out.println("lenght of sample:"+sample.trim().toCharArray());
	}

}

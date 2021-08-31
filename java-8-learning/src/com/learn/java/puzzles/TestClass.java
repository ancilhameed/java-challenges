
package com.learn.java.puzzles;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

class TestClass {
    public static void main(String args[] ) throws Exception {
       
    	/**
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in) );
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

		**/
        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

       int i = Integer.numberOfTrailingZeros(1920000);
System.out.println("Number of trailing zeroes are ::"+i);
    }
}

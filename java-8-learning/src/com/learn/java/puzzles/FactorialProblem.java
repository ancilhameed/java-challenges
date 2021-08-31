package com.learn.java.puzzles;

public class FactorialProblem {

    public static void main(String[] args) {
        int num = 12;
        long factorial = findFactorial(num);
        System.out.println("Factorial of " + num + " = " + factorial);
        
        System.out.format("%03d\n", factorial);
		/*
		 * StringBuffer s = new StringBuffer(String.valueOf(factorial)); s =
		 * s.reverse(); Integer i = new Integer(s.toString()); s = new
		 * StringBuffer(String.valueOf(1)); i = new Integer(s.toString());
		 */        
     
    }
    public static long findFactorial(int num)
    {
        if (num >= 1) {
        	System.out.println("Number for factorial is :: "+num);
            return num * findFactorial(num - 1);
        }
        else
            return 1;
    }
}
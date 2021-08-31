package com.learn.java.puzzles;


import java.io.*;
import java.util.Scanner;
import java.lang.Math;

public class ThreeDigit{
	
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(in.readLine());

        long p52 = 0, rest = 1;
        for (int i = 2; i <= input; i++)
        {
            int j = i;
            while (j % 2 == 0)
            {
                System.out.println("BEFORE :: TWO Modulo  :: "+j);
                j /= 2;
                System.out.println("AFTER :: TWO Modulo :: "+j);
                p52++;
            }
            while (j % 5 == 0)
            {
            	System.out.println("BEFORE :: FIVE Modulo ::"+j);

                j /= 5;
            	System.out.println("AFTER :: FIVE Modulo ::"+j);

                p52--;
            }
        	System.out.println("REST and J is : "+rest +" "+j);

            rest = rest * j % 1000;
            
        	System.out.println("REST is : "+rest);
        	System.out.println("P52 is : "+p52);


        }

        for (int i = 0; i < p52; i++) {
        	
        	System.out.println("Inside another loop REST  is : "+rest);

            rest = rest * 2 % 1000;
        }
        if (input <= 6)
            System.out.println(rest);
        else
        {
        	System.out.println("Final REST  is : "+rest);

            System.out.format("%03d\n", rest);
        }
    }
}

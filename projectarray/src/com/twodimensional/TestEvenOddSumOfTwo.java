package com.twodimensional;

import java.util.Scanner ;

public class TestEvenOddSumOfTwo {

	int[][] input()
	{
	
		int [][] a= new int[2][2];
		
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i <a.length; i++) 
        {
           
            for (int j= 0; j <a.length; j++) 

            	{
            		a[i][j] = sc.nextInt();
            	}
        }
        return a;
	}
	
    // Function to calculate the sum of even and odd numbers in an array
     void calculateSum(int a[] []) 
     {
        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i <a.length; i++) 
        {
           
            for (int j= 0; j <a.length; j++) 
        {
            	if(a[i][j]%2==0)
            	{
                    evenSum = evenSum + a[i][j];

            	}
            	else
            	{
                    oddSum = oddSum + a[i][j];

            	}
        }
        }

        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);
    }

    public static void main(String[] args)
    {
    	
    	TestEvenOddSumOfTwo ob =new TestEvenOddSumOfTwo ();
    	
    	int [][] sum =ob.input();
    	ob. calculateSum(sum);
    	
    }
}
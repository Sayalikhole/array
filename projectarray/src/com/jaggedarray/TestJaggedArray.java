package com.jaggedarray;

import java.util.Scanner;

public class TestJaggedArray {

	public static void main(String[] args) {

		int[][] a = new int[3][];
		 a[0]=new int[2]; //new runtime allocate 
		 a[1]=new int[3];
		 a[2]=new int[2];
		 
		Scanner sc = new Scanner(System.in);
			
		System.out.println("Enter elements of array");
			
		for(int  i=0 ; i<a.length;i++) //length gives size of array
		{
				for(int  j=0 ; j<a[i].length;j++) 

				{
					
					a[i][j]=sc.nextInt();
				}
		}

		
	System.out.println("Display array");
	
	for(int  i=0 ; i<a.length;i++) //length gives size of array
	{
		for(int  j=0 ; j<a[i].length;j++) 

		{
			
			System.out.print(a[i][j]+"\t");
		}
		System.out.println();
	
	}

	}
}

// direct initialization of 2d array .

/*package com.twodimensional;

import java.util.Scanner;

public class TestTwoArray {

	public static void main(String[] args) {

	      Scanner sc = new Scanner(System.in);

		int a[][]= {
				{4,5},
				{6,7},
				{7,8}
				};
		
		System.out.println("rows are  "+a.length);
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

}*/

//initialization from user in 2d array .

/*package com.twodimensional;

import java.util.Scanner;

public class TestTwoArray {

	public static void main(String[] args) {

	      Scanner sc = new Scanner(System.in);

		int a[][]=new int[3][3];
		
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
			for(int  j=0 ; j<a.length;j++) 

			{
				
				System.out.print(a[i][j]+"\t");
		}
			System.out.println();
		
		}
	}

*/

// using input function / method

/*package com.twodimensional;

import java.util.Scanner;

public class TestTwoArray {
	
	int[][] input()
	{
		Scanner sc = new Scanner(System.in);

		int a[][]=new int[2][2];
		
		System.out.println("Enter elements of array");
		
		for(int  i=0 ; i<a.length;i++) //length gives size of array
		{
			for(int  j=0 ; j<a[i].length;j++) 

			{
				
				a[i][j]=sc.nextInt();
			}
		}
		return a;
	}
	

	public static void main(String[] args) {
		
		TestTwoArray ob = new TestTwoArray();
		
		int [][]a=ob.input();
		
		System.out.println("Display array");
		
		for(int  i=0 ; i<a.length;i++) //length gives size of array
		{
			for(int  j=0 ; j<a.length;j++) 

			{
				
				System.out.print(a[i][j]+"\t");
		}
			System.out.println();
		
		}
	   
	}
}*/

// using input and display function / method

/*package com.twodimensional;

import java.util.Scanner;

public class TestTwoArray
{
	
	int[][] input()
	{
		Scanner sc = new Scanner(System.in);

		int a[][]=new int[2][2];
		
		System.out.println("Enter elements of array");
		
		for(int  i=0 ; i<a.length;i++) //length gives size of array
		{
			for(int  j=0 ; j<a[i].length;j++) 

			{
				
				a[i][j]=sc.nextInt();
			}
		}
		return a;
	}
	
	
	void display(int[][]a)
	{
		System.out.println("Display array");
		
		for(int  i=0 ; i<a.length;i++) //length gives size of array
		{
			for(int  j=0 ; j<a.length;j++) 

			{
				
				System.out.print(a[i][j]+"\t");
		}
			System.out.println();
		
		}
	   
	}

	
	public static void main(String[] args)
	{
		
		TestTwoArray ob = new TestTwoArray();
		
		int [][]a=ob.input();
		ob.display(a);
		
	}
}*/


// sum of 2d array

package com.twodimensional;

import java.util.Scanner;

public class TestTwoArray
{
	
	int[][] input()
	{
		Scanner sc = new Scanner(System.in);

		int a[][]=new int[2][2];
		
		System.out.println("Enter elements of array");
		
		for(int  i=0 ; i<a.length;i++) //length gives size of array
		{
			for(int  j=0 ; j<a[i].length;j++) 

			{
				
				a[i][j]=sc.nextInt();
			}
		}
		return a;
	}
	
	
	void display(int[][]a)
	{
		System.out.println("Display array");
		
		for(int  i=0 ; i<a.length;i++) //length gives size of array
		{
			for(int  j=0 ; j<a.length;j++) 

			{
				
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		
		}
	   
	}
	
	
	int add(int[][]a)
	{

		int sum=0;
		for(int  i=0 ; i<a.length;i++) //length gives size of array
		{
			for(int  j=0 ; j<a.length;j++) 

			{
				
				sum=sum+a[i][j];

			}

		}
		System.out.println("sum is "+sum);

		return sum;
	}

	
	public static void main(String[] args)
	{
		
		TestTwoArray ob = new TestTwoArray();
		
		int [][]a=ob.input();
		ob.display(a);
		ob.add(a);

	}
}










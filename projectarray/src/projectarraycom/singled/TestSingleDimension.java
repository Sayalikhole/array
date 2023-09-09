package projectarraycom.singled;

import java.util.Scanner;

//1.create object using literals
//2.create object using new keyword

public class TestSingleDimension {

	public static void main(String[] args) {
	

		/*int marks[]= {80,60,40,30};//1.create object using literals

		for(int i=0 ; i<marks.length;i++) //length gives size of array

		{
			System.out.println(marks[i]);
		}
	}

}*/
		
		
		/*int size;//declaring size of array
		System.out.println("Enter size of  array");
		size=new Scanner(System.in).nextInt();	
		
		
		//(SYNTAX for declare array: "datatype varname = new datatype")

		
		int []marks= new int[size];//2.create object using new keyword  
		System.out.println("Enter elements of array");
		
		for(int i=0 ; i<marks.length;i++) //length gives size of array
		{
			marks[i]=new Scanner(System.in).nextInt();	//input from user
		}
		
		System.out.println("display elements of array");

		for(int i=0 ; i<marks.length;i++) 
		{
			System.out.println(" "+marks[i]);

		}
	}
}*/
		
		
		
		Scanner sc = new Scanner(System.in);
	
		/*char s[]=  new char[3];
		System.out.println("Enter elements of array");
		for(int i=0 ; i<s.length;i++) //length gives size of array
		{
			s[i]=sc.next().charAt(0);	//input from user
		}
		
		System.out.println("display elements of array");

		for(int i=0 ; i<s.length;i++) 
		{
			System.out.println(" "+s[i]);

		}
	}
}*/
		
		
/*WAP to check whether given character is vowel or consonant
		
		
		char ch[]=  new char[5];
		System.out.println("Enter elements of array");
		for(int i=0 ; i<ch.length;i++) //length gives size of array
		{
			ch[i]=sc.next().charAt(0);	//input from user
		}
		
		System.out.println("display elements of array");

		for(int i=0 ; i<ch.length;i++) 
		{
			System.out.println(" "+ch[i]);

		}
		
		
		for(int i=0 ; i<ch.length;i++) 
		{
		if(ch[i]=='a'|| ch[i]=='e' || ch[i]=='i'|| ch[i]=='o'|| ch[i]=='u'|| ch[i]=='A'|| ch[i]=='E'|| ch[i]=='I'|| ch[i]=='O'|| ch[i]=='U')
		{
			
			System.out.println(ch[i]+" its vowel ");
			
		}
		else if((ch[i]>='a' && ch[i]<='z')|| (ch[i]>='A' && ch[i]<='Z'))
		{
			System.out.println(ch[i]+" its consonant ");
		
		}
		else
		{
			System.out.println(ch[i]+" invalid input ");

		}
	}
}
}*/
		
/* INPUT AND DISPLAY USING FUNCTION	
		int[] input()
		{
			
			int size;//declaring size of array
			System.out.println("Enter size of  array");
			size=new Scanner(System.in).nextInt();
			
			int []marks= new int[size];//2.create object using new keyword  
			System.out.println("Enter elements of array");
			
			for(int i=0 ; i<marks.length;i++) //length gives size of array
			{
				marks[i]=new Scanner(System.in).nextInt();	//input from user
			}
			

			
			return marks;
		}
		
		public void display(int m[])
		{
			System.out.println("display elements of array");

		
			for(int i=0 ; i<m.length;i++) 
			{
				System.out.println(" "+m[i]);

			}
		}
		
		public static void main(String[] args) {
		
			TestSingleDimension ob=new TestSingleDimension();
			
			int [] marks=ob.input();
			
			ob.display(marks);
		}
}*/
		

		/*char [] input()
		{
		int size;//declaring size of array
		System.out.println("Enter size of  array");
		size=new Scanner(System.in).nextInt();
		
		char c[]=  new char[size];
		System.out.println("Enter elements of array");
		for(int i=0 ; i<c.length;i++) //length gives size of array
		{
			c[i]=sc.next().charAt(0);	//input from user
		}
		
		return c;
	}
		
		public void display(char ch[])
		{
			System.out.println("display elements of array");

			for(int i=0 ; i<ch.length;i++) 
			{
				System.out.println(" "+ch[i]);

			}
			
	}
		
		
		void find(char ch[])
		{
			for(int i=0 ; i<ch.length;i++) 
			{
			if(ch[i]=='a'|| ch[i]=='e' || ch[i]=='i'|| ch[i]=='o'|| ch[i]=='u'|| ch[i]=='A'|| ch[i]=='E'|| ch[i]=='I'|| ch[i]=='O'|| ch[i]=='U')
			{
				
				System.out.println(ch[i]+" its vowel ");
				
			}
			else if((ch[i]>='a' && ch[i]<='z')|| (ch[i]>='A' && ch[i]<='Z'))
			{
				System.out.println(ch[i]+" its consonant ");
			
			}
			else
			{
				System.out.println(ch[i]+" invalid input ");

			}
		}
		}
		public static void main(String[] args) {
			
			TestSingleDimension ob=new TestSingleDimension();
			
			char [] cr=ob.input();
			
			ob.display(cr);
			ob.find(cr);
		}
		
}*/	

		
		int i,n;
		int flag=0;
		int []a =new int[5];
		System.out.println("Enter elements of array");
		for( i=0 ; i<a.length;i++) //length gives size of array
		{
			a[i]=sc.nextInt();	
		}
		
		System.out.println("Enter the no that you want to find");
		n=sc.nextInt();
		for(i=0;i<a.length;i++)
		{
			if(n==a[i])
			{
				flag=1;
				break;
			}
			
		}
		if(flag==1)
		{
			System.out.println("number found");

		}
		else 
		{
			System.out.println("number not found");
		}
	}
}

		


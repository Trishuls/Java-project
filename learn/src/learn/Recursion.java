package learn;

import java.util.Scanner;

public class Recursion {
//	static int i = 1;
//	static void recursion()
//	{
//		if(i<=100)
//		{
//			System.out.println(i);
//			++i;
//			recursion();
//			
//		}
//	}
public static void main(String args[])
{
//	recursion();
	System.out.println("Enter value");
	Scanner s = new Scanner(System.in);
	int a = s.nextInt();
	
	if(a>1 && a<100)
	{
		if(a>=2 && a<=5)
		{
			System.out.println("Not Wired");
		}
		else if(a>=6 && a<=20)
		{
			System.out.println("Wired");
		}
		else
		{
			System.out.println("Not Wired");
		}
	}
	
}
}

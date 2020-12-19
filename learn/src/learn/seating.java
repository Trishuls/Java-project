package learn;

import java.util.Scanner;

public class seating {

	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		
		int a;
		
		System.out.println("Enter number of inputs");
		
		a = s.nextInt();
		
		int[] row = new int[a];
		
		System.out.println("Enter inputs");
		
		for(int i = 0; i < row.length; i++)
		{
			row[i]=s.nextInt();
		}
		
		System.out.println("The seating arangement is");
		
		for(int i = 0; i < row.length; i++)
		{
			System.out.println(row[i]);
		}
		
		System.out.println("Enter the system which is poped!");
		
		int remove = s.nextInt();
		
		remove -= 1;
		
		row[remove] = 0;
		
		System.out.println("The seating arangement after removing");
	
		for(int i = 0; i < row.length; i++)
		{
			System.out.println(row[i]);
		}
		
		for(int i = 0; i < row.length; i++)
		{
			if(row[i] == 0)
			{
				i += 1;
				System.out.println("The available seat is at "+i);
				break;
			}
			else		
			{
				continue;
			}
		}
	}

}

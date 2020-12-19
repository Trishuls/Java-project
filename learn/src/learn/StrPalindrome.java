package learn;

import java.util.Scanner;

public class StrPalindrome {

	private static boolean isPalindrome(String str) {
		int i=0;
		int j = str.length()-1;
		
		while(i<j)
		{
			if(str.charAt(i) != str.charAt(j))
			{
				return false;
			}
			i++;
			j--;
		}	
		
			return true;
	}
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = s.nextLine();
		if(isPalindrome(str))
			System.out.println("palindrome");
		else
			System.out.println("Not palindrome");
	}
}

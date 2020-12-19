package learn;

public class Palindrome {
	public static void main(String[] args)
	{
		int n = 454;
		
		int r = 0;
		int temp = n;
		int sum = 0;
		
		while(n>0)
		{
			r = n%10;
			n=n/10;
			sum = (sum*10)+r;
		}
		
		if(temp == sum)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}
	}
}

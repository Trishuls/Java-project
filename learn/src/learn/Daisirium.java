package learn;

public class Daisirium {

	public static void main(String[] args) {
		int number = 175;
		int r=0;
		int sum=0;
		int temp = number;
		String s = Integer.toString(number);
		int len = s.length();
		while(number > 0)
		{
			r = number%10;
			number = number/10;
			sum = sum+(int)Math.pow(r, len);
			len--;
//			System.out.println(sum);
		}
		if(temp == sum)
		{
			System.out.println("True");
		}
		else
			System.out.println("False");
	}

}

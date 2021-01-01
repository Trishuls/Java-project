package learn;

public class Daizerium {

	public static void main(String[] args) {
		
		int num = 175;
		int temp = num;
		int sum = 0;
		int r;
		String val = Integer.toString(num);
		int len = val.length();
		
		while(num>0)
		{
			r = num%10;
			num = num/10;
			sum = (int) (sum+Math.pow(r, len));
			len--;
		}
		if(temp == sum)
			System.out.println("Daiserian number");
		else
			System.out.println("Not Daiserian number");
	}

}

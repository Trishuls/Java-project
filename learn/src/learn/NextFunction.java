package learn;

import java.util.Scanner;

public class NextFunction {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter");
		int a = s.nextInt();
		double d = s.nextDouble();
//		String str = s.nextLine();
		String st = s.next();
		
		System.out.println("String : "+st);
		System.out.println("double : "+d);
		System.out.println("Integer : "+a);
	}

}

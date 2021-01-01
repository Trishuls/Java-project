package learn;

import java.util.ArrayList;
import java.util.Scanner;

public class HackerRank {

	public static void main(String[] args) {	
		Scanner sc=new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>();
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int len = s1.length();
            int x=sc.nextInt();
            String str = Integer.toString(x);
            if(str.length()<=2)
            {
            	str = String.format("%03d", x);
            }
            for(int j=0;j<16-len;j++)
            {
            	s1 = s1.concat(" ");
            }
            s1 = s1.concat(str);
            list.add(s1);
        }
        for(String val:list)
        	System.out.println(val);
        System.out.println("================================");
	}

}

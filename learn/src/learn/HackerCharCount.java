package learn;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HackerCharCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		String str1 = sc.nextLine();
		StringBuilder str = new StringBuilder();
		str.append(str1);
		System.out.println("Enter length");
		int len = sc.nextInt();
		for(int i=1;i<=len;i++)
		{
			str.append(str1);
		}
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='a')
			{
				if(hm.containsKey(Character.toString(str.charAt(i))))
				{
					count = hm.get(Character.toString(str.charAt(i)));
					hm.put(Character.toString(str.charAt(i)), count+1);
				}
				else
					hm.put(Character.toString(str.charAt(i)), 1);
			}
			else
				continue;
		}
		for(Map.Entry<String,Integer> m: hm.entrySet())
			System.out.println(m.getKey()+" = "+m.getValue());
		sc.close();
	}
}

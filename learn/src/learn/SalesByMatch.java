package learn;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SalesByMatch {

	public static void main(String[] args) {
//		ArrayList<Integer> list = new ArrayList<Integer>();
//		list.add(1);
//		list.add(1);
//		list.add(2);
//		list.add(2);
//		list.add(1);
//		list.add(1);
//		list.add(1);
//		list.add(10);
//		list.add(10);
		int list[] = {1,1,2,2,1,1,1,10,10};
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		int count = 0;
		for(int i: list)
		{
			if(hm.containsKey(i))
			{
				count =hm.get(i);
				hm.put(i, count+1);
			}
				
			else
				hm.put(i, 1);
		}
		int rem;
		int count1 = 0;
		for(Map.Entry m : hm.entrySet())
		{
//			System.out.println(m.getKey()+" "+m.getValue());
			int val = (int)m.getValue();
			if(val/2 > 0)
			{
				rem = val/2;
//				System.out.println(m.getKey()+" = "+rem+" pairs");
				count1 +=rem;
			}
			else
				continue;
//				System.out.println(m.getKey()+" -> odd sock");
			
		}
		System.out.println(count1+" pairs of socks");
	}

}

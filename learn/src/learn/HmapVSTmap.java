package learn;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class HmapVSTmap {

	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
		
		hm.put(11,"Hanuman");
		hm.put(13,"Hanuman");
		hm.put(5,"Hanuman");
		hm.put(7,"Hanuman");
		hm.put(19,"Hanuman");
		hm.put(1,"Trishul");
		
		tm.put(5, "Trishul");
		tm.put(25, "Trishul");
		tm.put(15, "Trishul");
		tm.put(45, "Trishul");
		tm.put(55, "Trishul");
		tm.put(35, "Trishul");
		
		System.out.println("Hash map");
		Iterator itr = hm.entrySet().iterator();
		while(itr.hasNext())
		{
			Map.Entry<Integer, String> hmap = (Entry<Integer, String>) itr.next();
			System.out.println(hmap.getKey()+" : "+hmap.getValue());
		}
		
		System.out.println();
		System.out.println("Tree map");
		Iterator itr1 = tm.entrySet().iterator();
		while(itr1.hasNext())
		{
			Map.Entry<Integer, String> tmap = (Entry<Integer, String>) itr1.next();
			System.out.println(tmap.getKey()+" : "+tmap.getValue());
		}
		
		System.out.println();
		System.out.println("For each");
		hm.forEach((k,v)-> System.out.println(k+" : "+v));
	}

}

package learn;

import java.util.Comparator;

public class RollnoComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Student s1=(Student)o1;  
		Student s2=(Student)o2;
		if(s1.rollno==s2.rollno)  
		return 0;  
		else if(s1.rollno>s2.rollno)  
		return 1;  
		else  
		return -1;  
	}
	
}

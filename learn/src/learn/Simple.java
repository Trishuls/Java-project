package learn;

import java.util.ArrayList;
import java.util.Collections;

public class Simple {

	public static void main(String[] args) {
		ArrayList<Student> al=new ArrayList<Student>();  
		al.add(new Student(101,23,"Vijay"));  
		al.add(new Student(106,27,"Ajay"));  
		al.add(new Student(105,21,"Jai"));  
		  
		System.out.println("Sorting by Name");  
		  
		Collections.sort(al,new NameComparator());  
		for(Student st: al){  
		System.out.println(st.rollno+" "+st.name+" "+st.age);  
		}  
		  
		System.out.println("Sorting by age");  
		  
		Collections.sort(al,new AgeComparator());  
		for(Student st: al){  
		System.out.println(st.rollno+" "+st.name+" "+st.age);  
		}  
		
		System.out.println("Sorting by rollno");
		Collections.sort(al, new RollnoComparator());
		for(Student st:al)
		{
			System.out.println(st.rollno+" "+st.name+" "+st.age);
		}
	}

}

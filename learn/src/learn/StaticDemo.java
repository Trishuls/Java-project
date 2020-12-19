package learn;

public class StaticDemo {

	int rollno;
	String name;
	static String coll = "MIT";
	
	static void collegename()
	{
		coll = "ATME";
	}
	
	void display(){System.out.println(rollno+" "+name+" "+coll);}  
	
	public StaticDemo(int rollno, String name) {
		this.rollno = rollno;
		this.name = name;
	}

	public static void main(String[] args) {
		//should invoke to call static method
		StaticDemo.collegename();
		
		StaticDemo s1 = new StaticDemo(1, "Trishul");
		StaticDemo s2 = new StaticDemo(2, "Avinash");
		StaticDemo s3 = new StaticDemo(3, "Rudresh");
		s1.display();
		s2.display();
		s3.display();
	}

}

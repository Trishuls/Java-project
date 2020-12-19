package learn;

public class Singleton {

	public static void main(String argn[])
	{
		Demos s = Demos.getObject();
		System.out.println(s);
	}
	
}
class Demos{
	static Demos s1;

	private Demos() {
//		super();
//		this.s1 = s1;
	}
	public static Demos getObject()
	{
		System.out.println("This is object");
		return s1;
	}
}

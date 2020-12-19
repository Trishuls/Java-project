package learn;

public class Enumerations {

	enum Colors{
		RED(5),BLUE(10),CYAN(15),ORANGE(20),GREEN(25),WHITW(30),YELLOW(35);

		public int value;
		Colors(int value) {
			this.value = value;
		}
	}
	
	public static void main(String[] args) {
		for (Colors c : Colors.values())
		{
			System.out.println(c+" "+c.value);
		}
		
		System.out.println("value of CYAN is : "+Colors.valueOf("CYAN"));
		System.out.println("index of CYAN is : "+Colors.valueOf("RED").ordinal());
		System.out.println("index of CYAN is : "+Colors.valueOf("CYAN").ordinal());
	}

}

package learn;

public class CheckImmutable {

	public static void main(String[] args) {

		String str = "Demo";
		str =str.concat("Trishul");       
		
		System.out.println(str);
		System.out.println(str.equals(str));
	}

}

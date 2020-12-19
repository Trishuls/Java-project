package learn;


public class InheritanceDemo {

		public int z;
		
		public void add(int a, int b) {
			z = a+b;
			System.out.println(z);
		}
}
	
	class operation extends InheritanceDemo{
		public void multiply(int x, int y) {
			
			z = x*y;
			System.out.println(z);		}
	}


class mains{
public static void main(String[] args) {
		
		operation op = new operation();
		op.add(10, 20);
		op.multiply(10, 20);
	}

}

package learn;

public class stringBuff {

	public static void main(String[] args) {
 
//			StringBuffer sb=new StringBuffer("Hello ");
//			System.out.println(sb.capacity());
//			sb.insert(6,"Java");//now original string is changed  
//			sb.reverse();
//			System.out.println(sb.length());
//			System.out.println(sb);//prints HJavaello  
			
			StringBuilder builder  = new StringBuilder();
			builder.append("Trishul");
			builder.length();
			System.out.println(builder.length());
			int ov = 0;
			int con = 0;
			
			for(int i=0;i<builder.length();i++)
			{
				if(builder.charAt(i) == 'A' || builder.charAt(i) == 'a' || builder.charAt(i) == 'E' || builder.charAt(i) == 'e' || builder.charAt(i) == 'I' || builder.charAt(i) == 'i' || builder.charAt(i) == 'O' || builder.charAt(i) == 'o' || builder.charAt(i) == 'U' || builder.charAt(i) == 'u')
					++ov;
				else
					++con;
			}
			
			System.out.println(ov+" "+con);
	}
}

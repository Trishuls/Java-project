package learn;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TransientStudent {

	public static void main(String[] args) throws IOException {

		Transient s1 = new Transient(1, "Trishul", 22);
		
//		FileOutputStream f=new FileOutputStream("/home/vladmin/trishul/trans.txt");  
		ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("/home/vladmin/trishul/trans.txt"));  
		out.writeObject(s1);  
		out.flush();  
		  
		out.close();  
//		f.close();  
		System.out.println("success");  
	}

}

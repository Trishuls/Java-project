package learn;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TransientDeserialize {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream in=new ObjectInputStream(new FileInputStream("/home/vladmin/trishul/trans.txt"));  
		Transient s=(Transient)in.readObject();  
		System.out.println(s.id+" "+s.name+" "+s.age);  
		in.close();  
	}

}

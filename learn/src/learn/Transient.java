package learn;

import java.io.Serializable;

public class Transient implements Serializable{

	int id;
	String name;
	transient int age;
	
	public Transient(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
}

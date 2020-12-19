package learn;

import java.io.IOException;

public class ThrowsDemo {
	void m()throws IOException{  
	    throw new IOException("device error");//checked exception  
	  }  
	  void n()throws IOException{  
	    m();  
	  }  
	  void p(){  
	   try{  
	    n();  
	   }catch(Exception e){System.out.println("exception handled");}  
	  }  
	  public static void main(String args[]){  
		  ThrowsDemo obj=new ThrowsDemo();  
	   obj.p();  
	   System.out.println("c:\\demo.txt");  
	  }  
}

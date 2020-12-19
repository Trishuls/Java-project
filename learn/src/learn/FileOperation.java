package learn;

import java.io.FileReader;

public class FileOperation {
 
//	    public static void main(String args[]){    
//	         try{    
//	           FileWriter fw=new FileWriter("F:\\testout.txt");    
//	           fw.write("Welcome to javaTpoint.");    
//	           fw.close();    
//	          }catch(Exception e){System.out.println(e);}    
//	          System.out.println("Success...");    
//	     }    
	public static void main(String args[])throws Exception{   
        FileReader fr=new FileReader("F:\\testout.txt");    
        int i;    
        while((i=fr.read())!=-1)    
        System.out.print((char)i);    
        fr.close();    
  }    
	}  


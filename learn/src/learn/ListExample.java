package learn;

import java.util.ArrayList;
import java.util.Collections;

public class ListExample {
  
		 public static void main(String args[]){  
		  ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
		  list.add("Mango");//Adding object in arraylist    
		  list.add("Apple");    
		  list.add("Banana");    
		  list.add("Grapes");    
		  
		  int num = list.indexOf("Grapes");
		  
		  System.out.println("index is = "+num);
		  //Traversing list through for-each loop  
		  for(String fruit:list)    
		    System.out.println(fruit);    
		  
		  Collections.sort(list);
		  
		  for(String fruits:list)    
			    System.out.println(fruits);
		  
		  Collections.reverse(list);
		  
		  for(String fru:list)    
			    System.out.println(fru);
		 }  
		}  


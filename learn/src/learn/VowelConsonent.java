package learn;

import java.util.Scanner;

public class VowelConsonent {
	public static void main(String[] args) {    
        
//        //Counter variable to store the count of vowels and consonant    
//        int vCount = 0, cCount = 0;    
//            
//        //Declare a string    
//        String str = "This is a really simple sentence u";    
//            
//        //Converting entire string to lower case to reduce the comparisons    
//        str = str.toLowerCase();    
//            
//        for(int i = 0; i < str.length(); i++) {    
//            //Checks whether a character is a vowel    
//            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {    
//                //Increments the vowel counter    
//                vCount++;    
//            }    
//            //Checks whether a character is a consonant    
//            else if(str.charAt(i) >= 'a' && str.charAt(i)<='z') {      
//                //Increments the consonant counter    
//                cCount++;    
//            }    
//        }    
//        System.out.println("Number of vowels: " + vCount);    
//        System.out.println("Number of consonants: " + cCount);    
		
		int vcount = 0,conscount=0;
		
		System.out.println("Enter the string");
		
		Scanner s = new Scanner(System.in);
		
		String str = s.nextLine();
		System.out.println("String length = "+str.length());
		str = str.toLowerCase();
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i) == 'a' ||str.charAt(i) == 'e' ||str.charAt(i) == 'i' ||str.charAt(i) == 'o' ||str.charAt(i) == 'u')
			{
				vcount++;
			}
			else if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
			{
				conscount++;
			}
		}
		
		System.out.println("Vowel is/are = "+vcount);
		System.out.println("Consonant is/are = "+conscount);
    }

	private static void exit(int i) {
		// TODO Auto-generated method stub
		
	}  
}

package learn;

public class DemoPattern {

	public static void main(String[] args) {
//		*
//		**
//		***
//		****
//		for(int i = 0; i < 5; i++)
//		{
//			for(int j = 0; j < i; j++)
//			{
//				System.out.print("*");
//			}
//			System.out.println(" ");
//		}
		
//				 *
//				**
//			   ***
//			  ****
//			 *****
//		int i, j, row = 6;       
//		//Outer loop work for rows  
//		for (i=0; i<row; i++)   
//		{  
//			//inner loop work for space      
//			for (j=2*(row-i); j>=0; j--)         
//			{  
//			//prints space between two stars      
//			System.out.print(" ");   
//			}   
//			//inner loop for columns  
//			for (j=0; j<=i; j++ )   
//			{   
//			//prints star      
//			System.out.print("* ");   
//			}   
//			//throws the cursor in a new line after printing each line  
//			System.out.println(); 
//        } 
		
//		* * * * * * * 
//		* * * * * * 
//		* * * * * 
//		* * * * 
//		* * * 
//		* * 
//		* 
//		int rows=7;      
//		//inner loop  
//		for (int i= rows-1; i>=0 ; i--)  
//		{  
//		//outer loop  
//		for (int j=0; j<=i; j++)  
//		{  
//		//prints star and space  
//		System.out.print("* ");  
//		}  
//		//throws the cursor in the next line after printing each line  
//		System.out.println();  
//		}
		
//		* * * * * * * * 
//		  * * * * * * * 
//		   * * * * * * 
//		    * * * * * 
//		     * * * * 
//		      * * * 
//		       * * 
//		        *
//		int rows=8;  
//		for (int i= 0; i<= rows-1; i++)  
//		{  
//		for (int j=0; j<=i; j++)  
//		{  
//		System.out.print(" ");  
//		}  
//		for (int k=0; k<=rows-1-i; k++)  
//		{  
//		System.out.print("*" + " ");  
//		}  
//		System.out.println();  
//		}
	}
}

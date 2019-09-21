package Pyramid;
import java.util.*;
public class FullPyramid {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		
		for(int i = 1; i <=x ;i++) {
			
			for(int j = 1; j<=2*x-1;j++) {
				
				if(j>=x-(i-1) && j<=x+(i-1)) {
					
					System.out.print("* "); // System.out.print(i+" ");
				}else {
					
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}

/*
 
 	input 5
 	
          * 
        * * * 
      * * * * * 
    * * * * * * * 
  * * * * * * * * * 
  
  
    input 7
    
            	1             
          	  2 2 2           
        	3 3 3 3 3         
          4 4 4 4 4 4 4       
    	5 5 5 5 5 5 5 5 5     
      6 6 6 6 6 6 6 6 6 6 6   
	7 7 7 7 7 7 7 7 7 7 7 7 7


 */

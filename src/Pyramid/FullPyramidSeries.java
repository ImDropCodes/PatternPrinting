package Pyramid;
import java.util.*;

public class FullPyramidSeries {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		
		for(int i = 1; i<=x; i++) {
			for(int j =1;j<=x;j++) {
				if(j<=x-i) {
					System.out.print(" ");
				}else {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}
}



/*

	input 6
	
 		* 
 	   * * 
 	  * * * 
 	 * * * * 
 	* * * * * 
   * * * * * * 

*/
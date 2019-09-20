import java.util.*;
public class FullPyramid {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		
		for(int i = 1; i <=x ;i++) {
			
			for(int j = 1; j<=2*x-1;j++) {
				
				if(j>=x-(i-1) && j<=x+(i-1)) {
					
					System.out.print("* ");
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


 */

package Pyramid;
import java.util.*;

public class FullPyramidOddHallow {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int x = s.nextInt();
		
		for(int i = 1; i<=x;++i) {
			
			for(int j = i;j<x;j++) {
				System.out.print("  ");
			}
			for(int k = 1;k<=(2*i-1);k++) {
				
				if(k==(2*i-1) || k==1 || i==x) {
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
      *   * 
    *       * 
  *           * 
* * * * * * * * * 





*/
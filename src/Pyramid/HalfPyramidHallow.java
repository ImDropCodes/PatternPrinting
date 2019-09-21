package Pyramid;
import java.util.*;
public class HalfPyramidHallow {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		
		for(int i = 1; i<=x;i++) {
			for(int j = 1; j<=i;j++) {
				if(j==1 || j==i || i==x) {
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
 
input  6
 * 
 * * 
 *   * 
 *     * 
 *       * 
 * * * * * * 

 
 
 
 
*/

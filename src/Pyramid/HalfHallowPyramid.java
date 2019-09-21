package Pyramid;
import java.util.*;

public class HalfHallowPyramid {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		
		for(int i = 1;i<=x;i++) {
			for(int j = 1;j<=i;j++) {
				if(j==1 || j==i || i==x) {
					System.out.print("* "); // * + 1 Space  (for proper pattern)
				}else {
					System.out.print("  "); // 2 Space  (for proper pattern)
				}
			}
			System.out.println();
		}
	}
}

/*
 *        input 4
 *        
 *        *
 *        *  *
 *        *    *
 *        * * *  *
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */

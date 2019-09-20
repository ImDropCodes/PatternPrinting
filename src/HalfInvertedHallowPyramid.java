import java.util.*;
public class HalfInvertedHallowPyramid {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		
		for(int i = x ;i>0;i--) {
			for(int j = i ;j>0;j--) {
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
		input 5

 		* * * * * 
 		*     * 
 		*   * 
 		* * 
 		* 

*/
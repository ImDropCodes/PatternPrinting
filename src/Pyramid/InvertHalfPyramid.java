package Pyramid;
import java.util.*;
public class InvertHalfPyramid {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		for(int i = x ; i>0;i--) {
			for(int j = i;j>0;j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}

/*		input 6
 * 
 * 		* * * * * *
 * 		* * * * *
 * 		* * * *
 * 		* * *
 * 		* *
 * 		* 
 * 
 */

package Pyramid;
import java.io.*;
import java.util.*;
public class HalfPyramid {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int num = s.nextInt();
		
		for(int i = 0;i<=num;i++) {
			for(int j = 1;j<=i;j++) {
				System.out.print(j); // for * System.out.print(" * ");
			}
			System.out.println("");
		}
		
	}

}


/* 			input: 5
 * 
 * 			output
 * 			1
 * 			12
 * 			123
 * 			1234
 * 			12345
  */

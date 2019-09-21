package Pyramid;
import java.util.*;

public class FullPyramidOddHallow {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int x = s.nextInt();
		
		for(int i = 1; i<=x;++i) {
			for(int j = 1;j<=2*x-1;++j) {
				if(i==1 && j==x) {
					System.out.print("*");
				}
				if(i!=1 && (j==x-i || j==x+i) || i==x) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			
			System.out.println();
		}

	}

}

import java.util.*;
public class FullPyramidInvert {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int k = x;
		
		for(int i = x;i>0;i--,k=x) {
			for(int j = x-i;j > 0;j--) {
				System.out.print("* ");
			}
			while(k!=2*i-1) {
				System.out.print("  ");
				k--;
			}
		}
	}

}

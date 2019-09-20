import java.util.Scanner;

public class HalloSquare {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		for(int i = 1 ;i<=x;i++) {
			for(int j = 1; j<=x;j++) {
				if(j==1 || j==x || i==1 || i==x) {
					System.out.print("* ");  // * + 1 space
				}else {
					System.out.print("  ");  // 2 space
				}
			}
			System.out.println();
		}

	}
}

/*				input 10
* 
* 				* * * * * * * * * * 
*				*                 * 
*				*                 * 
*				*                 * 
*				*                 * 
*				*                 * 
*				*                 * 
*				*                 * 
*				*                 * 
*				* * * * * * * * * *
 * 
 * 
 */

import java.util.*;
public class firs4
{
	public static Scanner sc = new Scanner(System.in);

	public static void pattern1(int n)
	{
		int nst = n;
		int nsp = 0;
		for(int row = 1; row <= n; row++)
		{
			 for(int csp = 1; csp <= nsp; csp++)
			 {
			 	 System.out.print("\t");
			 }
			 for(int cst = 1; cst <= nst; cst++)
			 {
			 	System.out.print("*\t");
			 }
			 nst--;
			 nsp++;
			 System.out.println();
		}
	}
	public static void main(String[] e)
	{
		int n = sc.nextInt();
		pattern1(n);
	}
}
// *       *       *       *       *
//         *       *       *       *
//                 *       *       *
//                         *       *
//                                 *

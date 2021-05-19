//traingle pattern.
import java.util.*;
public class firs1
{
	public static Scanner sc = new Scanner(System.in);

	public static void pattern1(int n)
	{
		int nst = 1;
		for(int row = 1; row <= n; row++)
		{
			 for(int cst = 1; cst <= nst; cst++)
			 {
			 	 System.out.print("*\t");
			 }
			 nst++;
			 System.out.println();
		}
	}
	public static void main(String[] e)
	{
		int n = sc.nextInt();
		pattern1(n);
	}
}
// *
// *       *
// *       *       *
// *       *       *       *
// *       *       *       *       *
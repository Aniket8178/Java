import java.util.*;
public class firs6
{
	public static Scanner sc = new Scanner(System.in);

	public static void pattern1(int n)
	{
		int nst = n / 2 + 1;
		int nsp = 1;
		for(int row = 1; row <= n; row++)
		{
			for(int cst = 1; cst <= nst; cst++)
			{
				System.out.print("*\t");
			}
			for(int csp = 1; csp <= nsp; csp++)
			{
				System.out.print("\t");
			}
			for(int cst = 1; cst <= nst; cst++)
			{
				System.out.print("*\t");
			}
			if(row <= n / 2)
			{
				nst--;
				nsp = nsp + 2;

			}
			else
			{
				nst++;
				nsp = nsp - 2;
			}
			System.out.println();
		}
	}
	public static void main(String[] e)
	{
		int n = sc.nextInt();
		pattern1(n);
	}
}
// *       *       *               *       *       *
// *       *                               *       *
// *                                               *
// *       *                               *       *
// *       *       *               *       *       *
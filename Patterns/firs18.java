import java.util.Scanner;
public class firs18
{
	public static Scanner sc = new Scanner(System.in);

	public static void pattern(int n)
	{
		int nst = n;
		int nsp = 0;

		for(int row = 1; row <= n; row ++)
		{
			for(int csp = 1; csp <= nsp; csp++)
			{
				System.out.print("\t");
			}
			for(int cst = 1; cst <= nst; cst++)
			{
				if(row > 1 && row <= n / 2 && cst > 1 && cst < nst)
				{
					System.out.print("\t");
				}
				else
				{
					System.out.print("*\t");
				}
			}

			if(row <= n / 2)
			{
				nst = nst - 2;
				nsp++;
			}
			else
			{
				nst = nst + 2;
				nsp--;
			}
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		int n = sc.nextInt();
		pattern(n);
	}
}
// 7
// *       *       *       *       *       *       *
//         *                               *
//                 *               *
//                         *
//                 *       *       *
//         *       *       *       *       *
// *       *       *       *       *       *       *
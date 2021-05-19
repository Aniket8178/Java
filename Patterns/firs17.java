import java.util.Scanner;
public class firs17
{
	public static Scanner sc = new Scanner(System.in);

	public static void pattern(int n)
	{
		int nst = 1;
		int nsp = n / 2;

		for(int row = 1; row <= n; row++)
		{
			for(int csp = 1; csp <= nsp; csp++)
			{
				if(row == n / 2 + 1)
				{
					System.out.print("*\t");
				}
				else
				{
					System.out.print("\t");
				}
			}
			for(int cst = 1; cst <= nst; cst++)
			{
				System.out.print("*\t");
			}

			if( row <= n / 2)
			{
				nst++;
			}
			else
			{
				nst--;
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

// 5
//                 *
//                 *       *
// *       *       *       *       *
//                 *       *
//                 *
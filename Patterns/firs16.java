import java.util.Scanner;
public class firs16
{
	public  static Scanner sc = new Scanner(System.in);

	public static void pattern(int n)
	{
		int nst = 1;
		int nsp = 2 * n - 3;

		for(int row = 1; row <= n; row++)
		{
			int val = 1;
			for(int cst = 1; cst <= nst; cst++)
			{
				System.out.print(val++  + "\t");
			}
			for(int csp = 1; csp <= nsp; csp++)
			{
				System.out.print("\t");
			}
			if(row == n)
			{
				nst--;
			}
			for(int cst = 1; cst <= nst; cst++)
			{
				System.out.print(--val + "\t");
			}

			nst++;
			nsp -= 2;
			System.out.println();

		}
	}
	public static void main(String[] args)
    {
		int n =sc.nextInt();
		pattern(n);
	}
}
// 4
// 1                                               1
// 1       2                               2       1
// 1       2       3               3       2       1
// 1       2       3       4       4       3       2
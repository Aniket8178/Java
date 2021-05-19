import java.util.*;
public class firs11
{
	public static Scanner sc = new Scanner(System.in);

	public static void pattern1(int n)
	{
		int nst = 1;
		int val = 1;
		for(int row = 1; row <= n; row++)
		{
			 for(int cst = 1; cst <= nst; cst++)
			 {
			 	 System.out.print(val++ + "\t");
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
// 1
// 2       3
// 4       5       6
// 7       8       9       10
// 11      12      13      14      15
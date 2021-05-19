import java.util.*;
public class firs12
{
	public static Scanner sc = new Scanner(System.in);

	public static void pattern1(int n)
	{
		int nst = 1;
        int a = 0;
        int b = 1;
		for(int row = 1; row <= n; row++)
		{
			
			for(int cst = 1; cst <= nst; cst++)
			{
				
				System.out.print(a + "\t");
				int c = a + b;
			    a = b;
			    b = c;
				
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
// 0
// 1       1
// 2       3       5
// 8       13      21      34
// 55      89      144     233     377
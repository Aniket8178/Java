import java.util.*;
public class firs15
{
	public static Scanner sc = new Scanner(System.in);

	public static void numberdiamond(int n)
	{
		int nst = 1;
		int nsp = n / 2;
		for(int row = 1; row <= n; row++)
		{
			 for(int csp = 1; csp <= nsp; csp++)
			 {
			 	 System.out.print("\t");
			 }
			 int val = row;
			 if(val  > n / 2 + 1)
			 {
			 	val = n - row + 1;
			 }
			 for(int cst = 1; cst <= nst; cst++)
			 {
			 	System.out.print(val + "\t");
			 	if(cst <= nst / 2)
			 	{
			 		val++;
			 	}
			 	else
			 	{
			 		val--;
			 	}
			 }

			 if(row <= n / 2)
			 {
			 	nst = nst + 2;
			 	nsp--;

			 }
			 else
			 {
			 	nst = nst - 2;
			 	nsp++;
			 }
			 System.out.println();
		}
	}
	public static void main(String[] args) {
		
		int n = sc.nextInt();
		numberdiamond(n);
	}
}
//                 1
//         2       3       2
// 3       4       5       4       3
//         2       3       2
//                 1

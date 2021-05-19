import java.util.*;
public class firs8
{
	public static Scanner sc = new Scanner(System.in);

	public static void pattern1(int n)
	{
	    for(int i = 1; i <= n; i++)
	    {
	    	for(int j = 1; j <= n; j++)
	    	{
	    		if(i  + j == n + 1)
	    		{
	    			System.out.print("*\t");

	    		}
	    		else
	    		{
	    			System.out.print("\t");
	    		}
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
//                                 *
//                         *
//                 *
//         *
// *
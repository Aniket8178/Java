//print all prime numbber between the given range.
import java.util.*;
public class pep2
{
	public static Scanner sc = new Scanner(System.in);

	public static boolean isprime(int n)
	{
		for(int i = 2; i * i <= n; i++)
		{
			if(n % i == 0)
			{
				return false;
			}
		}
		return true;
	}
	public static  void checkprime(int a,int b)
	{
		for(int i = a; i <= b; i++)
		{
			boolean res = isprime(i);
			if(res == true)
			{
				System.out.println(i);
			}
		}
		
	}
	public static void main(String[] args) 
	{
	    int a= sc.nextInt();
	    int b = sc.nextInt();
	    checkprime(a,b);	
	}
}
//check the number is prime or not.
import java.util.*;
public class pep1
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
	public static  void checkprime(int n)
	{
		boolean res = isprime(n);

		if(res == true)
		{
			System.out.println("isprime");
		}
		else
		{
			System.out.println("notprime");
		}
	}
	public static void main(String[] args) 
	{
	   int n = sc.nextInt();
	   checkprime(n);
	}
}
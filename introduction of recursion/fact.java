import java.util.Scanner;
public class fact
{
	public static Scanner sc = new Scanner(System.in);
 
    public static int factorial(int n)
    {
    	if(n == 0)
        {
            return 1;

        }

        int val = factorial(n - 1);
        return n * val;
    }
	
	public static void main(String[] args) 
	{
		int n = sc.nextInt();
		System.out.println(factorial(n));
	}
}

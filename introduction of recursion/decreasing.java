import java.util.Scanner;
public class decreasing
{
	public static Scanner sc = new Scanner(System.in);

	public static void printdecreasing(int n)
	{
		if(n == 0)
		{
			return;
		}

        System.out.println(n);
		printdecreasing(n - 1);

	}
	public static void main(String[] args) 
	{
		int n = sc.nextInt();
		printdecreasing(n);
	}
}
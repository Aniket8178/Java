import java.util.Scanner;
public class incredecre
{
	public static Scanner  sc = new Scanner(System.in);

	public static void printincreasingdecreasing(int n)
	{
		if(n == 0)
		{
			return;
		}

		System.out.println(n);
        printincreasingdecreasing(n - 1);
        System.out.println(n);
	}
	public static void main(String[] args) 
	{
	      int n = sc.nextInt();
	      printincreasingdecreasing(n);	
	}
}
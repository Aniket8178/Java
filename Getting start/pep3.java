// count number of digit.
import java.util.Scanner;
public class pep3
{
	public static Scanner sc = new Scanner(System.in);

	public static int countdigit(int n)
	{
		int len = 0;
		while(n != 0)
		{
			n = n / 10;
			len++;
		}
		return len;
	}
	public static void main(String[] args) 
	{
	    int n = sc.nextInt();
	    System.out.println(countdigit(n));
	}

}
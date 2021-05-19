//reverse of a number.
import java.util.*;
public class pep5
{
	public static Scanner sc = new Scanner(System.in);

	public static void reverse(int n)
	{
		while(n != 0)
		{
			int rem = n % 10;
			n = n / 10;
			System.out.println(rem);
		}
	}
	public static void main(String[] args) {
		
		int n = sc.nextInt();
		reverse(n);
	}
}
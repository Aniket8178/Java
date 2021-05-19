import java.util.Scanner;
public class pep4
{
	public static Scanner sc = new Scanner(System.in);

	public static int power(int n)
	{
		int pow = 1;
		n = n / 10;
		while(n != 0)
		{
			pow  = pow * 10;
			n = n / 10;
		}
		return pow;
	}
	public static void digiofnumber(int n)
	{
		int pow = power(n);

		while(n != 0)
		{
			int que = n / pow;
			n = n % pow;
			pow = pow / 10;
			System.out.println(que);
		}
	}
	public static void main(String[] args) 
	{
	    int n = sc.nextInt();
	    digiofnumber(n);
	}

}
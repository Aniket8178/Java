import java.util.Scanner;
public class pep7
{
	public static Scanner sc = new Scanner(System.in);

	public static void lcdgcd(int a,int b)
	{
		int n1 = a;
		int n2 = b;

		while(n1 % n2 != 0)
		{
			int res = n1 % n2;
			n1 = n2;
			n2 = res;
		}

		int gcd = n2;
		int lcd = (a * b) / gcd;
		System.out.println(gcd);
		System.out.println(lcd);
	}
	public static void main(String[] args) {
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		lcdgcd(a,b);
	}
}
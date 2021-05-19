import java.util.Scanner;
public class Abmultiplication
{

	public static Scanner sc = new Scanner(System.in);

	public static int anybaseaddition(int n, int m,int b)
	{
        int carry = 0;
        int pow = 1;
        int res = 0;
        while(n != 0 || m != 0 || carry != 0)
        {
        	int sum = carry + n % 10 + m % 10;
             n = n / 10;
             m = m / 10;

             int digit = sum % b;
             carry = sum / b;

             res += digit * pow;
             pow = pow * 10;
        }

        return res;
	}
	public static int multiplywithdigit(int n, int d,int b)
	{
		int ans = 0;
		int pow = 1;
		int carry = 0;

		while(n != 0 || carry != 0)
		{
			int prod = carry + (n % 10) * d;
			n = n / 10;

			int digit = prod % b;
             carry = prod / b;

             ans += digit * pow;

             pow = pow * 10;
		}

		return ans;
	}
	public static int anybasemultiplication(int n, int m,int b)
	{
		int res = 0;
		int pow = 1;

		while(m != 0)
		{
			int d = m % 10;
			m = m / 10;
			int prodres = multiplywithdigit(n,d,b) * pow;
			res =  anybaseaddition(res,prodres,b);

			pow = pow * 10;

		}

		return res;
	}
	public static void main(String[] args) 
	{
	     int n = sc.nextInt();
	     int m = sc.nextInt();
	     int b = sc.nextInt();

         int output = anybasemultiplication(n,m,b);

         System.out.println(output);
	}
}
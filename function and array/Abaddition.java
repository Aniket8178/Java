import java.util.Scanner;

public class Abaddition
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
	public static void main(String[] args) 
	{
	    int n = sc.nextInt();
	    int m = sc.nextInt();
	    int b = sc.nextInt();

	    System.out.println(anybaseaddition(n,m,b));	
	}
}
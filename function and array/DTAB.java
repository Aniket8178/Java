import java.util.Scanner;
public class DTAB
{
	public static Scanner sc = new Scanner(System.in);

    public static int decimaltoanybase(int n,int b)
    {
    	int pow = 1;
    	int result = 0;

    	while(n != 0)
    	{
    		int rem = n % b;
    		n = n / b;

    		result += rem * pow;
    		pow = pow * 10;
    	}

    	return result;
    }

    public static void main(String[] args) 
    {
         int n = sc.nextInt();
         int b = sc.nextInt();
         int output = decimaltoanybase(n , b);
         System.out.println(output);
    }
}
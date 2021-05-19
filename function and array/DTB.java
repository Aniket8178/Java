import java.util.Scanner;
public class DTB
{
	public static Scanner sc = new Scanner(System.in);

    public static int decimaltobinary(int n)
    {
    	int pow = 1;
    	int result = 0;

    	while(n != 0)
    	{
    		int rem = n % 2;
    		n = n / 2;

    		result += rem * pow;
    		pow = pow * 10;
    	}

    	return result;
    }

    public static void main(String[] args) 
    {
         int n = sc.nextInt();
         int output = decimaltobinary(n);
         System.out.println(output);
    }
}
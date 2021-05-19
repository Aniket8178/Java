import java.util.Scanner;
public class BTD
{
	public static Scanner sc = new Scanner(System.in);

    public static int binarytodecimal(int n)
    {
    	
        int pow = 1; 
        int res = 0;

        while(n != 0)
        {
            int rem = n % 10;
            n = n / 10;

            res += rem * pow;
            pow = pow * 2;
        }

        return res;
    }

    public static void main(String[] args) 
    {
         int n = sc.nextInt();
         int output = binarytodecimal(n);
         System.out.println(output);
    }
}
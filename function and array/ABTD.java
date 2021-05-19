import java.util.Scanner;
public class ABTD
{
	public static Scanner sc = new Scanner(System.in);

    public static int anybasetodecimal(int n , int b)
    {
    	
        int pow = 1;
        int res = 0;

        while(n != 0)
        {
            int rem = n % 10;
            n = n / 10;

            res += rem * pow;
            pow = pow * b;
        }

        return res;
    }

    public static void main(String[] args) 
    {
         int n = sc.nextInt();
         int b = sc.nextInt();
         int output = anybasetodecimal(n , b);
         System.out.println(output);
    }
}
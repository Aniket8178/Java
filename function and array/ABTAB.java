import java.util.Scanner;
public class ABTAB
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
	   int b1 = sc.nextInt();
	   int b2 = sc.nextInt();

	   int decimmal = anybasetodecimal(n,b1);
	   int result = decimaltoanybase(decimmal,b2);
	   System.out.println(result);
      
       
	}
}
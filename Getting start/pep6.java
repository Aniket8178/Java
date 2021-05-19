//rotate a number
import java.util.*;
public class pep6
{
	public static Scanner sc = new Scanner(System.in);

	public static int countdigit(int n)
	{
		int len = 0;
		while(n != 0)
		{
			n = n / 10;
			len++;
		}
		return len;
	}
     
    public static void rotate(int n,int k)
    {
    	int last = countdigit(n);
    	k = k % last;
    	if(k < 0)
    	{
    		k = k + last;
    	}

    	int mul = 1;
    	int div = 1;
    	for(int i = 1; i <= last; i++)
    	{
             if(i <= k)
             {
             	div = div * 10;
             }
             else
             {
             	mul = mul * 10;
             }
    	}

    	int rem = n % div;
    	int que = n / div;

    	int res = rem * mul + que;

    	System.out.println(res); 
    }
	public static void main(String[] args) {
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		rotate(n,k);
	}
}
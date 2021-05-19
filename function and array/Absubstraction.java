import java.util.Scanner;
public class Absubstraction
{

	public static Scanner sc = new Scanner(System.in);
 
    public static int anybasesubstraction(int n,int m, int b)
    {
    	int pow = 1;
    	int borrow = 0;
    	int res = 0;

    	while(m != 0)
    	{
    		int diff = borrow + m % 10 - n % 10;
            n /= 10;
            m /= 10;

            if (diff < 0) {
                diff += b;
                borrow = -1;
            } else
                borrow = 0;

            res += diff * pow;
            pow *= 10;
    	}

    	return res;


    }

	public static void main(String[] args) 
	{
	    int b = sc.nextInt();
	    int n = sc.nextInt();
	    int m = sc.nextInt();

	    System.out.println(anybasesubstraction(n, m, b));	
	}
}
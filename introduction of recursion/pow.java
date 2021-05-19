import java.util.Scanner;
public class pow
{
	public static Scanner sc = new Scanner(System.in);
 
    public static int power(int a, int b)
    {
    	if(b == 0)
    	{
    		return 1;
    	}
        
        int val = power(a , b - 1);
        return a * val;
    }
	public static int powerlogrithm(int a, int b)
    {
        if(b == 0)
        {
            return 1;
        }

        int val = powerlogrithm(a , b / 2);
        val = val * val;

         if(b % 2 == 0)
         {
            return val;
         }
        return val * a;
    }
	public static void main(String[] args) 
	{
		int a = sc.nextInt();
        int b = sc.nextInt();

		System.out.println(powerlogrithm(a , b));
	}
}

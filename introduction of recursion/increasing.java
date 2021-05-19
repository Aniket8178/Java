import java.util.Scanner;
public class increasing
{
	public static Scanner sc = new Scanner(System.in);
 
    public static void printincreasing(int n)
    {
    	if(n == 0)
    	{
    		return;
    	}

    	printincreasing(n - 1);//faith is that ke ye function  1 to 4 print krke dedega.
    	System.out.println(n);// last me shirf last nno print kr do
    }
	
	public static void main(String[] args) 
	{
		int n = sc.nextInt();
		printincreasing(n);
	}
}

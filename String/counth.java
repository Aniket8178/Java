import java.util.Scanner;
public class counth
{
	public static Scanner sc = new Scanner(System.in);

    public static void counthi(String str)
    {
    	int n = str.length();
    	int i = 0, count = 0;
    	while(i < n - 1)
    	{
    		if(str.charAt(i) == 'h' && str.charAt(i + 1) == 'i')
    		{
    			count++;
    			i += 2;
    		}
    		else
    		{
                i++;
    		}
    	}

    	System.out.println(count);
    }
    public static int counthiwithouthit(String str)
    {
    	int n = str.length();
    	int i = 0,count = 0;
    	while(i < n -1)
    	{
    		if(str.charAt(i) == 'h' && str.charAt(i + 1) == 'i')
    		{
    			if(i + 2 < n && str.charAt(i + 2) == 't')
    			{
    				i += 3;
    			}
    			else
    			{
    				count++;
    				i += 2;
    			}
    		}
    		else
    		{
    			i++;
    		}
    	}

    	return count;
    }
	public static void main(String[] args) 
	{
	    String str = sc.next();
	    int res = counthiwithouthit(str);
	    System.out.println(res);
	}
}
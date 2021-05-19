import java.util.Scanner;
public class palidrome
{
	public static Scanner  sc = new Scanner(System.in);

	public static boolean ispalidrome(String str,int si,int ei)
	{
		while(si < ei)
		{
			if(str.charAt(si) != str.charAt(ei))
			{
				return false;
				
			}
			si++;
				ei--;
		}
		return true;
	}
	public static void printallaplidrome(String str)
	{
		int n = str.length();

		for(int i = 0; i < n; i++)
		{
			for(int j = i; j < n; j++)
			{
				if(ispalidrome(str,i,j))
				{
					String s = str.substring(i,j + 1);
					System.out.println(s);
				}
			}
		}
	}
	public static void main(String[] args) 
	{
	     String str = sc.next();
	     printallaplidrome(str);	
	}
}
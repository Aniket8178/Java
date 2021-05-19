import java.util.Scanner;
public class toogle
{
	public static Scanner sc = new Scanner(System.in);

	public static String tooglecase(String str)
	{
		StringBuilder sb = new StringBuilder();
		int n = str.length();
		for(int i = 0; i < n; i++)
		{
			char ch = str.charAt(i);
			if(ch >= 'a' && ch <= 'z')
			{
				sb.append((char)(ch - 'a' + 'A'));
			}
			else
			{
				sb.append((char)(ch - 'A' + 'a'));
			}
		}

		return sb.toString();
	}
	public static void main(String[] args)
    {
	     String str = sc.next();
	     String re = tooglecase(str);	
	     System.out.println(re);
	}
}
// formula...
// x - 'a' = X - 'A';
// x = X - 'A' + 'a';
// X = x - 'a' + 'A';
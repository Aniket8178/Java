import java.util.Scanner;
public class ascii
{
	public static Scanner sc = new Scanner(System.in);

	public static String asciidiffrence(String str)
	{
		int n = str.length();
		StringBuilder sb = new StringBuilder();
		sb.append(str.charAt(0));
		for(int i = 1; i < n; i++)
		{
			sb.append(str.charAt(i) - str.charAt(i - 1));
			sb.append(str.charAt(i));
		}

		return sb.toString();	
	}
	public static void main(String[] args) 
	{
	     
	     String str = sc.next();
	     String res = asciidiffrence(str);
	     System.out.println(res);	
	}
}
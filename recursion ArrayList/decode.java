import java.util.*;
public class decode
{
	public static Scanner sc = new Scanner(System.in);

	public static ArrayList<String> decodeway(String str)
	{
		if(str.length() == 0)
		{
			ArrayList<String> base = new ArrayList<>();
			base.add("");
			return base;
		}

		if(str.charAt(0) == '0')
		{
			return new ArrayList<>();
		}

		char ch1 = str.charAt(0);
		ArrayList<String> myans = new ArrayList<>();
	    ArrayList<String> recans = decodeway(str.substring(1));
	    for (String  s : recans) 
	    {
	        myans.add((char)('a' + ch1 - '1') + s);	
	    }

	    if(str.length() > 1)
	    {
	    	int num = (ch1 - '0') * 10 + (str.charAt(1) - '0');

	    	if(num <= 26)
	    	{
	    		ArrayList<String> recans2 = decodeway(str.substring(2));
	    	    for (String  s : recans2) 
	            {
	                 myans.add((char)('a' + num - 1) + s);	
	            }
	    	}
	    }

	    return myans;
	}

	public static void main(String[] args) 
	{
	    for (String s : decodeway("111220")) {
         System.out.println(s);
        }	
	}

}
















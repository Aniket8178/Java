import java.util.*;
public class decodeway
{
	public static Scanner  sc = new Scanner(System.in);

	public static String[] nokiaKeys = { ".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz","+-*","<>/%" };

	public static ArrayList<String> decodeway2(String str)
	{
		if(str.length() == 0)
		{
			ArrayList<String> base = new ArrayList<>();
			base.add("");
			return base;
		}

		char ch1 = str.charAt(0);
		String word = nokiaKeys[ch1 - '0'];
		ArrayList<String> myans = new ArrayList<>();
		ArrayList<String> recans1 = decodeway2(str.substring(1));
		for(int i = 0; i < word.length(); i++)
		{
			for(String s : recans1)
			{
				myans.add(word.charAt(i) + s);
			}
		}

		if(str.length() > 1)
		{
			char ch2 = str.charAt(1);
			int num = (ch1 - '0') * 10 + (ch2 - '0');
            if(num == 10 || num == 11)
            {
            	ArrayList<String> recans2 = decodeway2(str.substring(2));
            	word = nokiaKeys[num];
		        for(int i = 0; i < word.length(); i++)
		        {
			       for(String s : recans2)
			       {
				        myans.add(word.charAt(i) + s);
			       }
		        }
            }
		}

		return myans;
	}
	public static void main(String[] args) 
	{
	    
          for (String s : decodeway2("110")) {
             System.out.println(s);
        }








	}
}
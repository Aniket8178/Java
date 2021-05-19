import java.util.*;
public class kpc
{
    
     public static Scanner sc = new Scanner(System.in);

     public static String[] nokiakey = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

     public static ArrayList<String> getkpc(String str)
     {
     	if(str.length() == 0)
     	{
     		ArrayList<String> base = new ArrayList<String>();
     		base.add("");
     		return base;
     	}

     	char ch = str.charAt(0);
     	String code =  nokiakey[ch - '0'];

     	ArrayList<String> recans = getkpc(str.substring(1));

     	ArrayList<String> myans = new ArrayList<>();

     	for(int i = 0; i < code.length(); i++)
     	{
     		for (String s : recans) 
     		{
     		    myans.add(code.charAt(i) + s);	
     		}
     	}

     	return myans;

     }
     public static void main(String[] args) 
     {
         String str = sc.next();
         System.out.println(getkpc(str));	
     }
}
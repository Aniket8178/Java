import java.util.*;
public class seuence
{
     public static Scanner sc = new Scanner(System.in);

     public static ArrayList<String> getsequence(String str)
     {
     	if(str.length() == 0)
     	{
     		ArrayList<String> base = new ArrayList<>();
     		base.add("");
     		return base;
     	}


     	char ch = str.charAt(0);

     	ArrayList<String> recans = getsequence(str.substring(1));

     	ArrayList<String> myans = new ArrayList<>();
     	for (String s : recans) 
     	{
     		myans.add(s);
     		myans.add(ch + s);
     	}

     	return myans;
     }
     public static void main(String[] args) 
     {
     	 String str = sc.next();
     	 System.out.println(getsequence(str));
     }
}
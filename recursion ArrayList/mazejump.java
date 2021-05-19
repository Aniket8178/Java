import java.util.*;
public class mazejump
{
	public static Scanner sc = new Scanner(System.in);
   
	public static ArrayList<String> mazepath_multiHVD(int sr,int sc,int er,int ec)
	{
		if(sr == er && sc == ec)
		{
			ArrayList<String> base = new ArrayList<>();
			base.add("");
			return base;
		}

        ArrayList<String> myans = new ArrayList<>();
	    for(int jump = 1; sc + jump <= ec; jump++)
		{
            ArrayList<String> horiazntal = mazepath_multiHVD(sr, sc + jump, er, ec);
            for(String s : horiazntal)
            {
            	myans.add("H" + jump +  s);
            }
		}
		for(int jump = 1; sc + jump <= ec && sr + jump <= er; jump++)
		{
            ArrayList<String> digonal = mazepath_multiHVD(sr + jump, sc + jump, er, ec);
            for(String s : digonal)
            {
            	myans.add("D" + jump + s);
            }
		}

		for(int jump = 1; sr + jump <= er; jump++)
		{
			ArrayList<String> vertical = mazepath_multiHVD(sr + jump , sc , er , ec);
			for(String s : vertical)
			{
				myans.add("V" + jump + s);
			}
		}

		return myans;

	}
	public static void main(String[] args) 
	{
	      System.out.println(mazepath_multiHVD(0,0,2,2));	
	}
}





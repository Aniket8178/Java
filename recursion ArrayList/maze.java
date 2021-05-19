import java.util.*;
public class maze
{
	public static Scanner sc = new Scanner(System.in);
    public static ArrayList<String> mazepath_HV(int sr,int sc,int er,int ec)
	{
		if(sr == er && sc == ec)
		{
			ArrayList<String> base = new ArrayList<>();
			base.add("");
			return base;
		}

        ArrayList<String> myans = new ArrayList<>();
		if(sc + 1 <= ec)
		{
            ArrayList<String> horiazntal = mazepath_HV(sr, sc + 1, er, ec);
            for(String s : horiazntal)
            {
            	myans.add("H" + s);
            }
		}
		

		if(sr + 1 <= er)
		{
			ArrayList<String> vertical = mazepath_HV(sr + 1 , sc , er , ec);
			for(String s : vertical)
			{
				myans.add("V" + s);
			}
		}

		return myans;

	}
	public static ArrayList<String> mazepath_HVD(int sr,int sc,int er,int ec)
	{
		if(sr == er && sc == ec)
		{
			ArrayList<String> base = new ArrayList<>();
			base.add("");
			return base;
		}

        ArrayList<String> myans = new ArrayList<>();
		if(sc + 1 <= ec)
		{
            ArrayList<String> horiazntal = mazepath_HV(sr, sc + 1, er, ec);
            for(String s : horiazntal)
            {
            	myans.add("H" + s);
            }
		}
		if(sc + 1 <= ec && sr + 1 <= er)
		{
            ArrayList<String> digonal = mazepath_HV(sr + 1, sc + 1, er, ec);
            for(String s : digonal)
            {
            	myans.add("D" + s);
            }
		}

		if(sr + 1 <= er)
		{
			ArrayList<String> vertical = mazepath_HV(sr + 1 , sc , er , ec);
			for(String s : vertical)
			{
				myans.add("V" + s);
			}
		}

		return myans;

	}
	public static void main(String[] args) 
	{
	      System.out.println(mazepath_HV(0,0,2,2));	
	}
}





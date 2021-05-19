import java.util.*;
public class stair
{
	public static Scanner sc = new Scanner(System.in);

	public static ArrayList<String> stairpath(int n)
	{
		if(n == 0)
		{
			ArrayList<String> base = new ArrayList<>();
			base.add("");
			return base;
		}

        ArrayList<String> myans = new ArrayList<>();

        for(int i = 1; i <= 3 && n - 1 >= 0; i++)
        {
          	   ArrayList<String> recas = stairpath(n - i);
          	   for(String s : recas)
          	   {
          	   	     myans.add(i + s);
          	   }
        }

        return myans;
	}
	public static void main(String[] args) 
	{
		int n = sc.nextInt();

	     for(String e : stairpath(n))
	     {
	     	  System.out.print(e + " ");
	     }	
	}
}

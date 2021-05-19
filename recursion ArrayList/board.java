import java.util.*;
public class board
{
	public static Scanner sc = new Scanner(System.in);

	public static ArrayList<String> boardpath(int n)
	{
		if(n == 0)
		{
			ArrayList<String> base = new ArrayList<>();
			base.add("");
			return base;
		}

        ArrayList<String> myans = new ArrayList<>();

        for(int dice = 1; dice <= 6 && n - dice >= 0; dice++)
        {
          	   ArrayList<String> recas = boardpath(n - dice);
          	   for(String s : recas)
          	   {
          	   	     myans.add(dice + s);
          	   }
        }

        return myans;
	}
	// public static ArrayList<String> boardpathonarray(int n,int[] arr)
	// {
	// 	if(n == 0)
	// 	{
	// 		ArrayList<String> base = new ArrayList<>();
	// 		base.add("");
	// 		return base;
	// 	}

 //        ArrayList<String> myans = new ArrayList<>();

 //        for(int i = 0; i < arr.length && n - arr[i] >= 0; i++)
 //        {
 //          	   ArrayList<String> recas = boardpathonarray(n - arr[i],arr);
 //          	   for(String s : recas)
 //          	   {
 //          	   	     myans.add(arr[i] + s);
 //          	   }
 //        }

 //        return myans;
	// }
	public static void main(String[] args) 
	{
		int n = sc.nextInt();
		// int m = sc.nextInt();
		// int[] arr = new int[m];
		// for(int i = 0; i < m; i++)
		// {
		// 	arr[i] = sc.nextInt();
		// }

	     for(String e : boardpath(n))
	     {
	     	  System.out.print(e + " ");
	     }	
	}
}

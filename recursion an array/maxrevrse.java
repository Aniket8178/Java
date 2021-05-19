import java.util.Scanner;
public class maxrevrse
{
	public static Scanner sc = new Scanner(System.in);

	public static int maximu(int[] arr,int idx)
	{
		int maxvalue = -(int)1e9;
		if(idx == arr.length)
		{
			return maxvalue;
		}

		int recmax = maximu(arr , idx + 1);
		int res = Math.max(recmax,arr[idx]);


        return res;

	}
	public static int minimum(int[] arr,int idx)
	{
		int maxvalue = (int)1e9;
		if(idx == arr.length)
		{
			return maxvalue;
		}

		int recmax = minimum(arr , idx + 1);
		int res = Math.min(recmax,arr[idx]);


        return res;

	}
	public static void main(String[] args) 
	{
	   int n = sc.nextInt();
	   int[] arr = new int[n];
	   for(int i = 0 ; i < arr.length; i++)
	   {
	   	   arr[i] = sc.nextInt();
	   }	
	   System.out.println(minimum(arr, 0));
	}
}
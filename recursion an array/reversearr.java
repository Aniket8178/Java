import java.util.Scanner;
public class reversearr
{
	public static Scanner sc = new Scanner(System.in);

	public static void printreversearray(int[] arr,int idx)
	{
		if(idx == arr.length)
		{
			return;
		}

		
		printreversearray(arr,idx + 1);
		System.out.println(arr[idx]);
	}
	public static void main(String[] args) 
	{
	   int n = sc.nextInt();
	   int[] arr = new int[n];
	   for(int i = 0 ; i < arr.length; i++)
	   {
	   	   arr[i] = sc.nextInt();
	   }	
	   printreversearray(arr, 0);
	}
}
import java.util.Scanner;
public class parrayrec
{
	public static Scanner sc = new Scanner(System.in);

	public static void printarray(int[] arr,int idx)
	{
		if(idx == arr.length)
		{
			return;
		}

		System.out.println(arr[idx]);
		printarray(arr,idx + 1);
	}
	public static void main(String[] args) 
	{
	   int n = sc.nextInt();
	   int[] arr = new int[n];
	   for(int i = 0 ; i < arr.length; i++)
	   {
	   	   arr[i] = sc.nextInt();
	   }	
	   printarray(arr, 0);
	}
}
import java.util.Scanner;
public class subarr
{
	public static Scanner sc = new Scanner(System.in);

	public static int[] input(int n)
	{
		int[] arr = new int[n];

		for(int i = 0; i < n; i++)
		{
			arr[i] = sc.nextInt();

		}

		return arr;
	}
	public static void display(int[] arr)
	{
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
	public static void printInrange(int[] arr,int si,int ei)
	{
		while(si <= ei)
		{
			System.out.print(arr[si] + " ");
			si++;
		}
		System.out.println();
	}
	public static void printallsubarray(int[] arr)
	{
         int n = arr.length;
         for(int i = 0; i < n; i++)
         {
         	for(int j = i; j < n; j++)
         	{
         		printInrange(arr,i,j);
         	}
         }
	}
	public static void main(String[] args) 
	{
	     int n = sc.nextInt();
	     int[] arr = input(n);

	     display(arr);
	     System.out.println();
	     printallsubarray(arr);


	}
}
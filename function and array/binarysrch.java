import java.util.Scanner;
public class binarysrch
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
		int n = arr.length;
		for(int i = 0; i < n; i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
	public static int binarysearch(int[] arr,int data)
	{
		int si = 0;
		int ei = arr.length - 1;
		while(si <= ei) 
		{
			int mid = si + ei / 2;

			if(arr[mid] == data)
			{
				return mid;
			}
			else if(arr[mid] < data)
			{
				si = mid + 1;
			}
			else
			{
				ei = mid - 1;
			}
		}

		return -1;
	}
	public static void main(String[] args) 
	{
	    int n = sc.nextInt();
	    int data = sc.nextInt();

	    int[] arr = input(n);
	    display(arr);
	    System.out.println();
	    System.out.println("index at which element are present : " + binarysearch(arr,data));

	}
}
import java.util.Scanner;
public class lindex
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
	public static int lastindex(int[] arr,int data)
	{
		int n = arr.length;
		int si = 0;
	    int ei = n - 1;

	    while(si <= ei)
	    {
	    	int mid = (si + ei) / 2;
	    	if(arr[mid] == data)
	    	{
                 if(mid + 1 < n && arr[mid + 1] == data)
                 {
                 	si = mid + 1;
                 }
                 else
                 {
                 	return mid;
                 }
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
	    int res = lastindex(arr,data);
	    System.out.println(res);

	}
}
import java.util.Scanner;
public class fandlindex
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
	public static int firstindex(int[] arr,int data)
	{
		int si = 0;
		int ei = arr.length - 1;
		while(si <= ei)
		{
			int mid = (si + ei) / 2;
			if(arr[mid] == data)
			{
				if( mid - 1 >= 0 && arr[mid - 1] == data)
				{
					ei = mid - 1;
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
	public static void firstlastindex(int[] arr,int data)
	{
		int fi = firstindex(arr,data);
		if(fi == -1)
		{
			System.out.println("data not found");
		}
		else
		{
             System.out.println(fi);
   		}

   		int li = lastindex(arr,data);
   		System.out.println(li);
	}
	public static void main(String[] args) 
	{
	      int n = sc.nextInt();
	      int data = sc.nextInt();

	      int[] arr = input(n);
	      display(arr);
	      System.out.println();
	      firstlastindex(arr,data);

	}
}
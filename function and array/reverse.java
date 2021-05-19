import java.util.Scanner;
public class reverse
{
	public static Scanner sc = new Scanner(System.in);

    public static int[] input(int n)
    {
    	int[] arr = new int[n];
    	for(int i = 0; i < arr.length; i++)
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
     public static void display(int[] arr)
    {
    	for(int i = 0; i < arr.length; i++)
    	{
    		System.out.print(arr[i] + " ");
    	}
    }
	public static void swap(int i,int j,int[] arr)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	public static void reverseofanarray(int[] arr)
	{
		int i = 0;
		int j = arr.length - 1;
		while(i < j)
		{
			swap(i,j,arr);
			i++;
			j--;
		}
	}
	public static int[] inverseofanarray(int[] arr)
	{
		int n = arr.length;
		int[] ans = new int[n];

		for(int i = 0; i < n; i++)
		{
			int idx = arr[i];
			ans[idx] = i;
		}

		return ans;
	}
	public static void main(String[] args) 
	{
	     int n = sc.nextInt();
	     int[]	arr = input(n);

	     display(arr);
	     System.out.println();
	     int[] res = inverseofanarray(arr);
	     for(int i = 0; i < res.length; i++)
	     {
	     	System.out.print(res[i] + " ");
	     }
	     // display(arr);



	}
}
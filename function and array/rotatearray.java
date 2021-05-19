import java.util.Scanner;
public class rotatearray
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
	public static int[] rotateofanarray(int[] arr,int r)
	{
		int n = arr.length;
		r = r % n;
		if(r < 0)
		{
			r = r + n;
		}

		int[] ans = new int[n];
		for(int i = 0; i < n; i++)
		{
			int idx = (i + r) % n;
			ans[idx] = arr[i];
		}
		return ans;
	}
	public static void swap(int[] arr,int i,int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	public static void reverseofanarray(int[] arr,int i,int j)
	{
	
		while(i < j)
		{
			swap(arr,i,j);
			i++;
			j--;
		}
	}
	public static void rotateofanarray2(int[] arr,int r)//without extra space
	{
		int n = arr.length;
		r = r % n;
		if(r < 0)
		{
			r = r + n;
		}
		reverseofanarray(arr , 0 , n - 1);
		reverseofanarray(arr , 0 , r - 1);
		reverseofanarray(arr , r , n - 1);
         
		
	}
	public static void main(String[] args) 
	{
	      int n = sc.nextInt();
	      int[] arr = input(n);
	      display(arr);
	      System.out.println();
	     //  int r = sc.nextInt();
	     //  int[] res = rotateofanarray(arr,r);
	     // for(int i = 0; i < res.length; i++)
	     // {
	     // 	System.out.print(res[i] + " ");
	     // }
	      int r = sc.nextInt();
	      rotateofanarray2(arr,r);
	      display(arr);

	}








}
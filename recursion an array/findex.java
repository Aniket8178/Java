import java.util.Scanner;
public class findex
{
	public static Scanner sc = new Scanner(System.in);

	public static int firstindex(int[] arr,int idx,int data)
	{
		if(idx == arr.length)
		{
			return -1;
		}
		if(arr[idx] == data)
		{
			return idx;
		}

		return firstindex(arr , idx + 1 , data);
	}
	public static void main(String[] args) 
	{
	     int n = sc.nextInt();
	     int[] arr = new int[n];
	     for(int i = 0; i < arr.length; i++)
	     {
	     	 arr[i] = sc.nextInt();
	     }	
         int data = sc.nextInt();
         System.out.println(firstindex(arr,0,data));
	}
}
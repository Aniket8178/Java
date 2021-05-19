import java.util.Scanner;
public class lindex
{
	public static Scanner sc = new Scanner(System.in);

	public static int lastindex(int[] arr,int idx,int data)
	{
		if(idx == arr.length)
		{
			return -1;
		}
		int recans = lastindex(arr,idx + 1,data);
		if(recans != -1)
		{
			return recans;
		}

	    return arr[idx] == data ? idx : -1;
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
         System.out.println(lastindex(arr,0,data));
	}
}
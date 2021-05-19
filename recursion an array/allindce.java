import java.util.Scanner;

public class allindce
{
	public static Scanner sc = new Scanner(System.in);

	public static int[] allIndex(int[] arr,int idx,int data,int count)
	{
		if(idx == arr.length)
		{
			return new int[count];
		}

		if(arr[idx] == data)
		{
			count++;
		}

		int[] recans = allIndex(arr,idx + 1,data,count);
		if(arr[idx] == data)
		{
			recans[count - 1] = idx;
		}

        return recans;
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
        int[] res =  allIndex(arr,0,data,0);
        for(int j = 0; j < res.length; j++)
        {
        	System.out.print(res[j] + " ");
        }
	}
}
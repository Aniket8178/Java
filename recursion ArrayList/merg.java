import java.util.*;
public class merg
{
	public static Scanner sc = new Scanner(System.in);

	public static void mertoearray(int[] arr)
	{
		 
        for(int i = 0; i < arr.length; i++)
        {
        	int temp = arr[i];
        	int j = i;
        	while(j > 0 && arr[j - 1] > temp)
        	{
        		arr[j] = arr[j - 1];
        		j = j - 1;
        	}
        	arr[j] = temp;
        }
        for(int i = 0; i < arr.length; i++)
        {
        	System.out.println(arr[i] + " ");
        }
   
	}
	public static void partionofarray(int[] arr,int povit)
	{
		// 4 , 3 , 10 , 12 , 1 , 6 , 5
		int i = 0;
		int j = arr.length - 1;
		while( i < j)
		{
			if(arr[i] < povit)
			{
				i++;
			}
			else if(arr[j] > povit)
			{
				j--;
			}
			else
			{
				if(arr[i] > arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int k = 0; k < arr.length; k++)
		{
			System.out.print(arr[k] + " ");
		}
	}


	public static void main(String[] args) 
	{
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		partionofarray(arr,7);
    }

}

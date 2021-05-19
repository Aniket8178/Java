import java.util.Scanner;
public class arr2d
{
	public static Scanner sc = new Scanner(System.in);

    public static void input(int[][] arr)
    {
    	int n = arr.length;
    	int m = arr[0].length;

    	for(int i = 0; i < n; i++)
    	{
    		for(int j = 0; j < m; j++)
    		{
    			arr[i][j] = sc.nextInt();
    		}

    	}
    }
    public static void display(int[][] arr)
    {
    	int n = arr.length;
    	int m = arr[0].length;

    	for(int i = 0; i < n; i++)
    	{
    		for(int j = 0; j < m; j++)
    		{
    			System.out.print(arr[i][j] + " ");
    		}
    		System.out.println();
    	}
    }
    public static int maximum(int[][] arr)
    {
    	int n = arr.length;
    	int m = arr[0].length;
    	int maxvalue = -(int)1e9;
    	for(int i = 0; i < n; i++)
    	{
    		for(int j = 0; j < m; j++)
    		{
    			maxvalue = Math.max(maxvalue,arr[i][j]);
    		}
    	}

    	return maxvalue;
    }
    public static int minimum(int[][] arr)
    {
        int n = arr.length;
        int m = arr[0].length;
        int minvalue = (int)1e9;
        for(int i = 0; i < n; i++)
        {
        	for(int j = 0; j < m; j++)
        	{
        		minvalue = Math.min(minvalue,arr[i][j]);
        	}
        }

        return minvalue;
    }
    public static boolean find(int[][] arr,int data)
    {
    	int n = sc.nextInt();
    	int m = sc.nextInt();
    	boolean foundinx = false;
    	for(int i = 0; i < n; i++)
    	{
    		for(int j = 0; j < m; j++)
    		{
    			if(arr[i][j] == data)
    			{
    			    foundinx = true;
    			    break;
    			}
    		}
    	}

    	return foundinx;

    }
	public static void main(String[] args) 
	{
	     int row = sc.nextInt();
	     int coloumn = sc.nextInt();
	     int[][] arr = new int[row][coloumn];
	     input(arr);
	     display(arr);
	     System.out.println();
         int max = maximum(arr);
         System.out.println("maximum eleme fo an array : " + max);
         int min = minimum(arr);
         System.out.println("minimum eleme fo an array : " + min);
         int data  = sc.nextInt();
         boolean res = find(arr,data);
         System.out.println(res);


	}
}
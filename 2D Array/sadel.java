import java.util.Scanner;
public class sadel
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
	public static int maxIncolmn(int[][] arr,int c)
	{
		int n = arr.length;
		int m = arr[0].length;
		int maxval = -(int)1e9;
		int r = -1;
		for(int i = 0; i < n; i++)
		{
			if(arr[i][c] > maxval)
			{
				maxval = arr[i][c];
				r = i;
			}
		}

		return r;
	}
	public static void sadelpoint(int[][] arr)
	{
         int n = arr.length;
         int m = arr[0].length;

         boolean flag = false;
         for(int i = 0; i < n; i++)
         {
         	int minvalue = (int)1e9;
         	int c = -1;
         	for(int j = 0; j < m; j++)
         	{
         		if(arr[i][j] < minvalue)
         		{
         			minvalue = arr[i][j];
         			c = j;
         		}
         	}
         

            int r = maxIncolmn(arr,c);

            if(r == i)
            {
         	    System.out.println(arr[r][c]);
         	    flag = true;
            }
          }

         if(!flag)
         {
         	System.out.println("Invalid input");
         }
	}
	public static void main(String[] args) 
	{
	     int row = sc.nextInt();
	     int column = sc.nextInt();
         int[][] arr = new int[row][column];
         input(arr);
         display(arr);
         System.out.println();
         sadelpoint(arr);

	}



}
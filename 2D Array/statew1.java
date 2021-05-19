import java.util.Scanner;
public class statew1
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
	public static void stateofwakanda(int[][] arr)
	{
		int n = arr.length;
		int m = arr[0].length;

		for(int j = 0; j < m; j++)
		{
            if(j % 2 == 0)
            {
            	for(int i = 0;  i < n; i++)
            	{
            		System.out.println(arr[i][j]);
            	}
            }
            else
            {
                for(int i = n - 1; i >= 0; i--)
                {
                	System.out.println(arr[i][j]);
                }
            }
		}
	}
	public static void stateofwakanda_fb(int[][] arr)
	{
		int n = arr.length;
		int m = arr[0].length;

		for(int i = 0; i < n; i++)
		{
			if(i % 2 == 0)
			{
				for(int j = 0; j < m; j++)
				{
					System.out.println(arr[i][j]);
				}
			}
			else
			{
				for(int j = m - 1; j >= 0; j--)
				{
					System.out.println(arr[i][j]);
				}
			}
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
       stateofwakanda_fb(arr);

	}
}
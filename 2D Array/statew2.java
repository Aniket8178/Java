import java.util.Scanner;
public class statew2
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
	//state of wakanada 2
	public static void diagonalprint(int[][] arr)
	{
		int n = arr.length;
		int m = arr[0].length;

		for(int gap = 0; gap < m; gap++)
		{
			for(int i = 0,j = gap; i < n && j < m; i++,j++)
			{
				System.out.println(arr[i][j]);
			}
		}
	}
	public static void fulldiagonalprint(int[][] arr)
	{
		int n = arr.length;
		int m = arr[0].length;

		for(int gap = n - 1; gap >= 0; gap--)
        {
            for(int i = gap, j = 0; i < n && j < m; i++,j++)
            {
            	System.out.println(arr[i][j]);
            }      
        }

        for(int gap = 0; gap < m; gap++)
        {
        	for(int i = 0 , j = gap ; i < n && j < m; i++,j++)
        	{
        		System.out.println(arr[i][j]);
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
       fulldiagonalprint(arr);
       
	}
}
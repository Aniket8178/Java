import java.util.Scanner;
public class exit
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
	public static void exitpoint(int[][] arr)
	{
		int n = arr.length;
		int m = arr[0].length;
		int i = 0,j = 0;
		int dir = 0;
		while(true)
		{
			dir = (dir + arr[i][j]) % 4;

			if(dir == 0)
			{
                j++;
                if(j == m)
                {
                	System.out.println(i + "\n" + (j - 1));
                	break;
                }
			} 
			else if(dir == 1)
			{
                i++;
                if(i == n)
                {
                	System.out.println((i - 1) + "\n" + (j));
                	break;
                }
			}
			else if(dir == 2)
			{
                j--;
                if(j == -1)
                {
                	System.out.println(i + "\n" + (j + 1));
                	break;
                }
			}
			else
			{
                i--;
                if(i == -1)
                {
                	System.out.println((i + 1) + "\n" + (j));
                	break;
                }
			}
		}

	}
    public static void main(String[] args) 
    {
         int row = sc.nextInt();
         int column  = sc.nextInt();
         int[][] arr = new int[row][column];
         input(arr);
         display(arr);
         System.out.println();
         exitpoint(arr);


    }
}
import java.util.Scanner;
public class rotate
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
    public static void swap(int[][] arr,int i1,int j1,int i2,int j2)
    {
        int temp = arr[i1][j1];
        arr[i1][j1] = arr[i2][j2];
        arr[i2][j2] = temp;
    }
	public static void rotate90(int[][] arr)
    {
        int n = arr.length;
        int m = arr[0].length;
        //transpose
        for(int i = 0; i < n; i++)
        {
            for(int j = i; j < m; j++)
            {

                swap(arr,i,j,j,i);            }
        }

        int si = 0, ei = m - 1;
        while(si < ei)
        {
             for(int i = 0 ; i < n; i++)
             {
                swap(arr,i,si,i,ei);
             }
             si++;
             ei--;
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
         rotate90(arr);
         display(arr);


    }
}
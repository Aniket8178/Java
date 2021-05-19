import java.util.Scanner;
public class basicarray
{
	public static Scanner sc = new Scanner(System.in);

	public static int[] input(int n)
	{
		int[] arr = new int[n];
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}

		return arr;
	}
	public static void display(int[] arr)
	{
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
	public static int maximum(int[] arr)
	{
		int maxele = -(int)1e9;

		for(int ele: arr)
		{
			maxele = Math.max(maxele,ele);
		}

		return maxele;
	}
	public static int minimum(int[] arr)
	{
		int minele = (int)1e9;

		for(int ele: arr)
		{
			minele = Math.min(minele,ele);
		}

		return minele;
	}
	public static int find(int[] arr,int data)
	{
		int foundindx = -1;

		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] == data)
			{
				foundindx = i;
				break;
			}
		}

        return foundindx;
	}
	public static void spanofanarray(int[] arr)
	{
		int sp1 = maximum(arr);
		int sp2 = minimum(arr);

		int res = sp1 - sp2;

		System.out.println("span of an array are: " + res);
	}
     
    public static void main(String[] args) 
    {
       int n = sc.nextInt();
       int data = sc.nextInt();

       int[] arr = input(n);
       display(arr);
       System.out.println();
       // System.out.print(maximum(arr));
       // System.out.println();
       // System.out.print(minimum(arr));
       // System.out.println();
       // System.out.print(find(arr,data));
       spanofanarray(arr);

    }

}
import java.util.Scanner;
public class arraysum
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
    public static int[] input2(int m)
    {
    	int[] arr = new int[m];
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

	public static void sumoftwoarray(int[] arr1,int[] arr2)
	{
		int n = arr1.length;
		int m = arr2.length;
		int p = Math.max(n,m) + 1;

		int[] ans = new int[p];

		int i = n - 1;
		int j = m - 1;
		int k = p - 1;
		int carry = 0;
		while(k >= 0)
		{
			int sum = carry + (i >= 0 ? arr1[i] : 0) + (j >= 0 ? arr2[j] : 0);

			ans[k] = sum % 10;
			carry = sum / 10;

			i--;
			j--;
			k--;

		}
		for(int idx = 0; idx < p; idx++)
		{
			if(idx == 0 && ans[idx] == 0)
			{
				continue;
			}
			System.out.print(ans[idx] + " ");
		}
	}
	public static void main(String[] args) 
	{
	    int n = sc.nextInt();
	    int[] arr1 = input(n);
	    display(arr1);
	    System.out.println();
	    int m = sc.nextInt();
	    int[] arr2 = input2(m);
	    display(arr2);
	    System.out.println();
        sumoftwoarray(arr1,arr2);




	}
}
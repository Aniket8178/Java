import java.util.Scanner;
public class arraysub
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
    public static void substractionofanarray(int[] arr1,int[] arr2)
    {
    	int m = arr1.length;
    	int n = arr2.length;

    	int[] ans = new int[m];
    	int i = m - 1;
    	int j = n - 1;
    	int k = m - 1;
    	int borrow = 0;

    	while(k >= 0)
    	{
    		int diff = borrow + arr1[i] - (j >= 0 ? arr2[j] : 0);
    		if(diff < 0)
    		{
    	         diff += 10;
    			borrow = -1;
    		}
    		else
    		{
    			borrow = 0;
    		}

    		ans[k] = diff;

    		i--;
    		j--;
    		k--;
    	}

    	boolean nozero = false;
    	for (int ele : ans) {
    		if(ele != 0)
    		{
    			nozero = true;
    		}

    		if(nozero)
    		{
    			System.out.print(ele);
    		}
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
        substractionofanarray(arr1,arr2);




	}
}
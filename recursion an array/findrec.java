import java.util.Scanner;
public class findrec
{
	public static Scanner sc = new Scanner(System.in);

	public static boolean find(int[] arr,int idx,int data)
	{
		if(idx == arr.length)
		{
			return false;
		}
		if(arr[idx] == data)
		{
			return true;
		}
		return find(arr,idx + 1,data);
	}
	public static boolean findData2(int[] arr, int idx, int data) {
        if (idx == arr.length)
            return false;

        boolean recRes = findData2(arr, idx + 1, data);
        if (recRes)
            return true;

        return arr[idx] == data;
    }
	public static void main(String[] args) 
	{
	    int n = sc.nextInt();
	    int[] arr = new int[n];
	    for(int i = 0; i < arr.length; i++)
	    {
	    	arr[i] = sc.nextInt();
	    }	
	    int data = sc.nextInt();
	    System.out.println(find(arr,0,data));
	}
}
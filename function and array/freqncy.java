import java.util.Scanner;
public class freqncy
{
	public static Scanner sc = new Scanner(System.in);

	public static void digitfrequenecy(long n,int[] query)
	{
		int[] frq = new int[10];

		while( n != 0)
		{
			long d = n % 10;
			n = n / 10;

			frq[(int)d]++;
		}
		for(int q : query)
		{
			System.out.println(frq[q]);
		}
	}
	public static void main(String[] args) 
	{
	     long n =  sc.nextLong();

	     int m = sc.nextInt();
	     int[] query = new int[m];
	     for(int i = 0; i < query.length; i++)
	     {
	     	query[i] = sc.nextInt();
	     }	
	     digitfrequenecy(n,query);
	}
}
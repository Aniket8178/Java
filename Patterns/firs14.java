import java.util.*;
public class firs14
{
	public static Scanner sc = new Scanner(System.in);

	public static void multiplication(int n)
	{
		for(int i = 1; i <= 10; i++)
		{
			int mul = n * i;
			System.out.println(n + " * " + i + " = " + mul);
		}
	}
	public static void main(String[] args) {
		
		int n = sc.nextInt();
		multiplication(n);
	}
}
// 3 * 1 = 3
// 3 * 2 = 6
// 3 * 3 = 9
// 3 * 4 = 12
// 3 * 5 = 15
// 3 * 6 = 18
// 3 * 7 = 21
// 3 * 8 = 24
// 3 * 9 = 27
// 3 * 10 = 30
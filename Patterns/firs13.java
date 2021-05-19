import java.util.*;
public class firs13
{
	public static Scanner sc = new Scanner(System.in);

	 public static void binomialPattern(int n) {
        for (int i = 0; i < n; i++) {
            int ncr = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(ncr + "\t");
                int ncr1 = ((i - j) * ncr) / (j + 1);
                ncr = ncr1;
            }
            System.out.println();
        }
    }
	public static void main(String[] e)
	{
		int n = sc.nextInt();
		binomialPattern(n);
	}
}
// 1
// 1       1
// 1       2       1
// 1       3       3       1
// 1       4       6       4       1
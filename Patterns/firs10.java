import java.util.*;
public class firs10
{
	public static Scanner sc = new Scanner(System.in);
	public static void hollowdiamond(int n)
    {
         int nspo = n / 2;
         int nspi = -1;

         for(int row = 1; row <= n; row++)
         {
         	 for(int cspo = 1; cspo <= nspo; cspo++)
         	 {
         	 	 System.out.print("\t");
         	 }
         	 System.out.print("*\t");
         	 for(int cspi = 1; cspi <= nspi; cspi++)
         	 {
         	 	System.out.print("\t");
         	 }

         	 if(nspi != -1)
         	 {
         	 	System.out.print("*\t");
         	 }

         	 if(row <= n / 2)
         	 {
         	 	nspo--;
         	 	nspi = nspi + 2;
         	 }
         	 else
         	 {
         	 	nspo++;
         	 	nspi = nspi - 2;
         	 }
         	 System.out.println();
         }
    }
    public static void main(String[] args)
    {
    	 int n = sc.nextInt();
    	 hollowdiamond(n);
    }
}

//                 *
//         *               *
// *                               *
//         *               *
//                 *




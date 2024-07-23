import java.util.*;
public class ZeroSumSubarray{

        public static boolean hasZeroSumSubarray (int[] arr){
            HashSet<Integer> has = new HashSet<>();

            int zerosum = 0;
            for(int nnum : arr){

                zerosum += nnum;
                if(zerosum == 0 || has.contains(zerosum)){
                    return true;
                }

                has.add(zerosum);
            }
            return false;
        }
        public static void main(String[] args){
              int[] array = {1, 2, -3, 4, 5};
                boolean result = hasZeroSumSubarray(array);
        
                if (result) {
                        System.out.println("Yes, there is a subarray with zero sum.");
                } else {
                         System.out.println("No, there is no subarray with zero sum.");
                }
        }
}
import java.util.*;
public class KeyPair{
        
        public static void findpair(int[] arr , int target){
              
              HashSet<Integer> hashset = new HashSet<>();

              for(int num : arr){
                  int res = target - num;

                  if(hashset.contains(res)){
                     System.out.println("Pair found: (" + res + ", " + num + ")");
                  }

                    hashset.add(num);
              }

        }
        public static void main(String[] args){
            int[] array = {1, 4, 6, 8, 2, 5, 7};
            int targetSum = 10;

            findpair(array, targetSum);
        }
}
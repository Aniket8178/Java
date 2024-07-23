import java.util.*;
public class RepeatingElement{

        public static int findRepeatingElement(int[] arr){

                Map<Integer , Integer> hash = new HashMap<>();

                for(int num : arr){
                    hash.put(num , hash.getOrDefault(num , 0) + 1);
                }


                for(int num : arr){
                    if(hash.get(num) == 2){
                        return num;
                    }
                }

                return 0;
        }
        public static void main(String[] args){
            int[] arr = {1 , 5 , 3 , 4 , 3 , 5 , 6};

            int result = findRepeatingElement(arr);
            if (result != 0) {
                 System.out.println("The first non-repeating element is: " + result);
            } else {
                 System.out.println("There is no non-repeating element in the array.");
            }
        }
}
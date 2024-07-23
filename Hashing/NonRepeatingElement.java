import java.util.*;
public class NonRepeatingElement{
    

    public static int findNonReatingElements(int[] arr){

            Map<Integer , Integer> hashmap = new HashMap<>();

            for(int num : arr){
                hashmap.put(num , hashmap.getOrDefault(num , 0) + 1);
            }

            for(int num : arr){
                if(hashmap.get(num) == 1){
                    return num;
                }
            }

            return 0;

    }
    public static void main(String[] args){
        int[] arr = {1 , -1 , 2 , -1 , 3 , 2};

        int result = findNonReatingElements(arr);
        if (result != 0) {
            System.out.println("The first non-repeating element is: " + result);
        } else {
            System.out.println("There is no non-repeating element in the array.");
        }
    }


}
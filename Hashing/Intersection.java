import java.util.*;
public class Intersection{

    public static int intersection(int[] arr1 , int[] arr2){
        int n = arr1.length;
        int m = arr2.length;

         HashSet<Integer> numbers = new HashSet<>();

         for(int i = 0 ; i < n; i++){
              numbers.add(arr1[i]);
         }

         int count = 0;
         for(int j = 0; j < m; j++){
            if(numbers.contains(arr2[j])){
                count++;
            }
         }
         return count;
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8};

        int commonCount = intersection(arr1, arr2);
        System.out.println("Number of common elements: " + commonCount);
    }
}
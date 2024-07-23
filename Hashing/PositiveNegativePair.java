import java.util.*;
public class PositiveNegativePair{

    public static void findpairs(int[] arr){
        
        Map<Integer , Integer> map = new HashMap<>();
        
        for(int num : arr){

            if(map.containsKey(-num)){
                System.out.println("Pair found: (" + num + ", " + (-num) + ")");
                if(map.get(-num) == 1){
                    map.remove(-num);
                }
                else{
                    map.put(-num , map.get(-num) - 1);
                }
            }
            else{
                map.put(num , map.getOrDefault(num , 0) + 1);
            }
        }
            
    }
    public static void main(String[] args) {
        int[] arr = {1, -2, 3, 4, -1, 2, -3, 5};
        findpairs(arr);
    }
}
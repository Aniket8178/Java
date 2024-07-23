import java.util.*;
public class ElectionWinner{
    
    public static String findwinner(String[] arr){

            Map<String , Integer> votecount = new HashMap<>();

            for(String vote : arr){
                votecount.put(vote , votecount.getOrDefault(vote , 0) + 1);
            }

            String winner = null;
            int maxvote = 0;

            for(Map.Entry<String , Integer> entry : votecount.entrySet()){
                 if(entry.getValue() > maxvote){
                        maxvote = entry.getValue();
                        winner = entry.getKey();
                 }
                 else if(entry.getValue() == maxvote){
                     if(winner == null || entry.getKey().compareTo(winner) < 0){
                        winner = entry.getKey();
                     }
                 }
            }

            return winner;
    }

    public static void main(String[] args) {
        String[] votes = {"Alice", "Bob", "Alice", "Cathy", "Bob", "Bob", "Alice"};
        String winner = findwinner(votes);
        System.out.println("The winner is: " + winner);
    }
}
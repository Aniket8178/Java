import java.util.*;

public class GroupAnagram {

    public static List<List<String>> groupAnagram(String[] str) {
        if (str == null || str.length == 0) {
            return new ArrayList<>();
        }

        Map<String, List<String>> map = new HashMap<>();
        for (String strs : str) {
            char[] charArray = strs.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = new String(charArray);

            if (!map.containsKey(sortedStr)) {
                map.put(sortedStr, new ArrayList<>());
            }

            map.get(sortedStr).add(strs);
        }

        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> groupedAnagrams = groupAnagram(input);

        // Print the grouped anagrams
        for (List<String> group : groupedAnagrams) {
            System.out.println(group);
        }
    }
}

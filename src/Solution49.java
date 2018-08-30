import java.util.*;

public class Solution49 {


    public static List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> res= new LinkedList<>();

        Map<String,List<String>> map= new HashMap<>();
        for(String str: strs) {
            char[] chars=str.toCharArray();
            Arrays.sort(chars);
            String key =new String(chars);
            if(map.containsKey(key)) map.get(key).add(str);
            else map.put(key, new ArrayList<>(Arrays.asList(str)));
        }
        return  new LinkedList<>(map.values()) ;
    }

    public static void main (String[] args) {

        String[] strs = new String[] { "eat", "tea", "tan", "ate", "nat", "bat"};

        List<List<String>> res = groupAnagrams(strs);
    }
}

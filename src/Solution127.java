import java.util.*;
public class Solution127 {
    public static int ladderLength(String beginWord, String endWord, List<String> wordList) {

        Set<String> words= new HashSet<>(wordList);
        Map<String,Integer> map= new HashMap<>();
        Queue<String> queue= new LinkedList<>();
        map.put(beginWord,1);
        queue.add(beginWord);

        while(!queue.isEmpty()) {
            String  word= queue.poll();
            for(int i=0;i<word.length();i++) {
                char[] cs= word.toCharArray();
                for(char c='a';c<='z';c++) {
                    cs[i]=c;
                    String newWord= new String(cs);
                    if(words.contains(newWord) && newWord.equals(endWord)) return map.get(word)+1;
                    if(words.contains(newWord) && !map.containsKey(newWord)) {
                        queue.add(newWord);
                        map.put(newWord,map.get(word)+1);
                    }
                }
            }
        }
        return 0;

    }

    public static void main (String[] args) {

       String beginWord = "hit", endWord = "cog";
       List<String>  wordList = Arrays.asList("hot","dot","dog","lot","log","cog");

       int res = ladderLength(beginWord,endWord,wordList);

       System.out.println(res);



    }
}

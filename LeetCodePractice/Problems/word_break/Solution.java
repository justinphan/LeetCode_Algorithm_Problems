package word_break;

import java.util.*;

public class Solution {
	public static boolean wordBreak(String s, Set<String> dict) {   
        boolean[] f = new boolean[s.length() + 1];
        
        f[0] = true;

        for(int i=1; i <= s.length(); i++){
            for(int j=0; j < i; j++){
                if(f[j] && dict.contains(s.substring(j, i))){
                    f[i] = true;
                    break;
                }
            }
        }
        
        return f[s.length()];
	 }
	
	public static void main(String[] args) {
		Set<String> wordDict = new HashSet<>(
				Arrays.asList(new String[]{"cats", "dog", "sand", "and", "cat"}));
		System.out.print(wordBreak("catsandog",wordDict ));
	}
}

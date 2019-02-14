package MostCommonWord;

import java.util.HashMap;
import java.util.HashSet;

public class Solution {
    public static String mostCommonWord(String paragraph, String[] banned) {
    	int max = 0;
    	String res = null;
    	String delims = "[!?',;. ]+";
    	String[] tokens = paragraph.toLowerCase().split(delims);
    	
    	HashSet<String> bannedSet = new HashSet<String>();
    	for (int i = 0 ; i < banned.length; i++) {
    		bannedSet.add(banned[i]);
    	}
    	
    	HashMap<String, Integer> map = new HashMap<String, Integer>();
    	for (int i = 0 ; i < tokens.length; i++) {
    		String word = tokens[i];
    		if (!bannedSet.contains(word)) {
    			map.put(tokens[i], 1+ map.getOrDefault(tokens[i], 0));
    			if (map.get(tokens[i])>max) {
    				res = tokens[i];
    				max = map.get(word);
    			}
    		}
    	}
        return res;
    }
    
    public static void main(String[] args) {
    	String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
    	System.out.println(mostCommonWord(paragraph, new String[] {"hit"}));
    }
}

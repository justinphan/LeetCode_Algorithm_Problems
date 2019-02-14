package LongestSubstringWithoutRepeatingCharacters;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public static int lengthOfLongestSubstring(String str) {
        int max = 0;
		Map<Character, Integer> myset = new HashMap<Character, Integer>();
        int j = 0, i = 0;
		while (j < str.length() && i < str.length()){
            if (myset.containsKey(str.charAt(j))){
                i = Math.max(i, myset.get(str.charAt(j))+1);
            }
            max = Math.max(max, j-i+1);
            myset.put(str.charAt(j),j);
            j++;
        }
        return max;  
    }
    
    public static void main(String[] args) {
    	System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }
}



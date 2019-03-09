import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
	  Map<Character, String> phone = new HashMap<Character, String>() {{
	    put('2', "abc");
	    put('3', "def");
	    put('4', "ghi");
	    put('5', "jkl");
	    put('6', "mno");
	    put('7', "pqrs");
	    put('8', "tuv");
	    put('9', "wxyz");
	  }};
	    public List<String> letterCombinations(String digits) {
	    	List<String> res1 = new ArrayList<>();
	        if (digits.length()==0) return res1 ;
	    	trackback(res1, new StringBuilder(), digits);
	        return res1;
	    }
	    
	    public void trackback(List<String> res, StringBuilder cur, String input) {
	    	if (cur.length()==input.length()) {
	    		res.add(cur.toString());
	    	}
	    	else {
	    		//int digit = Character.getNumericValue(input.charAt(cur.length()));
	    		//int number_of_char_in_digit = (digit!=7 && digit!=9)?3:4;
	            //int base =(digit-2)*3+97+((digit>=8)?1:0);
	            String letters = phone.get(input.charAt(cur.length()));

	    		for (int i = 0; i < letters.length(); i ++ ) {
	    			cur.append(letters.charAt(i));
	    			trackback(res, cur, input);
	    			cur.deleteCharAt(cur.length()-1);
	    		}
	    	}
	    }
	}

public class MainClass {
    public static String stringListToString(List<String> stringList) {
        StringBuilder sb = new StringBuilder("[");
        for (String item : stringList) {
            sb.append(item);
            sb.append(",");
        }
    
        sb.setCharAt(sb.length() - 1, ']');
        return sb.toString();
    }
    
    public static void main(String[] args) throws IOException {
 //       String line;
       
//            String digits = stringToString(line);
        	String digits ="8";
            List<String> ret = new Solution().letterCombinations(digits);
 //           String out = stringListToString(ret);
            System.out.print(Arrays.toString(ret.toArray()));
        
    }
}
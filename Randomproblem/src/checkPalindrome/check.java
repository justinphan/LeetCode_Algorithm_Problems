package checkPalindrome;

public class check {
	public static void main(String[] args) {
		System.out.println(checkPalindrome("ABABA"));
	}
	
	public static boolean checkPalindrome(String s) {
		if (s.length()==0 || s.length()==1) return true;
		else if (s.charAt(0)!=s.charAt(s.length()-1)) return false;
		else return checkPalindrome(s.substring(1, s.length()-1));
	}
}

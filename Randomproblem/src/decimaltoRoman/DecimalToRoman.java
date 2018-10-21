package decimaltoRoman;

public class DecimalToRoman {
	public static String decimal2roman(int n) {
		int res = 0;
	return  null;
	}
	
	public static String dec2ro(int n) {
		switch(n){
		case 1: return "I";
		case 2: return "II";
		case 3: return "II";	
		default: return"";
		}
	}
	
	public static int str2int(char s) {
		switch(s){
		case 'I': return 1;
		case 'V': return 5;
		case 'X': return 10;
		case 'L': return 50;
		case 'C': return 100;
		case 'D': return 500;
		case 'M': return 1000;
		default: return 0;
		}
	}
	
	
	public static int roman2deciaml(String n) {
		int res = 0;
		char[] array = n.toCharArray();
		int prev = str2int(array[0]);
		for (char c : array) {
			res +=str2int(c);
			if (str2int(c) > prev){
				res = res - 2*prev;
			}
			prev = str2int(c);
		}
		return res;
	}
	
	public static void main(String[] args) {
		System.out.print(roman2deciaml("MMXIV"));
	}
	
}

package googlematch;

public class cammel {
	
	public static String convert (String str) {
		StringBuilder res = new StringBuilder();
		if (str.length() == 0) return res.toString();
		res.append(Character.toLowerCase(str.charAt(0)));
		for (int i = 1; i < str.length(); i++) {
			if (Character.isUpperCase(str.charAt(i))){
				res.append('_');
				res.append(Character.toLowerCase(str.charAt(i)));
			}
			else res.append(str.charAt(i));
		}
		return res.toString();
	}
	
	
	
	public static void main(String[] args) {
		System.out.println(convert("HelloWorldHowAreYou"));
	}
}

package findGCD;

public class findGCD {
	public static int find(int a, int b) {
		if (a < b) swap(a, b);
		int r = a%b;
		if (r==0) return b;
		return find(b, r);
	}
	
	public static void main(String[] args) {
		System.out.println(find(20,10));
	}
	
	public static void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
	}
}


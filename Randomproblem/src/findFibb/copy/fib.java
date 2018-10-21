package findFibb.copy;

public class fib {
	public static boolean checkfib (int n) {
		int i = 0;
		int fib = fib2(i);
		
		while (fib < n)
			fib = fib2(i++);
		
		return fib==n?true:false;
	}
	
	public static int fib2 (int n) {
		if (n == 0) return 0;
		if (n == 1) return 1;
		return fib2(n-1)+fib2(n-2);
	}
	
	public static void main(String[] args) {
		System.out.println(checkfib(34));
	}
}

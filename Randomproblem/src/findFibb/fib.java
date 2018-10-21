package findFibb;

public class fib {
	public static int fib1 (int n) {
		if (n == 0) return 0;
		if (n == 1) return 1;
		int[] arr = new int[n+1];
		arr[0] = 0;
		arr[1] = 1;
		for (int i = 2; i<=n; i++) arr[i] = arr[i-1]+ arr[i-2];
		return arr[n];
	}
	
	public static int fib2 (int n) {
		if (n == 0) return 0;
		if (n == 1) return 1;
		return fib2(n-1)+fib2(n-2);
	}
	public static void main(String[] args) {
		System.out.println(fib1(8));
	}
}

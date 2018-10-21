package findFibb.copy.copy;

public class fib {

	
	public static void main(String[] args) {
		System.out.println(checkfib(14));
	}
	

	
	public static boolean checkfib (int n) {
		if (n == 0 || n == 1) return true;
		int first = 0;
		int second = 1;
		int res = first + second;
		
		while (res < n) {
			int temp = res;
			res = second + res;
			first = second;
			second = temp;
		}
		
		return res==n?true:false;
	}
}

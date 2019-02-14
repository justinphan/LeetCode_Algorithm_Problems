package DivideTwoIntegers;

public class Solution {
	static int divide(int devident, int divisor) {
		int sign = (devident>0 && divisor<0||devident <0 && divisor>0)?-1:1;
		devident = Math.abs(devident);
		divisor = Math.abs(divisor);
		int quote = 0;
		while (devident>=divisor) {
			quote++;
			devident-=divisor;
		}
		return sign*quote;
	}
	
	static long divide2(long divident, long divisor) {
		long sign = (divident>0 && divisor<0
				||divident <0 && divisor>0)?-1:1;
		divident = Math.abs(divident);
		divisor = Math.abs(divisor);
		long temp = 0, quote = 0;
		
		for (int i = 31 ; i>=0; i--) {
			if (temp+divisor<<i <= divident) {
				temp+= divisor<<i;
				quote = (quote|(1L<<i));
				System.out.println(quote);
			}
		}
		return quote*sign;
	}
	
	public static void main(String[] args) {
		System.out.println(divide2(7,-2));
		
//		long l = 12345L;
//		String str = Long.toString(l);
//		int number = 2;
		int number2;
		number2 = 1<<31;
		System.out.println(number2);
//		System.out.println(str);
	}
}

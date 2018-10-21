package missingNumber;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class missingnumber {
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(missing(new int[]{3,5,9})));
	}
	
	public static int[] missing(int[] arr) {
		List<Integer> list = new LinkedList<Integer>();
		
		int num = arr[0];
		int curr = 0;
	
		while (num < arr[arr.length-1]) {
			if (num != arr[curr]) {
				list.add(num);
			}
			else  	curr++;
			num++;
		}
		
		int[] res = new int[list.size()];
		int i = 0;
		for ( Integer e : list) {
			res[i] = e;
			i++;
		}
		return res;	
	}
}

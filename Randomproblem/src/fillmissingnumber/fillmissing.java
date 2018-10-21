package fillmissingnumber;

import java.util.Arrays;
import java.util.LinkedList;

public class fillmissing {
	public static int[] fill(int[] num) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		for (int i = 0; i <num.length-1; i++){
			int runner = num[i]+1;
			while (runner < num[i+1]) {
				list.add(runner);
				runner++;
			}
		}
		int [] res = list.stream().mapToInt(Integer::intValue).toArray();
		return res;
	}
	public static void main(String[] args) {
		System.out.println(Arrays.toString((fill(new int[] {3,7,10}))));
	} 
}

package Problem_338_Counting_Bits;

import java.util.Arrays;

public class Solution {
	public static void main(String[] args) {
		int n = 35;
		System.out.println(Arrays.toString(countBits2(n)));
	}
	
    public static int[] countBits(int num) {
        num++;
		int [] res = new int[num];
		res[0]=0;
		if (num==1) return res;
		int i = 1;
		int k =1 ;

		while (i<num) {
			int j = 0;
			while(i<num && j < k) {

				res[i]=res[j]+1;
				System.out.println("num: " + i +"\t:"+Integer.toBinaryString(i)+ "\t : " + res[i] );

				j++;
				i++;	
			}	
			k=k*2;
		}
        return res;
    }
    
    public static int[] countBits2(int num) {
        num++;
		int [] res = new int[num];
		res[0]=0;
		for (int i = 1; i < num; i++) {
			int j = i;
			res[i]=res[j>>1]+1;
			System.out.println(Integer.toBinaryString(j>>1)+" \tnum: " + i +
					"\t:"+Integer.toBinaryString(i)+ "\t : " + res[i] );
		}
        return res;
    }
}

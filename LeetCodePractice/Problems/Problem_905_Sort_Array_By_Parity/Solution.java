package Problem_905_Sort_Array_By_Parity;

public class Solution {
	public static void main(String[] args) {
		
	}
	
	public int[] sortArrayByParity(int[] A) {
        int[] res = new int[A.length];
        int first = 0; 
        int end = A.length-1;
        
        for (int i = 0; i<A.length;i++) {
        	if (A[i]%2 ==0) {
        		res[first]=A[i];
        		i++;
        	}
        	else {
        		res[end]=A[i];
        		i--;
        	}
        }
        return res;
    }
}

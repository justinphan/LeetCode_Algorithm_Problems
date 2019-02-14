package Problem_448_Find_All_Numbers_Disappeared_in_an_Array;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Problem_448_Find_All_Numbers_Disappeared_in_an_Array {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new LinkedList<Integer>();
        for (int i = 0; i < nums.length; i++) {
        	int val = Math.abs(nums[i]);
        	if (nums[val-1]>0) nums[val-1] = -nums[val-1];
        }
        
        for (int i = 0; i < nums.length; i++) {
        	if (nums[i]>0) {
        		list.add(i+1);
        	}
        }
        
        return list;
    }
    
    public static void main(String[] args) {
    	int[] nums = new int[] {4,3,2,7,8,2,3,1};
    	String res = Arrays.toString(findDisappearedNumbers(nums).toArray());
    	System.out.println(res);
    	
    }
}

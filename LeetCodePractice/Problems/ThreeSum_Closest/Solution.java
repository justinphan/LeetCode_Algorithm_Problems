package ThreeSum_Closest;

import java.util.Arrays;

class Solution {
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int best_sum = nums[0]+nums[1]+nums[2];
        for (int i = 0; i < nums.length; i++){
            int lo = i+1;
            int hi = nums.length-1;
            
            while (lo<hi){
                if (nums[i]+nums[lo]+nums[hi]==target) return nums[i]+nums[lo]+nums[hi];
                else if ( Math.abs(nums[i]+nums[lo]+nums[hi]-target)<Math.abs(best_sum-target)){
                    best_sum = nums[i]+nums[lo]+nums[hi];
                }
                if (nums[i]+nums[lo]+nums[hi] > target) hi--;
                else if (nums[i]+nums[lo]+nums[hi] < target) lo++;
            }
        }
        return best_sum;
    }
    
    public static void main(String[] args) {
    	System.out.println(threeSumClosest(new int[] {0,2,1,-3},1));
    }
}
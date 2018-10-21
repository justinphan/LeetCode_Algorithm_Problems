package permutation;

import java.util.ArrayList;
import java.util.List;

public class permutation {
	public static void main(String[] args) {
		System.out.print(permute(new int[] {1,2,3}));
	}
	
	public static List<List<Integer>> permute(int[] num){
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		List<Integer> temp = new ArrayList<Integer>();
		if (num.length!=0) temp.add(num[0]);
		res.add(temp);
		for (int i = 1; i < num.length; i++) {
			List<List<Integer>> new_res = new ArrayList<List<Integer>>();
			for (int j = 0; j <= i; j++) {
				for (List<Integer> l : res) {
					List<Integer> new_list = new ArrayList<Integer>(l);
					new_list.add(j,num[i]);
					new_res.add(new_list);
				}
				res= new_res;
			}
		}
		return res;
	}
	
	public static List<List<Integer>> permute2(int[] num) {
	    List<List<Integer>> ans = new ArrayList<List<Integer>>();
	    if (num.length ==0) return ans;
	    List<Integer> l0 = new ArrayList<Integer>();
	    l0.add(num[0]);
	    ans.add(l0);
	    for (int i = 1; i< num.length; ++i){
	        List<List<Integer>> new_ans = new ArrayList<List<Integer>>(); 
	        for (int j = 0; j<=i; ++j){            
	           for (List<Integer> l : ans){
		        	   List<Integer> new_l = new ArrayList<Integer>(l);
		        	   new_l.add(j,num[i]);
		        	   new_ans.add(new_l);
	           }
		       ans = new_ans;
	        }
	    }
	    return ans;
	}
}

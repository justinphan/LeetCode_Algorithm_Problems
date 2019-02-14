package Problem_404_Sum_of_Left_Leaves;

import CtCILibrary.BTreePrinter;
import CtCILibrary.TreeNode;

public class Problem_144_Binary_Tree_Preorder_Traversal {
	

    public static int sumOfLeftLeaves(TreeNode root) {
    	if (root == null) return 0;
    	if (root.left!=null && root.left.left==null && root.left.right==null) {
    		return root.left.val + sumOfLeftLeaves(root.right);
    	}
    	return sumOfLeftLeaves(root.left)+sumOfLeftLeaves(root.right);
    }
	
    public static int sumOfLeftLeaves2(TreeNode root) {
    	if (root == null) return 0;
    	int sum = 0;
    	if (root.left!=null && root.left.left==null && root.left.right==null) {
    		sum = root.left.val;
    	}
    	return sum + sumOfLeftLeaves(root.right)+sumOfLeftLeaves(root.left);
    }
	
    
	public static void main(String[] args) {
		TreeNode one = new TreeNode(4);
		TreeNode two = new TreeNode(2);
		TreeNode three = new TreeNode(7);
		TreeNode four = new TreeNode(1);
		TreeNode five = new TreeNode(3);
		TreeNode six = new TreeNode(6);
		TreeNode seven = new TreeNode(9);
		one.left = two;
		one.right = three;
		two.left = four;
		two.right = five;
		three.left = six;
		three.right = seven;

		BTreePrinter.printNode(one);
		
		int m = sumOfLeftLeaves(one);
		System.out.println(m);
	}

}

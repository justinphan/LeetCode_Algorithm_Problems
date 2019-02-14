package Problem_338_Merge_Two_Binary_Trees;
import CtCILibrary.*;


public class Problem_338_Merge_Two_Binary_Trees {
	public static TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
		if (t1==null && t2==null) {
			return null;
		}
		if (t1==null) {
			return t2;
		}
		if (t2==null) {
			return t1;
		}
		TreeNode newnode = new TreeNode(t1.val+t2.val); 
		newnode.left = mergeTrees(t1.left,t2.left);
		newnode.right = mergeTrees(t1.right, t2.right);
        return newnode;
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
		
		TreeNode one2 = new TreeNode(3);
		TreeNode two2 = new TreeNode(2);
		TreeNode three2 = new TreeNode(12);
		TreeNode four2 = new TreeNode(9);
		TreeNode five2 = new TreeNode(1);
		TreeNode six2 = new TreeNode(4);
		TreeNode seven2 = new TreeNode(6);
		one2.left = two2;
		one2.right = three2;
		two2.left = four2;
		three2.left = six2;
		three2.right = seven2;
		seven2.right = five2;

		BTreePrinter.printNode(one);
		BTreePrinter.printNode(one2);
		BTreePrinter.printNode(mergeTrees(one,one2));

	}
}

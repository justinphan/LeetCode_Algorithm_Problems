package Problem_144_Binary_Tree_Preorder_Traversal;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

import CtCILibrary.BTreePrinter;
import CtCILibrary.TreeNode;

public class Problem_144_Binary_Tee_Preorder_Traversal {

	public static List<Integer> mylist = new LinkedList<Integer>();
    public static void preorderTraversal_recursive(TreeNode root) {
    	if (root == null) return;
    	mylist.add(root.val);
    	preorderTraversal_recursive(root.left);
    	preorderTraversal_recursive(root.right);
    }
    
    public static List<Integer> preorderTraversal(TreeNode root) {
    	List<Integer> mylist = new LinkedList<Integer>();
    	if (root==null) return null;
    	Stack<TreeNode> myStack = new Stack<TreeNode>();
    	myStack.add(root);
    	TreeNode node;
    	while (!myStack.isEmpty()) {
    		node = myStack.pop();
    		mylist.add(node.val);
    		System.out.println(node.val);
    		if (node.right!=null) myStack.push(node.right);
    		if (node.left!=null) myStack.push(node.left);
    	}
    	return mylist;
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
		//preorderTraversal_recursive(one);
		System.out.println(Arrays.toString(preorderTraversal(one).toArray()));

	}
}

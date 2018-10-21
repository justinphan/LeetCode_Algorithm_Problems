package Temp;

import java.util.Arrays;

class Node {
	public int val;
	public Node next;
	public Node(int val) {
		this.val = val;
	}
}

public class temperature {
	
	public static int[] dailyTemperatures(int[] temp) {
		Node head = null;
		for (int i = 0; i < temp.length; i ++) {
			while (head!=null &&temp[i] > temp[head.val]) {
				temp[head.val] = i - head.val;
				head = head.next;
			}
			Node node = new Node(i);
			node.next = head;
			head = node;
		}
		
		while (head != null) {
			temp[head.val] = 0;
			head = head.next;
		}
		return temp;
	}
	
//	public static void dailyTemperatures(int unfilled, int cur, int[] t) {
//		while (cur < t.length -1) {
//			if (t[cur]>=t[cur+1]) {
//				dailyTemperatures(cur, cur + 1, t);
//			}
//			if (t[cur]<t[cur+1]) {
//				t[cur] = 1;
//				if (t[cur + 1] > t[unfilled]) {
//					unfilled 
//				}
//		}
//		
//		return;
//	}
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(dailyTemperatures(new int[] {73, 74, 75, 71, 69, 72, 76, 73})));
	}
}

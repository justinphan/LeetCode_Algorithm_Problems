package Problem_2_Add_Two_Numbers;

import java.util.ArrayList;

/* https://leetcode.com/problems/add-two-numbers/description/
 * You are given two non-empty linked lists representing two non-negative integers. 
 * The digits are stored in reverse order and each of their nodes contain a single digit. 
 * Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807.*/


public class Solution {
	
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    	int carry = 0;
    	ListNode prehead = new ListNode(0);
    	ListNode runner = prehead;
    	while (l1!= null || l2!=null || carry!=0) {
    		int val = (l1==null?0:l1.val) + (l2==null?0:l2.val) + carry;
    		carry = val/10;
            val = val%10;
    		runner.next = new ListNode(val);
            runner = runner.next;
    		if (l1!=null) l1 = l1.next; 
    		if (l2!=null) l2 = l2.next;
    	}
        return prehead.next;
    }   
}


class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
}

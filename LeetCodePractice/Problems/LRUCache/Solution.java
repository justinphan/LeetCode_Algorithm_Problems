package LRUCache;

import java.util.HashMap;

public class Solution {
	public static void main(String[] args) {
		LRUCache cache = new LRUCache(3);
		cache.put(1, 5);
		cache.put(2, 6);
		System.out.println(cache.get(2));
		cache.put(3, 7);
		System.out.println(cache.get(2));

		

	}
}

class LRUCache {
	
	private HashMap<Integer, Node> map =  new HashMap<Integer, Node>();
	int freeslot;
	int capacity;
	Node head;
	Node tail;
    public LRUCache(int capacity) {
        this.capacity = capacity;
        freeslot = capacity;
    }
    
    public int get(int key) {
    	if (map.containsKey(key)) {
    		//update linkedlist;
    		Node cur = map.get(key);
//    		if(cur.next!=null && cur.prev!=null) cur.next.prev = cur.prev;
//    		tail.next = cur;
//    		cur.prev = tail;
    		
    		if (cur!=tail) {
    			if (cur==head) {
    				tail.next=cur;

    				cur.next = null;
    				cur.prev= tail;
    				head = head.next;
    				head.prev= null;			
    			}
    			else {
    	    		cur.prev.next = cur.next;
    	    		cur.next.prev = cur.prev;
    	    		tail.next = cur;
    	    		cur.prev = tail;
    			}
    		}
    		return map.get(key).value;
    		
    	}
    	else return -1;
    }
    
    public void put(int key, int value) {
    	if (map.containsKey(key)) {
    		Node cur = map.get(key);
    		cur.prev.next = cur.next;
    		cur.next.prev = cur.prev;
    		tail.next = cur;
    		cur.prev = tail;
    		cur.value=value;
    	}
    	else if (freeslot > 0) {
        	Node node = new Node (value, key);
        	if (tail!=null) {
        		tail.next=node;
        		node.prev=tail;
        		tail = node;
        		}
        	else {
        		head = node;
        		tail = node;
        	}
        	freeslot--;
        	map.put(key, node);
        }
    	//freeslot == 0;
    	else {
    		Node temp = head;
    		map.remove(head.key);
    		head = temp.next;
    		
        	Node node = new Node (value, key);
        	if (tail!=null) {
        		tail.next=node;
        		node.prev=tail;
        		tail = node;
        		}
        	else {
        		head = node;
        		tail = node;
        	}
        	freeslot--;
        	map.put(key, node);
    	}
    }
}


class Node {
int value;
int key;
Node next;
Node prev;
	public Node (int key, int value) {
		this.key = key;
		this.value = value;
	}
}

//class LRUCache {
//	
//	private HashMap<Integer, Integer> map =  new HashMap<Integer, Integer>();
//	int freeslot;
//	int capacity;
//	Node head;
//	Node tail;
//    public LRUCache(int capacity) {
//        this.capacity = capacity;
//        freeslot = capacity;
//    }
//    
//    public int get(int key) {
//    	if (map.containsKey(key)) {
//    		//update LinkedinList;
//    		
//    		return map.get(key);
//    		
//    	}
//    	else return -1;
//    }
//    
//    public void put(int key, int value) {
//    	if (map.containsKey(key)) {
//    		map.get(key).val= value;
//    	}
//    	else if (freeslot > 0) {
//        	Node node = new Node (value, key);
//        	if (tail!=null) {
//        		tail.next=node;
//        		node.prev=tail;
//        		tail = node;
//        		}
//        	else {
//        		head = node;
//        		tail = node;
//        	}
//        	freeslot--;
//        }
//    	//freeslpt == 0;
//    	else {
//    		
//    		head = head.next;
//    	}
//    }
//}
//
//class Node {
//	int key;
//	Node next;
//	Node prev;
//	public Node (int key) {
//		this.key = key;
//	}
//}
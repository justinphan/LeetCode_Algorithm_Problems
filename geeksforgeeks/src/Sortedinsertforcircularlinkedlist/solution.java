package Sortedinsertforcircularlinkedlist;

class LinkedList{
	Node head;
	LinkedList(){ head = null; }
    void sortedInsert(Node new_node) {
    	if (head==null) {
    		head = new_node;
    		head.next = head;
    		return;
    		}
    	Node runner = head;
    	if (runner.data > new_node.data) {
    		while (runner.next!=head) runner = runner.next;
    		runner.next = new_node;
    		new_node.next = head;
    		head = new_node;
    	}
    	else {
    		while (runner.next.data<new_node.data 
    				&& runner.next!=head) {runner = runner.next;}
    		Node temp = runner.next;
    		runner.next = new_node;
    		new_node.next = temp;
    	}  	
    }
    
    // Utility method to print a linked list 
    void printList() 
    { 
        if (head != null) 
        { 
            Node temp = head; 
            do
            { 
                System.out.print(temp.data + " "); 
                temp = temp.next; 
            }  while (temp != head); 
        } 
    } 
  
    // Driver code to test above 
    public static void main(String[] args) 
    { 
        LinkedList list = new LinkedList(); 
  
        // Creating the linkedlist 
        int arr[] = new int[] {12, 56, 2, 11, 1, 90, 0, 100}; 
  
        /* start with empty linked list */
        Node temp = null; 
  
        /* Create linked list from the array arr[]. 
         Created linked list will be 1->2->11->12->56->90*/
        for (int i = 0; i < arr.length; i++) 
        { 
            temp = new Node(arr[i]); 
            list.sortedInsert(temp); 
        } 
  
        list.printList(); 
    }

}



class Node{
	int data;
	Node next;
	Node(int d){
		data = d;
	}
}
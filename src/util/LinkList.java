package util;

import aimoffer.ListNode;

public class LinkList {

	public ListNode addHead(int value){
		ListNode head=new ListNode(value);
		return head;
	}
	
	
	public void add(ListNode head,int value){
		ListNode current=head;
		while(current.next!=null){
			current=current.next;
		}
		current.next=new ListNode(value);
		
	}
	
	public static void printList(ListNode head){
		ListNode current=head;
		while(current!=null){
			System.out.println(current.val);
			current=current.next;
		}
	}

}

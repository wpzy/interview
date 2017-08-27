package aimoffer;
import java.util.ArrayList;

import util.LinkList;

import java.util.*;
public class _3 {
	public static void main(String[] args){

		LinkList l=new LinkList();
		ListNode head=l.addHead(1);
		for(int i=0;i<10;i++){
			l.add(head, i);
		}
		l.printList(head);
		_3 ll=new _3();
		ArrayList result=ll.printListFromTailToHead(head);
	//	Iterator i=result.iterator();
		//while(i.hasNext()){
			//System.out.println(i);
	//	}
		for(int i=0;i<result.size();i++){
			System.out.println(i);
		}
		
		
	}
	
	//反向输出链表
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
    	Stack s=new Stack();
    	ListNode head=listNode;
    	ArrayList result=new ArrayList();
    	while(head!=null){
    		s.push(head.val);
    		head=head.next;
    	}
    	
    	
    	while(s.size()!=0){
    		result.add(s.pop());
    	}
    	
    	return result;
    }

}

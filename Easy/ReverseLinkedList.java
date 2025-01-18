package GeeksForGeeks.Easy;

import org.w3c.dom.Node;

public class ReverseLinkedList {
    Node reverseList(Node head) {
        Node prev = null;
        Node nxt = null;
        Node curr = head;
        
        while(curr != null) {
            nxt = curr.next;
            curr.next = prev;
            
            prev = curr;
            curr = nxt;
        }
        
        return prev;
    }
}

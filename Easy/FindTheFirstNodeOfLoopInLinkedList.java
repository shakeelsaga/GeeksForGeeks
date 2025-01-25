package GeeksForGeeks.Easy;

import org.w3c.dom.Node;

public class FindTheFirstNodeOfLoopInLinkedList {
    public static Node findFirstNode(Node head) {
        if(head == null || head.next == null) return null;
        Node slow = head;
        Node fast = head;
        
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow) break;
        }
        
        if(fast == null || fast.next == null) return null;
        
        slow = head;
        while(fast != slow) {
            fast = fast.next;
            slow = slow.next;
        }
        
        return slow;
    }
}

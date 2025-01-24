package GeeksForGeeks.Medium;

import org.w3c.dom.Node;

public class DetectLoopInLinkedList {
    public static boolean detectLoop(Node head) {
        if(head == null || head.next == null) return false;
        Node slow = head;
        Node fast = head.next.next;
        
        while(fast != null && fast.next != null) {
            if(fast == slow) return true;
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return false;
    }
}

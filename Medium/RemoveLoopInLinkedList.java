package GeeksForGeeks.Medium;

import org.w3c.dom.Node;

public class RemoveLoopInLinkedList {
    public static void removeLoop(Node head) {
        Node slow = head;
        Node fast = head;
        Node prev = null;
        
        while(fast != null && fast.next != null) {
            prev = slow;
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow) {
                Node temp = head;
                while(temp != slow) {
                    prev = slow;
                    slow = slow.next;
                    temp = temp.next;
                }
                prev.next = null;
            }
        }
    }
}

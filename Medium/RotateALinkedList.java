package GeeksForGeeks.Medium;

import org.w3c.dom.Node;

public class RotateALinkedList {
    public Node rotate(Node head, int k) {
        if(head == null || head.next == null || k == 0) return head;
        
        Node current = head;
        int n = 1;
        while(current.next != null) {
            current = current.next;
            n++;
        }
        
        k %= n;
        if(k == 0) return head;
        current.next = head;
        
        for(int i = 0; i < k; i++) {
            current = current.next;
        }
        
        head = current.next;
        current.next = null;
        
        return head;
    }
}

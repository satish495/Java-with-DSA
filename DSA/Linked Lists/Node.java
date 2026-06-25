public class Node {
    int data;
    Node next;

   
    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    public static Node findCycleStart(Node head) {
        if (head == null || head.next == null) {
            return null; 
        }

        Node slow = head;
        Node fast = head;
        boolean hasCycle = false;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                hasCycle = true;
                break;
            }
        }

        if (!hasCycle) {
            return null;
        }

        slow = head; 
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next; 
        }

        return slow; 
    }
   
}


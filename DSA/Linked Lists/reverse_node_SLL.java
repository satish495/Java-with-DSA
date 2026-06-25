public class reverse_node_SLL {
    //Reverse nodes in a singly linked list in groups of K.
    public static Node reverseInGroups(Node head, int k) {
        if (head == null || k <= 1) {
            return head; 
        }

        Node current = head;
        Node prevTail = null;
        Node newHead = null;

        while (current != null) {
            Node groupHead = current;
            Node prev = null;
            int count = 0;

            while (current != null && count < k) {
                Node nextNode = current.next;
                current.next = prev;
                prev = current;
                current = nextNode;
                count++;
            }

            if (newHead == null) {
                newHead = prev; 
            }

            if (prevTail != null) {
                prevTail.next = prev; 
            }

            prevTail = groupHead; 
        }

        return newHead; 
    }
    private static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        int k = 2;

        System.out.print("Original Linked List: ");
        printList(head);

        head = reverseInGroups(head, k);

        System.out.print("Linked List after reversing in groups of " + k + ": ");
        printList(head);
    }
}
public class Remove_NthNode_SLL {
    public static Node removeNthFromEnd(Node head, int n) {
        if (head == null || n <= 0) {
            return head; 
        }

        Node dummy = new Node(0);
        dummy.next = head;
        Node first = dummy;
        Node second = dummy;

        for (int i = 0; i <= n; i++) {
            if (first == null) {
                return head; 
            }
            first = first.next;
        }

        while (first != null) {
            first = first.next;
            second = second.next;
        }

        second.next = second.next.next;

        return dummy.next; 
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        int n = 2;

        System.out.print("Original Linked List: ");
        printList(head);

        head = removeNthFromEnd(head, n);

        System.out.print("Linked List after removing " + n + "th node from the end: ");
        printList(head);
    }

    private static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }
}

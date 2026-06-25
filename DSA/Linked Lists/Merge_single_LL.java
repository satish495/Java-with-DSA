public class Merge_single_LL {
     public static Node mergeSortedLists(Node head1, Node head2) {
        if (head1 == null) {
            return head2;
        }
        if (head2 == null) {
            return head1;
        }

        Node mergedHead;

        if (head1.data <= head2.data) {
            mergedHead = head1;
            mergedHead.next = mergeSortedLists(head1.next, head2);
        } else {
            mergedHead = head2;
            mergedHead.next = mergeSortedLists(head1, head2.next);
        }

        return mergedHead;
    }
    public static void main(String[] args) {
        Node head1 = new Node(1);
        head1.next = new Node(3);
        head1.next.next = new Node(5);

        Node head2 = new Node(2);
        head2.next = new Node(4);
        head2.next.next = new Node(6);

        Node mergedHead = mergeSortedLists(head1, head2);

        System.out.print("Merged Sorted Linked List: ");
        while (mergedHead != null) {
            System.out.print(mergedHead.data + " ");
            mergedHead = mergedHead.next;
        }
        System.out.println();
    }
}

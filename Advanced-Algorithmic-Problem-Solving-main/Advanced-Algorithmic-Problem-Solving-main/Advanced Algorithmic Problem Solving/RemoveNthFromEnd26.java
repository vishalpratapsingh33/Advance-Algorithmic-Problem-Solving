class ListNode {
    int val;
    Node next;
    ListNode(int val) { this.val = val; }
}
public class RemoveNthFromEnd26 {
    public static Node removeNthFromEnd(Node head, int n) {
        Node temp = new Node(0);
        temp.next = head;

        Node first = temp;
        Node second = temp;
        for (int i = 0; i <= n; i++) {
            first = first.next;
        }
        while (first != null) {
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;

        return temp.next;
    }
    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.val + " → ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        int n = 2;

        System.out.print("Original List: ");
        printList(head);

        Node updated = removeNthFromEnd(head, n);

        System.out.print("After Removal: ");
        printList(updated);
    }
}

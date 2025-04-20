class Node {
    int val;
    Node next;
    Node(int x) { val = x; }
}

public class LinkedListIntersection50 {
    public static Node getIntersectionNode(Node headA, Node headB) {
        if (headA == null || headB == null) {
            return null;
        }
        int lenA = getLength(headA);
        int lenB = getLength(headB);
        Node currentA = headA;
        Node currentB = headB;
        if (lenA > lenB) {
            for (int i = 0; i < lenA - lenB; i++) {
                currentA = currentA.next;
            }
        }
        else if (lenB > lenA) {
            for (int i = 0; i < lenB - lenA; i++) {
                currentB = currentB.next;
            }
        }
        while (currentA != null && currentB != null) {
            if (currentA == currentB) {
                return currentA;
            }
            currentA = currentA.next;
            currentB = currentB.next;
        }
        return null;
    }
    private static int getLength(Node head) {
        int length = 0;
        Node current = head;
        while (current != null) {
            length++;
            current = current.next;
        }
        return length;
    }

    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);

        Node node4 = new Node(4);
        Node node5 = new Node(5);

        node1.next = node2;
        node2.next = node3;

        node4.next = node5;
        node5.next = node3;

        Node intersectionNode = getIntersectionNode(node1, node4);

        if (intersectionNode != null) {
            System.out.println("Intersection at node with value: " + intersectionNode.val);
        } else {
            System.out.println("No intersection");
        }
    }
}

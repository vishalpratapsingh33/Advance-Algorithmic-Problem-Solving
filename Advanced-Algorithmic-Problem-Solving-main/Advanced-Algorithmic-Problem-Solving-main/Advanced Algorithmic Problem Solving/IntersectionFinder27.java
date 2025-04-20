class listnode {
    int val;
    listnode next;
    listnode(int val) { this.val = val; }
}

public class IntersectionFinder27 {
    public static listnode getIntersectionNode(listnode headA, listnode headB) {
        listnode a = headA;
        listnode b = headB;

        while (a != b) {
            a = (a == null) ? headB : a.next;
            b = (b == null) ? headA : b.next;
        }

        return a;
    }
    public static void printList(listnode head) {
        while (head != null) {
            System.out.print(head.val + " → ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        listnode intersect = new listnode(7);
        intersect.next = new listnode(9);

        listnode headA = new listnode(1);
        headA.next = new listnode(3);
        headA.next.next = new listnode(5);
        headA.next.next.next = intersect;

        listnode headB = new listnode(2);
        headB.next = intersect;

        listnode result = getIntersectionNode(headA, headB);

        System.out.println("Intersection starts at node: " + (result != null ? result.val : "null"));
    }
}

